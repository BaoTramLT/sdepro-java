package Lab_03;

import java.util.Arrays;
import java.util.Scanner;

public class CountOddAndEvenNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input array length: ");
        int arrLength = scanner.nextInt();

        int[] arrNumber = new int[arrLength];
        int evenNumber = 0;
        int oddNumber = 0;
        for (int i = 0; i < arrLength; i++) {
            arrNumber[i] = i;
        }
        System.out.println("\nArray integer is: ");
        System.out.println(Arrays.toString(arrNumber));
        System.out.println("\n");

        for (int i = 0; i < arrLength; i++) {
            if (arrNumber[i] % 2 == 0) {
                evenNumber++;
            } else oddNumber++;
        }
        System.out.printf("Even number is: %d", evenNumber);
        System.out.printf("\nOdd number is: %d", oddNumber);

    }
}
