package lab_10;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.List;

import static lab_10.Animal.Builder;

public class AnimalBuilderTest {
    public static void main(String[] args) {
        Animal falcon = new Builder().setSpecies("Falcon").setFlying(true).setSpeed(new SecureRandom().nextInt(100)).build();
        Animal bird = new Builder().setSpecies("Bird").setFlying(true).setSpeed(new SecureRandom().nextInt(50)).build();
        Animal dog = new Builder().setSpecies("Dog").setFlying(false).setSpeed(new SecureRandom().nextInt(60)).build();
        Animal lion = new Builder().setSpecies("Lion").setFlying(false).setSpeed(new SecureRandom().nextInt(100)).build();
        Animal wolf = new Builder().setSpecies("Wolf").setFlying(false).setSpeed(new SecureRandom().nextInt(85)).build();

        List<Animal> animalList = Arrays.asList(falcon, bird, dog, lion, wolf);
        System.out.println(animalList);

        Animal winner = new AnimalController().winnerIs(animalList);
        System.out.println("The winner is: " + winner.getSpecies());

    }
}
