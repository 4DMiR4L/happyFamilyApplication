package main.dao;

import main.Family;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileFamilyDao implements FamilyDao {
    private static final String FILE_NAME = "families.txt";
    private List<Family> families = new ArrayList<>();

    @Override
    public List<Family> getAllFamilies() {
        return readFamilies();
    }

    @Override
    public Family getFamilyByIndex(int index) {
        List<Family> families = readFamilies();
        return (index >= 0 && index < families.size()) ? families.get(index) : null;
    }

    @Override
    public boolean deleteFamily(int index) {
        List<Family> families = readFamilies();
        if (index >= 0 && index < families.size()) {
            families.remove(index);
            saveFamilies(families);
            return true;
        }
        return false;
    }

    @Override
    public boolean deleteFamily(Family family) {
        List<Family> families = readFamilies();
        if (families.remove(family)) {
            saveFamilies(families);
            return true;
        }
        return false;
    }

    @Override
    public void saveFamily(Family family) {
        List<Family> families = readFamilies();
        if (!families.contains(family)) {
            families.add(family);
        } else {
            int index = families.indexOf(family);
            families.set(index, family);
        }
        saveFamilies(families);
    }

    private void saveFamilies(List<Family> families) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(families);
        } catch (IOException e) {

            e.printStackTrace();
        }
    }

    private List<Family> readFamilies() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            return (List<Family>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            return new ArrayList<>();
        }
    }
}
