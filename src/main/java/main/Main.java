package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {


        Map<String, String> schedule = new HashMap<>();

        schedule.put("Monday", "Study math");
        schedule.put("Tuesday", "Play football");
        schedule.put("Wednesday", "Read book");
        schedule.put("Thursday", "Dance");
        schedule.put("Friday", "Go to the park");
        schedule.put("Saturday", "Watch TV");
        schedule.put("Sunday", "Rest");

        Pet dog = new Dog(Species.DOG, "a", 75, 6, List.of(new String[]{"eat", "drink", "sleep"}));
        Pet cat = new DomesticCat(Species.DomesticCat, "b", 50, 5, List.of(new String[]{"play", "sleep"}));

        Human mother = new Woman("Jane", "Karleone", 1977, 90, dog,null, (List<List<String>>) schedule);
        Human father = new Man("Vito", "Karleone", 1975, 95, cat, null, (List<List<String>>) schedule);
        Family family = new Family(mother, father, new ArrayList<>(), null);




        Human child = new Human("Michael", "Karleone", 2000, 85, dog, family, schedule);

        child.greetPet();
        child.describePet();

        boolean feed = child.feedPet(true);

        System.out.println(child);

        family.addChild(child);
        System.out.println("Family members count: " + family.countFamily());

        family.deleteChild(child);
        System.out.println("Family members count after deletion: " + family.countFamily());

        System.out.println(family);
    }
}
