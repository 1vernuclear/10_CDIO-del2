package Spil;


import java.util.ArrayList;

public class DiceCollection {
    ArrayList<Die> diceArray = new ArrayList<>();

    public DiceCollection(int sides, int amount) {
        //Creates die with variable "Sides" until variable "amount" of die has been created.
        for (int i = 0; i < amount; i++) {
            Die die = new Die(sides);
            diceArray.add(new Die(sides));
        }
    }

    public DiceCollection(int amount) {
        /*
          Creates die with 6 sides until variable "amount" of die has been created.
          If there has not been set a variable amount of sides. Creates die with 6 sides if nothing else is specified.
         */
        for (int i = 0; i < amount; i++) {
            diceArray.add(new Die());
        }

    }

    public DiceCollection() {
        /*
         * Creates die with 6 sides until 2 die has been created.
         * Creates 2 die if nothing else is specified with 6 sides.
         */
        for (int i = 0; i < 2; i++) {
            diceArray.add(new Die());
        }

    }
    //Roll of the die
    public void roll() {
        diceArray.forEach(Die::rollDie);
    }

    public ArrayList<Die> getDiceArray() {
        return diceArray;
    }


}

