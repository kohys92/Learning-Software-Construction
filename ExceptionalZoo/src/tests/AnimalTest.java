package tests;

import exceptions.AllergyException;
import exceptions.NotHungry;
import model.Animal;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

public class AnimalTest {

    @Test
    public void eatIsHungryNotAllergic() {
        //expecting eatenTimes to be 1, and no exceptions thrown.
        Animal animal = new Animal(true, false);
        int eatenTimes = 0;

        try{
            eatenTimes = animal.eat();
        } catch (NotHungry e) {
            fail("Got not hungry when we shouldn't have");
        } catch (AllergyException e) {
            fail("Got allergic when shouldn't have");
        }

        assertTrue(eatenTimes==1);
    }

    @Test
    public void eatNotHungryNotAllergic() {
        //expecting a NotHungry exception to be thrown
        //and for eatenTimes to remain 0
        Animal animal = new Animal(false, false);
        int eatenTimes = 0;

        try{
            eatenTimes = animal.eat();
        } catch (NotHungry e) {
            //don't have to do anything here!
        } catch (AllergyException e) {
            fail("Got allergic when shouldn't have");
        }

        assertTrue(eatenTimes==0);
    }

    @Test
    public void eatIsHungryIsAllergic() {
        //expecting an allergic exception to be thrown
        //and for eatenTimes to remain 0
        Animal animal = new Animal(true, true);
        int eatenTimes = 0;

        try{
            eatenTimes = animal.eat();
        } catch (NotHungry e) {
            fail("Got NotHungry when we shouldn't have");
        } catch (AllergyException e) {
            //don't have to do anything here
        }

        assertTrue(eatenTimes==0);
    }

    @Test
    public void eatNotHungryIsAllergic() {
        //expecting a NotHungry exception to be thrown
        //and for eatenTimes to remain 0
        Animal animal = new Animal(false, true);
        int eatenTimes = 0;

        try{
            eatenTimes = animal.eat();
        } catch (NotHungry e) {
            //expecting NotHungry exception get caught first
        } catch (AllergyException e) {
            fail("not hungry exception should have caught first!");
        }

        assertTrue(eatenTimes==0);
    }
}
