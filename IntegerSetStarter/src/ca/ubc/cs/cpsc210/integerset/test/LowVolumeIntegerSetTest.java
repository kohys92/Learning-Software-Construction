package ca.ubc.cs.cpsc210.integerset.test;

import ca.ubc.cs.cpsc210.integerset.model.LowVolumeIntegerSet;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Unit tests for IntegerSet class
 */
public class LowVolumeIntegerSetTest {
    LowVolumeIntegerSet testSet;

    @Before
    public void setup(){
        testSet = new LowVolumeIntegerSet();
    }


    @Test
    public void testInsertNotThere(){
        checkEmptyDoesntContain(3);
        testSet.insert(3);
        checkSetContainsOnce(3);
    }


    @Test
    public void testInsertAlreadyThere(){
        checkEmptyDoesntContain(3);
        testSet.insert(3);
        checkSetContainsOnce(3);
        testSet.insert(3);
        checkSetContainsOnce(3);
    }

    @Test
    public void testInsertHighVolume() {
        for ( int i=0; i<5000; i ++){
            testSet.insert(i);
            assertTrue(testSet.contains(i));
            assertEquals(testSet.size(), i+1);
        }
    }

    private void checkEmptyDoesntContain(int num) {
        assertEquals(testSet.size(), 0);
        assertFalse(testSet.contains(num));
    }

    private void checkSetContainsOnce(int num) {
        assertEquals(testSet.size(), 1);
        assertTrue(testSet.contains(num));
    }
}