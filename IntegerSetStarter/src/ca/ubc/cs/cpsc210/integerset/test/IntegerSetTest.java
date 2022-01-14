package ca.ubc.cs.cpsc210.integerset.test;

import ca.ubc.cs.cpsc210.integerset.model.IntegerSet;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Unit tests for IntegerSet class
 */
public class IntegerSetTest {
    IntegerSet myset;

    @Before
    public void setup() {
        myset = new IntegerSet();
    }

    @Test
    public void testInsertMiddleOfNagRange() {
        myset.insert(-5);
        assertEquals("that's negative!", "that's negative!");
    }
}