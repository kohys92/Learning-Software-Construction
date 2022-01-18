package model;

import java.util.Random;

public class Coin {
    private Random ran;
    private boolean coinFaceUp;

    //MODIFIES: this
    //EFFECTS: changes the state of the coin head/tail
    public void flip(){
        ran = new Random();
        coinFaceUp = ran.nextBoolean();
    }

    //EFFECTS: returns the status of the coin
    public String checkStatus() {
        if(coinFaceUp){
            return "Head";
        }
        return "Tail";
    }

}

