package main;

import main.controller.FamilyController;
import main.dao.FamilyDao;
import main.dao.FileFamilyDao;
import main.service.FamilyService;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        FamilyDao familyDao = new FileFamilyDao();
        FamilyService familyService = new FamilyService(familyDao);
        FamilyController familyController = new FamilyController(familyService);

        Map<String, String> schedule = new HashMap<>();
        schedule.put("Monday", "Study math");
        schedule.put("Tuesday", "Play football");
        schedule.put("Wednesday", "Read book");
        schedule.put("Thursday", "Dance");
        schedule.put("Friday", "Go to the park");
        schedule.put("Saturday", "Watch TV");
        schedule.put("Sunday", "Rest");


        Pet dog = new Dog(Species.DOG, "a", 75, 6, Set.of("eat", "sleep", "drink"));
        Pet cat = new DomesticCat(Species.DomesticCat, "b", 50, 5, Set.of("eat", "drink", "sleep"));

        Human mother = new Woman("Jane", "Karleone", 1977, 90, cat, null, schedule);
        Human father = new Man("Vito", "Karleone", 1975, 95, dog, null, schedule);

        Family family = new Family(father,mother);
        familyController.createNewFamily(father, mother);

        System.out.println("All families:");
        familyController.displayALLFamily(family);
    }
}