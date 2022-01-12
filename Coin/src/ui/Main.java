package ui;

import model.Coin;

public class Main {

    public static void main(String[] args) {
        Coin myCoin = new Coin();
        System.out.println(myCoin.checkStatusForHead());

        myCoin.flip();
        System.out.println(myCoin.checkStatusForHead());

    }
}
