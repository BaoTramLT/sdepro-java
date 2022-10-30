package lab_11;

import java.security.SecureRandom;
import java.util.List;

public class AnimalController {
    public static List setRandomSpeed (List<Animal> animalList) {
        for (Animal animal : animalList) {
            int randomSpeed = new SecureRandom().nextInt(animal.maxSpeed());
            animal.setSpeed(randomSpeed);
            System.out.println("The speed of " + animal.species() + " is " + animal.getSpeed());
        }
        return animalList;
    }

    public static String caculateSpeed (List<Animal> animalList) {
        int winSpeed = animalList.get(0).getSpeed();
        String winner = animalList.get(0).species();

        for (Animal animal : animalList) {
            if (winSpeed < animal.getSpeed()) {
                winSpeed = animal.getSpeed();
                winner = animal.species();
            }
        }
        return winner;
    }
}
