package lab_10;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

public class AnimalController  {
    public static List getAnimalRacing(List<Animal> animalList) {
        List<Animal> listRacer = new ArrayList<>();
        for (Animal animal : animalList) {
            if (!animal.isFlying()) {
                listRacer.add(animal);
            }
        }
        return listRacer;
    }

    public static List getRandomNumber(List<Animal> animalList) {
        List<Animal> randomNumberList = new ArrayList<>();
        for (Animal animal : animalList) {
            int randomNumber = new SecureRandom().nextInt(100);
            randomNumberList.add(new Animal.Builder().setSpecies(animal.getSpecies()).setSpeed(randomNumber).build());
            System.out.println("The speed of " + animal.getSpecies() + " is " + randomNumber);
        }
        return randomNumberList;
    }

    public static String winnerIs (List<Animal> animalList) {
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
