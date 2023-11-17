package org.yu.farm;

public class Chicken extends Animal {


    public Chicken(String name) {

        super(AnimalType.CHICKEN, name);
    }
    public void makeNoise() {
        System.out.println("cluck cluck");
    }
    public void eatUnderYonderTree(){
        System.out.println("Chicken is eating under yonder tree");
    }
}
