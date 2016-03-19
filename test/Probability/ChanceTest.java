package Probability;

import Exceptions.InvalidChanceException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ChanceTest {
    @Rule
    public ExpectedException exception = ExpectedException.none();
    @Test
    public void invalidChanceExceptionWillThrowExceptionForInvalidChances() throws Exception{
        exception.expect(InvalidChanceException.class);
        exception.expectMessage("Chance should be greater than 0 but lesser than 1 but got : -1.0");
        Chance.create(-1);
    }
    @Test
    public void invalidChanceExceptionWillThrowExceptionForInvalidChancesFor2() throws Exception{
        exception.expect(InvalidChanceException.class);
        exception.expectMessage("Chance should be greater than 0 but lesser than 1 but got : 2.0");
        Chance.create(2);
    }
    //    @Test
//    public void chanceOfTail_gives_chance_of_getting_tail () throws Exception {
//        Chance chance = ;
//        double chanceOfTail = chance.chanceOfOneFaceOfDice();
//        assertEquals(0.5, chanceOfTail,0);
//    }
//
//    @Test
//    public void chanceOfNotTail_gives_chance_of_not_getting_tail() throws Exception {
//        Chance chance = new Chance();
//        double chanceOfNotTail = chance.chanceOfNotTail();
//        assertEquals(0.5, chanceOfNotTail,0);
//    }
//    @Test
//    public void chanceOfBothAreSame_gives_chance_of_not_getting_tails_when_flipping_two_coins() throws Exception {
//        Chance chance = new Chance();
//        double chanceOfBothAreTail = chance.chanceOfAllSame(2);
//        assertEquals(0.25, chanceOfBothAreTail,0);
//    }
//    @Test
//    public void chanceOfAtleastOne_gives_chance_of_not_getting_tails_when_flipping_two_coins() throws Exception {
//        Chance chance = new Chance();
//        double chanceOfAtleastOne = chance.chanceOfAtleastOne(2);
//        assertEquals(0.75, chanceOfAtleastOne,0);
//    }
//    @Test
//    public void chanceOfAtleastOne_gives_chance_of_not_getting_tails_when_flipping_three_coins() throws Exception {
//        Chance chance = new Chance();
//        double chanceOfAtleastOne = chance.chanceOfAtleastOne(3);
//        System.out.println(chanceOfAtleastOne+"dsjnsdjn");
//        assertEquals(0.875, chanceOfAtleastOne,0);
//    }
}