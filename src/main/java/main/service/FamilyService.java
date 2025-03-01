package main.service;

import main.Family;
import main.Human;
import main.Pet;
import main.dao.FamilyDao;

import java.util.List;
import java.util.stream.Collectors;

public class FamilyService {
    private FamilyDao familyDao;

    public FamilyService(FamilyDao familyDao) {
        this.familyDao = familyDao;
    }

    public List<Family> getAllFamily() {
        return familyDao.getAllFamilies();
    }

    public void displayALLFamily(Family family) {
        List<Family> families = familyDao.getAllFamilies();
        for (Family value : families) {
            System.out.println(value);
        }
    }

    public List<Family> getFamiliesBiggerThan(int size) {
        return familyDao.getAllFamilies().stream().filter(family -> family.countFamily() > size).collect(Collectors.toList());
    }
    public List<Family> getFamiliesSmallerThan(int size) {
        return familyDao.getAllFamilies().stream().filter(family -> family.countFamily() < size).collect(Collectors.toList());
    }

    public List<Family> countFamiliesWithMemberNumber(int size) {
        return familyDao.getAllFamilies().stream().filter(family -> family.countFamily() == size).collect(Collectors.toList());
    }

    public void createNewFamily(Human father, Human mother) {
        Family family = new Family(mother,father);
        familyDao.saveFamily(family);
    }

    public boolean deleteFamilyByIndex(int index) {
        return familyDao.deleteFamily(index);
    }
}
