package lab_09;

import java.security.SecureRandom;

public class Animal {
    private String species;
    private int speed;
    private int maxSpeed;

    public String getSpecies() {
        return species;
    }

    public int getSpeed() {
        return speed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

}
