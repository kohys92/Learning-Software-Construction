package ui;

import model.Coin;

public class Main {

    public static void main(String[] args) {
        Coin myCoin = new Coin();

        myCoin.flip();
        System.out.println(myCoin.checkStatus());
    }
}
