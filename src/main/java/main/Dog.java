package main;

import java.util.List;

public class Dog extends Pet implements Foul {


    public Dog(Species species, String nickName, int age, int trickLevels, List<String> habits) {
        super(species, nickName, age, trickLevels, habits);
    }

    @Override
    public void respond () {
        System.out.println("How!");
    }

    public void foul () {
        System.out.println("The dog makes a mess");

    }
    @Override
    public void eat() {
        System.out.println();
    }
}

