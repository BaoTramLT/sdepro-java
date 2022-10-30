package lab_12_13;

import java.security.SecureRandom;

public class Horse implements FlyAble, MoveAble{

    private int speed;

    public Horse () {
        speed = new SecureRandom().nextInt(100);
    }

    @Override
    public boolean isFlyAble() {
        return false;
    }

    @Override
    public int speed() {
        return this.speed;
    }

    @Override
    public String toString() {
        return isFlyAble() + " " + speed();
    }
}

