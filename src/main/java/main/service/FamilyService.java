package main.service;

import main.Family;
import main.dao.FamilyDao;

import java.util.List;

public class FamilyService {
    private FamilyDao familyDao;

    public FamilyService(FamilyDao familyDao) {
        this.familyDao = familyDao;
    }

    public List<Family> getAllFamily() {
        return familyDao.getAllFamilies();
    }

    public void displayFamily(Family family) {}
}
