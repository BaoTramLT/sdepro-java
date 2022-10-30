package lab_12_13;

import java.security.SecureRandom;

public class Falcon implements FlyAble, MoveAble {

    private int speed;

    public Falcon () {
        speed = new SecureRandom().nextInt(100);
    }

    @Override
    public boolean isFlyAble() {
        return true;
    }

    @Override
    public int speed() {
        return this.speed();
    }

    @Override
    public String toString() {
        return isFlyAble() + " " + speed();
    }
}
