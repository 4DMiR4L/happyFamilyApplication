package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Family {
    private Human mother;
    private Human father;
    private List<Human> children = new ArrayList<>();
    private Pet pet;

    public Family(Human mother, Human father, List<Human> children, Pet pet) {
        this.mother = mother;
        this.father = father;
        this.children = children;
        this.pet = pet;
    }

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public List<Human> getChildren() {
        return children;
    }

    public void setChildren(List<Human> children) {
        this.children = children;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Family family)) return false;
        return Objects.equals(mother, family.mother) && Objects.equals(father, family.father) && Objects.equals(children, family.children) && Objects.equals(pet, family.pet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mother, father, children, pet);
    }

    public void addChild(Human child) {
        if (!children.contains(child)) {
            children.add(child);
            child.setFamily(this); // Çocuğun ailesini güncelle
            System.out.println(child.getName() + " added to the family.");
        } else {
            System.out.println(child.getName() + " is already in the family.");
        }
    }


    public void deleteChild(Human child) {


        if (children.contains(child)) {
            children.remove(child);
            child.setFamily(null);
        } else {
            System.out.println("Child not found in the list.");
        }
    }


    public int countFamily() {
        return 2 + children.size();
    }

    @Override
    public String toString() {
        return "Family{" +
                "mother=" + mother +
                ", father=" + father +
                ", children=" + children +
                ", pet=" + pet +
                '}';
    }
}
