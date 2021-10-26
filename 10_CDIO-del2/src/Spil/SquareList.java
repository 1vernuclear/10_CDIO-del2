package Spil;

public class SquareList {

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
