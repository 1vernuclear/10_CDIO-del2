package Spil;

import static java.lang.Math.signum;

public class Player {
    private String playerName;
    private Account balance;

    public Player (String name, int startingScore){
        this.playerName = name;
        this.balance = new Account(startingScore);
    }

    public int updateScore (int amount){
        if (signum(amount) == -1){                  //signum method, returns -1 if amount is negative.
            balance.subtractFromBalance(amount);
        }
        else {
            balance.addToBalance(amount);
        }
        return balance.getBalance();
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }
}
