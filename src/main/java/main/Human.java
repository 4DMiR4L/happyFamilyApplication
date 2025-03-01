package main;

import java.io.Serializable;
import java.util.Map;
import java.util.Objects;

public class Human implements Serializable {
    private static final long serialVersionUID = 1L;

    private String name;
    private String surname;
    private int dateOfBirth;
    private int IQ;
    private Pet pet;
    private Family family;
    private Map schedule;


    public void greetPet() {
        System.out.println("hello," + pet.getNickName());
    }

    public boolean feedPet(boolean isHungry) {
        if (isHungry) {
            System.out.println("Hm... I will feed " + pet.getNickName());
            pet.eat();
        }
        return true;
    }

    public void describePet() {
        String slyness = pet.getTrickLevels() > 50 ? "very sly" : "almost not sly";
        System.out.println("I have an" + pet.getNickName() + "is" + pet.getAge() + " years old" + "he is" + slyness);
    }

    public Human(String name, String surname, int dateOfBirth, int IQ, Pet pet, Family family, Map schedule) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.IQ = IQ;
        this.pet = pet;
        this.family = family;
        this.schedule = schedule;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getIQ() {
        return IQ;
    }

    public void setIQ(int IQ) {
        this.IQ = IQ;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
    }

    public Map getSchedule() {
        return schedule;
    }

    public void setSchedule(Map schedule) {
        this.schedule = schedule;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Human human)) return false;
        return dateOfBirth == human.dateOfBirth && IQ == human.IQ && Objects.equals(name, human.name) && Objects.equals(surname, human.surname) && Objects.equals(pet, human.pet) && Objects.equals(family, human.family) && Objects.equals(schedule, human.schedule);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, dateOfBirth, IQ, pet, family, schedule);
    }


    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", IQ=" + IQ +
                ", pet=" + pet +
                ", family=" + family +
                ", schedule=" + schedule +
                '}';
    }
}
