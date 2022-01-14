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
        return 0;

    }

    // EFFECTS: return true if an Integer is in the set, false otherwise
    public boolean contains (Integer anInteger) {
        return false;
    }

    // MODIFIES: this
    // EFFECTS: insert an Integer into the set, if it is not already there,
    // in which case it does nothing.
    // if the number is 0 it returns "that's nothing!"
    // if the number is <0 it returns "that's negative"
    // if the number is >0 it returns "that's positive"
    public String insert(Integer anInteger) {
        // stub
    }

    // REQUIRES: an Integer is in the set (contains(anInteger) is true)
    // MODIFIES: this
    // EFFECTS: remove anInteger from the set
    public void remove(Integer anInteger) {
        // stub
    }
}
