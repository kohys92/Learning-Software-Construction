package model;

public class Animal {
    private boolean isHungry = true;
    private boolean hungry;
    private int eaten=0;

    //REQUIRES: animal to be hungry
    public int eat() {
        System.out.println("Animal is eating!");
        isHungry = false;
        eaten++;
        return eaten;
    }

    public boolean isHungry() {
        return hungry;
    }
}
