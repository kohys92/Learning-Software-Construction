package ca.ubc.cs.cpsc210.integerset.model;

public interface IntegerSet {
    // EFFECTS: return the number of integers in the set
    int size();

    // EFFECTS: return true if an Integer is in the set, false otherwise
    boolean contains(Integer anInteger);

    // MODIFIES: this
    // EFFECTS: insert an Integer into the set, if it is not already there,
    void insert(Integer anInteger);

    // REQUIRES: an Integer is in the set (contains(anInteger) is true)
    // MODIFIES: this
    // EFFECTS: remove anInteger from the set
    void remove(Integer anInteger);
}
