package ca.ubc.cs.cpsc210.integerset.model;

import java.util.ArrayList;

/*
 * Represents a set of integers
 */
public class IntegerSet {

    // EFFECTS: make an empty set
    public IntegerSet() {
        //stub

    }

    // EFFECTS: return the number of integers in the set
    public int size () {
        //stub

    }

    // EFFECTS: return true if an Integer is in the set, false otherwise
    public boolean contains (Integer anInteger) {
        // stub
    }

    // MODIFIES: this
    // EFFECTS: insert an Integer into the set, if it is not already there
    public void insert(Integer anInteger) {
        // stub
    }

    // REQUIRES: an Integer is in the set (contains(anInteger) is true)
    // MODIFIES: this
    // EFFECTS: remove anInteger from the set
    public void remove(Integer anInteger) {
        // stub
    }
}
