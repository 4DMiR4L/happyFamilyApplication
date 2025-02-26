package main;

public enum Species {
    DOG(false, 4, true),
    RoboCat(false, 4, true),
    DomesticCat(false, 4, true),
    FISH(false, 0, false),
    UNKNOWN(false, 0, false);

    private final boolean canFly;
    private final int numberOfLegs;
    private final boolean hasFur;

    Species(boolean canFly, int numberOfLegs, boolean hasFur) {
        this.canFly = canFly;
        this.numberOfLegs = numberOfLegs;
        this.hasFur = hasFur;
    }

    public boolean CanFly() {
        return canFly;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public boolean HasFur() {
        return hasFur;
    }
}
