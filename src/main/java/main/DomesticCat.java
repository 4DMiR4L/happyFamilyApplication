package main;

import java.util.List;

public class DomesticCat extends Pet{
    public DomesticCat(Species species, String nickName, int age, int trickLevels, List<String> habits) {
        super(species, nickName, age, trickLevels, habits);
    }

    @Override
    public void eat() {
        System.out.println();
    }
    @Override
    public void respond() {
        System.out.println("The fish doesn't respond");
    }
}