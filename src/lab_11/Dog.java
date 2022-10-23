package lab_11;

public class Dog extends Animal {
    @Override
    public String species() {
        return "Dog";
    }

    @Override
    public int maxSpeed() {
        return 60;
    }
}
