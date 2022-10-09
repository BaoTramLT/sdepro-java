package lab_10;
import java.util.Arrays;
import java.util.List;

import static lab_10.Animal.Builder;

public class AnimalBuilderTest {
    public static void main(String[] args) {
        Builder builder = new Builder();
        Animal falcon = builder.setSpecies("Falcon").setFlying(true).build();
        Animal bird = builder.setSpecies("Bird").setFlying(true).build();
        Animal dog = builder.setSpecies("Dog").setFlying(false).build();
        Animal lion = builder.setSpecies("Lion").setFlying(false).build();
        Animal wolf = builder.setSpecies("Wolf").setFlying(false).build();

        List<Animal> animalList = Arrays.asList(falcon, bird, dog, lion, wolf);
        List<Animal> getAnimalRacing = AnimalController.getAnimalRacing(animalList);
        List<Animal> getRandomNumber = AnimalController.getRandomNumber(getAnimalRacing);

        System.out.println("The winner is: " + AnimalController.winnerIs(getRandomNumber));

    }
}
