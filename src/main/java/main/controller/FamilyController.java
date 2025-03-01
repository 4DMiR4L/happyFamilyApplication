package main.controller;

import main.Family;
import main.Human;
import main.service.FamilyService;

import java.util.List;

public class FamilyController {
    private FamilyService familyService;

    public FamilyController(FamilyService familyService) {
        this.familyService = familyService;
    }

    public List<Family> getAllFamily() {
        return familyService.getAllFamily();
    }
    public void displayALLFamily(Family family) {
        familyService.displayALLFamily(family);
    }

    public List<Family> getFamiliesBiggerThan(int size) {
        return familyService.getFamiliesBiggerThan(size);
    }

    public List<Family> getFamiliesLessThan(int size) {
        return familyService.getFamiliesSmallerThan(size);
    }

    public List<Family> countFamiliesWithMemberNumber(int size){
        return familyService.countFamiliesWithMemberNumber(size);
    }

    public void createNewFamily(Human father, Human mother){
        familyService.createNewFamily(father, mother);
    }

    public boolean deleteFamilyByIndex(int index){
        return familyService.deleteFamilyByIndex(index);
    }
}
