package Spil;

public class SquareList {

    // Creates a 2-dimensional 3 by 11 array that holds the names, + or - values, as well as a boolean for extra turns, for each square in the game

    private final String[][] SquareList = {
            {"Tower", "250", "False"},
            {"Crater", "-100", "False"},
            {"PalaceGates", "100", "False"},
            {"ColdDesert", "-20", "False"},
            {"WalledCity", "180", "False"},
            {"Monastery", "0", "False"},
            {"BlackCave", "-70", "False"},
            {"HutsintheMountain", "60", "False"},
            {"TheWerewall", "-80", "True"},
            {"Pit", "-50", "False"},
            {"Goldmine", "650", "False"},
    };

    // 3 getters for each respective coloumn in the array, to getSquareName, getSquareScore or getExtraTurn from the array.

    public String getSquareName(int square){
        return SquareList[square][0];
    }

    public int getSquareScore(int square){
        int penge = Integer.parseInt(SquareList[square][1]);
        return penge;
    }

    public boolean getExtraTurn(int square){
        return Boolean.parseBoolean(SquareList[square][2]);
    }

}
