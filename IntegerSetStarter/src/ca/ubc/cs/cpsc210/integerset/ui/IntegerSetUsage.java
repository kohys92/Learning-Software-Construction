package ca.ubc.cs.cpsc210.integerset.ui;

import ca.ubc.cs.cpsc210.integerset.model.ChattyIntegerSet;
import ca.ubc.cs.cpsc210.integerset.model.IntegerSet;
import ca.ubc.cs.cpsc210.integerset.model.LowVolumeIntegerSet;

/**
 * Very simple app to demonstrate *use* of IntegerSet
 */
public class IntegerSetUsage {
    public static void main(String[] args) {
        LowVolumeIntegerSet mySet = new LowVolumeIntegerSet();
        mySet.insert(3);
        mySet.remove(3);

        // Example of using super method from upper class
        IntegerSet chattySet = new ChattyIntegerSet();
        chattySet.insert(5);
    }
}
