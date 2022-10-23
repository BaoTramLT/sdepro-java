package lab_11;

public class Horse extends Animal {
    @Override
    public String species() {
        return "Horse";
    }

    @Override
    public int maxSpeed() {
        return 75;
    }
}

