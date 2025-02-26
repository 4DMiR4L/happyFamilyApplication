package main.dao;

import main.Family;

import java.util.List;
public class CollectionFamilyDao implements FamilyDao {

    @Override
    public List<Family> getAllFamilies() {
        return List.of();
    }

    @Override
    public Family getFamilyByIndex(int index) {
        return null;
    }

    @Override
    public boolean deleteFamily(int index) {
        return false;
    }

    @Override
    public boolean deleteFamily(Family family) {
        return false;
    }

    @Override
    public void saveFamily(Family family) {

    }
}
