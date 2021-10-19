package Spil;

import java.sql.SQLOutput;

public class Square {

    private String SquareName;
    private String SquareDescription;

    //  Constructor  //

    public Square(String squareName, String squareDescription) {
        SquareName = squareName;
        SquareDescription = squareDescription;
    }

    //  Getters

    public String getSquareName() {
        return SquareName;
    }

    public String getSquareDescription() {
        return SquareDescription;
    }
}

