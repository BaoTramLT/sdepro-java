package lab_11;

import java.util.Arrays;
import java.util.List;

public class AnimalTest {
     public static void main(String[] args) {
         Animal horse = new Horse();
         Animal tiger = new Tiger();
         Animal dog = new Dog();

         List<Animal> animalList = Arrays.asList(horse, tiger, dog);
         List<Animal> setRandomSpeed = AnimalController.setRandomSpeed(animalList);
         System.out.println("The winner is: " + AnimalController.caculateSpeed(animalList));
    }
}
