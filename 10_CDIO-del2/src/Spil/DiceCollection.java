package Spil;

import java.util.ArrayList;
import java.util.List;


public class DiceCollection {
    private final List dice;
    public DiceCollection(int sides, int amount) {
        dice = new ArrayList<Die>();
        //Creates die with "Sides" untill "amount" of die has been createt.
        for(int i = 0; i<amount; i++){
            dice.add(new Die(sides));
        }
    }
    public DiceCollection(int amount) {
            dice = new ArrayList<Die>();
            //Creates die with 6 sides untill "amount" of die has been createt.
            for(int i = 0; i<amount; i++){
                dice.add(new Die());
            }

        }
    public DiceCollection() {
        dice = new ArrayList<Die>();
        //Creates die with 6 sides untill 2 die has been createt.
        for(int i = 0; i<2; i++){
            dice.add(new Die());
        }

    }

}
