package Probability;

import Exceptions.InvalidChanceException;

/*
    Jobs
        - give the probability of an event
 */
public class Chance {
    private final double chance;

    private Chance(double chance) {
        this.chance = chance;
    }

    public static Chance create(double value) throws InvalidChanceException {
        if (value < 0 || value > 1)
            throw new InvalidChanceException(value);
        return new Chance(value);
    }
    public Chance and(Chance otherChance) throws InvalidChanceException{
        return create(this.chance * otherChance.chance);
    }
    public Chance or(Chance otherChance) throws InvalidChanceException{
        return create(this.chance + otherChance.chance);
    }
    public Chance not(Chance otherChance) throws InvalidChanceException{
        return create(1 - this.chance);
    }
}

//    public double chanceOfOneFaceOfDice() {
//        return (double) 1 / chance;
//    }
//
//    public double chanceOfNotTail() {
//        return (double) 1 - chanceOfOneFaceOfDice();
//    }
////    public double chanceOneForDice() {
////
////    }
//
//    public double chanceOfAllSame(int coins) {
//        double probability = 1.0;
//        for (int i = 0; i < coins; i++) {
//            probability *= chanceOfOneFaceOfDice();
//        }
//        return probability;
//    }
//
//    public double chanceOfAtleastOne(int coins) {
//        return (double) 1 - chanceOfAllSame(coins);
//    }
