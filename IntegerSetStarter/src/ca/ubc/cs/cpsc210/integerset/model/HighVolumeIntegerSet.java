package ca.ubc.cs.cpsc210.integerset.model;

import java.util.Collection;
import java.util.HashSet;

public class HighVolumeIntegerSet implements IntegerSet{

    Collection data;

    public HighVolumeIntegerSet(){
        data = new HashSet<Integer>();
    }

    // EFFECTS: return the number of integers in the set
    @Override
    public int size() {
        return data.size();
    }

    // EFFECTS: return true if an Integer is in the set, false otherwise
    @Override
    public boolean contains(Integer anInteger) {
        return data.contains(anInteger);
    }

    // MODIFIES: this
    // EFFECTS: insert an Integer into the set, if it is not already there,
    @Override
    public void insert(Integer anInteger) {
        data.add(anInteger);
    }

    // REQUIRES: an Integer is in the set (contains(anInteger) is true)
    // MODIFIES: this
    // EFFECTS: remove anInteger from the set
    @Override
    public void remove(Integer anInteger) {
        data.remove(anInteger);
    }
}
