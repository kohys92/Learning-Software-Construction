package model;

import exceptions.AllergyException;
import exceptions.NotHungry;

public class Animal {
    private boolean isHungry = true;
    private boolean isAllergic = false;
    private boolean hungry;
    private int eaten=0;

    //REQUIRES: animal to be hungry
    public int eat() throws NotHungry, AllergyException {
        if(!isHungry){
            System.out.println("Animal not hungry!");
            throw new NotHungry();
        }
        if(!isAllergic){
            System.out.println("Animal allergic!");
            throw new AllergyException();
        }
        System.out.println("Animal is eating!");
        isHungry = false;
        eaten++;
        return eaten;
    }

    public boolean isHungry() {
        return hungry;
    }
}
