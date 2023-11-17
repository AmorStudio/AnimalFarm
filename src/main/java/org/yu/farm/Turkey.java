package org.yu.farm;

public class Turkey extends Animal {


    protected Turkey( String name) {
        super( AnimalType.TURKEY, name);
    }

    @Override
    public void makeNoise() {
        System.out.println("Gobble Gobble");
    }

    @Override
    public void eatUnderYonderTree() {
        System.out.println(" Turkey is eating under yonder tree");
        super.eatUnderYonderTree();
    }
}
