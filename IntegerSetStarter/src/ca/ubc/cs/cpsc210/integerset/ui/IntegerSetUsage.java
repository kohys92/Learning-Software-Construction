package ca.ubc.cs.cpsc210.integerset.ui;

import ca.ubc.cs.cpsc210.integerset.model.LowVolumeIntegerSet;

/**
 * Very simple app to demonstrate *use* of IntegerSet
 */
public class IntegerSetUsage {
    public static void main(String[] args) {
        LowVolumeIntegerSet mySet = new LowVolumeIntegerSet();
        mySet.insert(3);
        mySet.remove(3);
    }
}
