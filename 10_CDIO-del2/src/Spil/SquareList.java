package Spil;

public class SquareList {

    // Creates a 3 by 11 array that holds the names, + or - values, as well as a boolean for extra turns, for each square in the game
    
    public static String[][] SquareList = {
            {"Tower", "250", "False"},
            {"Crater", "-100", "False"},
            {"PalaceGates", "100", "False"},
            {"ColdDesert", "-20", "False"},
            {"WalledCity", "180", "False"},
            {"Monastery", "0", "False"},
            {"BlackCave", "-70", "False"},
            {"HutsMountain", "60", "False"},
            {"Werewall", "-80", "True"},
            {"Pit", "-50", "False"},
            {"Goldmine", "650", "False"},
    };
    
    // 3 getters for each respective coloumn in the array, to getSquareName, getSquareScore or getExtraTurn from the array.

    static String getSquareName(int square){
        return SquareName.getString(SquareList[square][0]);
    }

    static int getSquareScore(int square){
        int penge = Integer.parseInt(SquareList[square][1]);
        return penge;
    }

    static boolean getExtraTurn(int square){
        return Boolean.parseBoolean(SquareList[square][2]);
    }

}
