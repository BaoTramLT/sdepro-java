package lab_11;

public abstract class Animal {
    public abstract String species();
    public abstract int maxSpeed();
    private int speed;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

}
