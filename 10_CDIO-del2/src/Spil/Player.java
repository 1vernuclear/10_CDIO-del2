package Spil;

public class Player {
    private String playerName;
    private Account score;

    public Player (String name, int score){
        this.playerName = name;
        this.score = new Account(score);
    }
}
