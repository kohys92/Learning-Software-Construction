package ca.ubc.cs.cpsc210.integerset.ui;

import ca.ubc.cs.cpsc210.integerset.model.IntegerSet;

/**
 * Very simple app to demonstrate *use* of IntegerSet
 */
public class IntegerSetUsage {
    public static void main(String[] args) {
        IntegerSet mySet = new IntegerSet();
        mySet.insert(3);
        mySet.remove(3);
    }
}
