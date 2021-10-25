package Spil;

import java.util.Scanner;

public class GameLogic {
    private final Scanner userinput = new Scanner(System.in);

    private final SquareList square = new SquareList();

    private final Dice dice = new Dice();

    private boolean playerBelow3000 = true;

    private Player player1;
    private Player player2;

    private final Player[] players = new Player[2];


    public void play(){

        gameSetupPlayers();

        while(playerBelow3000){

            //note to self use for each loop
            for (int i = 0; i < players.length && playerBelow3000; i++) {
                playerRollDice(players[i]);

                updatePlayerScore(players[i]);

                if(checkForExtraTurn())
                    extraTurn(players[i]);
            }

        }
    }

    /**
     * Updates players balance.
     * Outputs players new balance to the console.
     * Checks if a player has over 3000 on Account, in which case the playerbelow3000 variable is set to false,
     * which stop the loop ( the game ) from running.
     * @param player takes a Player object as parameter.
     */
    private void updatePlayerScore(Player player){
        System.out.println("This square has the value of " + square.getSquareScore(dice.getRollSum() - 2) + ".");

        System.out.println("Your new balance is: " + player.getBalance() + " + " + square.getSquareScore(dice.getRollSum() - 2));

        player.updateScore(square.getSquareScore(dice.getRollSum() - 2));

        if(!checksGameWon(player)) {
            gameWon(player);
            this.playerBelow3000 = false;
        }else
            System.out.println(player.getPlayerName() + " balance = " + player.getBalance());

    }

    /**
     * A player rolls the dice with a user input.
     * The sum of the roll is set and used to calculate a squarenumber.
     * Each die value is printed to the consoles along with som text.
     * @param player
     */
    private void playerRollDice(Player player){
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
        System.out.println(player.getPlayerName() + " roll dice!");

        userinput.next();

        dice.rollDice();

        dice.setRollSum();

        System.out.println(player.getPlayerName() + " lands on " + square.getSquareName(dice.getRollSum() - 2));
    }

    /**
     * Checks if a player has landed on the werewall.
     * @return returns false unless player is on werewall.
     */
    private boolean checkForExtraTurn(){
        return square.getExtraTurn(dice.getRollSum() - 2);
    }

    /**
     * The extra turn is given if checkForExtraTurn() evaluates to true.
     * Gives the player a new roll and adds to the players balance.
     * @param player
     */
    private void extraTurn(Player player){
        while(checkForExtraTurn()) {
            System.out.println(player.getPlayerName() + " has received an extra turn after landing on the Werewall!");

            playerRollDice(player);

            updatePlayerScore(player);
        }
    }

    /**
     * Gets executed when a player wins.
     * @param player
     */
    private void gameWon(Player player){
        System.out.println(player.getPlayerName() + " balance = " + player.getBalance());

        System.out.print(player.getPlayerName() + "has won the game! :D");
    }

    /**
     * Checks if the players Account balance is above 3000.
     * @param player
     * @return when true a player has won.
     */
    private boolean checksGameWon(Player player){
        return player.getBalance() < 3000;
    }

    /**
     * Creates two Players.
     */
    private void gameSetupPlayers(){
        setPlayerNames();

        System.out.println("Player1: " + this.player1.getPlayerName() + "\tPlayer2: " + this.player2.getPlayerName());
    }

    /**
     * Support method for gameSetupPlayers.
     * The method constructs two player objects, and adds them to the players array.
     * The player constructor gets a name from userinput and the starting balance of 1000 as parameters.
     */
    private void setPlayerNames(){
        System.out.print("Player1 enter name: ");
        this.player1 = new Player(userinput.next(),1000);
        players[0] = this.player1;

        System.out.print("Player2 enter name: ");
        this.player2 = new Player(userinput.next(),1000);
        players[1] = this.player2;
    }

}
