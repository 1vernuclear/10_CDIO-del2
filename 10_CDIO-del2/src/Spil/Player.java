package Spil;

import static java.lang.Math.signum;

public class Player {
    private final String playerName;
    private final Account balance;

    public Player (String name, int startingScore){
        this.playerName = name;
        this.balance = new Account(startingScore);
    }

    public void updateScore (int amount){
        if (signum(amount) == -1){
            balance.subtractFromBalance(-amount);
        }
        else {
            balance.addToBalance(amount);
        }
    }

    public int getBalance(){
        return balance.getBalance();
    }

    public String getPlayerName() {
        return playerName;
    }

}