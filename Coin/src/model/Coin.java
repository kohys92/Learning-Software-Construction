package model;

public class Coin {

    private boolean head;

    public Coin(){
        this.head = true;
    }

    //REQUIRES: nothing
    //MODIFIES: this
    //EFFECTS: changes the state of the coin head/tail
    public void flip(){
        this.head = ! this.head;
    }

    //EFFECTS: returns the status of the coin
    public boolean checkStatusForHead() {
        return this.head;
    }

}

