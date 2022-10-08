package lab_09;

public class Dog extends Animal{
    @Override
    public String getSpecies() {
        return "Dog";
    }

    @Override
    public int getMaxSpeed() {
        return 60;
    }
}
