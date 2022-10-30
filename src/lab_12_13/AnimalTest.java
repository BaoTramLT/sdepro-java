package lab_12_13;

import java.util.Arrays;
import java.util.List;

public class AnimalTest {
     public static void main(String[] args) {

         Controller controller = new Controller();
         Dog dog = new Dog();
         Falcon falcon = new Falcon();
         Horse horse = new Horse();
         Tiger tiger = new Tiger();

         List unableToFlyAnimal = controller.unableToFlyList(Arrays.asList(horse, tiger, dog, falcon));
         System.out.println(unableToFlyAnimal);
         MoveAble winner = controller.winnerIs(unableToFlyAnimal);
         System.out.println(winner);
    }
}
