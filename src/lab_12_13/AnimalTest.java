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

         List flyAblesAnimal = controller.unableToFlyList(Arrays.asList(horse, tiger, dog, falcon));
         System.out.println(flyAblesAnimal);
         MoveAble winner = controller.winnerIs(flyAblesAnimal);
         System.out.println(winner);
    }
}
