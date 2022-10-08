package lab_09;

public class Horse extends Animal {
    @Override
    public String getSpecies() {
        return "Horse";
    }

    @Override
    public int getMaxSpeed() {
        return 75;
    }
}
