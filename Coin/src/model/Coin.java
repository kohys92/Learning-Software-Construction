package model;

public class Coin {
    private int status;

    //MODIFIES: this
    //EFFECTS: changes the state of the coin head/tail
    public void flip(){
        status = (int) Math.round(Math.random());
    }

    //EFFECTS: returns the status of the coin
    public String checkStatus() {
        if(this.status == 1){
            return "Head";
        }
        else{
            return "Tail";
        }
    }

}

