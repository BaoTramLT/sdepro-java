package lab_12_13;

import java.security.SecureRandom;

public class Tiger implements FlyAble, MoveAble {

    private int speed;

    public Tiger () {
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
