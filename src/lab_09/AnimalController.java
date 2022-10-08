package lab_09;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

public class AnimalController {
    public static List setRandomSpeed (List<Animal> animalList) {
        for (Animal animal : animalList) {
            int randomSpeed = new SecureRandom().nextInt(animal.getMaxSpeed());
            animal.setSpeed(randomSpeed);
            System.out.println("The speed of " + animal.getSpecies() + " is " + animal.getSpeed());
        }
        return animalList;
    }

    public static String caculateSpeed (List<Animal> animalList) {
        int winSpeed = animalList.get(0).getSpeed();
        String winner = animalList.get(0).getSpecies();

        for (Animal animal : animalList) {
            if (winSpeed < animal.getSpeed()) {
                winSpeed = animal.getSpeed();
                winner = animal.getSpecies();
            }
        }
        return winner;

    }

}
