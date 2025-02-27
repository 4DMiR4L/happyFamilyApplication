package main;

import java.util.List;
import java.util.Set;

public class Fish extends Pet {
    public Fish(Species species, String nickName, int age, int trickLevels, Set<String> habits) {
        super(species, nickName, age, trickLevels, habits);
    }

    @Override
    public void respond() {
        System.out.println("The fish doesn't respond");
    }

    @Override
    public void eat() {
        System.out.println();
    }
}
