package Lab_02;

import java.util.Scanner;

public class CalculateBMI {

    public static void main(String[]args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input your weight and height: ");

        double weight = scanner.nextDouble();
        double height = scanner.nextDouble();
        double BMI = weight/(height*2);

        if (BMI < 18.5) {
            System.out.println("Your are Underweight");
            System.out.println("Please try to eat more to gain a normal weight");
        }

        else if (BMI <= 24.9) {
            System.out.println("Congrats! You have a normal weight");
        }

        else if(BMI <= 29.9) {
           System.out.println("Your are Overweight");
           System.out.println("Please try to workout more to get a normal weight");
        }

        else {
            System.out.println("You are Obesity");
            System.out.println("Please try to workout more to get a normal weight");
        }
    }
}
