package lab_10;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

public class AnimalController  {
    private List getAnimalRacing(List<Animal> animalList) {
        List<Animal> listRacer = new ArrayList<>();
        for (Animal animal : animalList) {
            if (!animal.isFlying()) {
                listRacer.add(animal);
            }
        }
        return listRacer;
    }

    public Animal winnerIs (List<Animal> animalList) {

        List<Animal> listRacer = getAnimalRacing(animalList);
        Animal winner = animalList.get(0);
        for (Animal animal : listRacer) {
            if (animal.getSpeed() < winner.getSpeed()) {
               winner = animal;
            }
        }
        return winner;
    }
}
