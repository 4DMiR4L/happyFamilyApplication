package main;

import java.util.List;
import java.util.Set;

public class RoboCat extends Pet {
    public RoboCat(Species species, String nickName, int age, int trickLevels, Set<String> habits) {
        super(species, nickName, age, trickLevels, habits);
    }

    @Override
    public void respond () {
        System.out.println("meow");
    }
    @Override
    public void eat() {
        System.out.println();
    }



}
