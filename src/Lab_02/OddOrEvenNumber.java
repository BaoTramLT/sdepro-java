package Lab_02;

import java.util.Scanner;

public class OddOrEvenNumber {
    public static void main(String[]args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please input a number: ");
        int number = scanner.nextInt();

        if (number%2==0) System.out.println("La so chan");
        else System.out.println("La so le");

    }
}
