package lab_03;

import java.util.Arrays;
import java.util.Scanner;

public class MinMaxNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input array length: ");
        int arrLength = scanner.nextInt();

        int[] arrNumber = new int[arrLength];
        int minNumber = arrNumber[0];
        int maxNumber = arrNumber[0];
        for (int i = 0; i < arrLength; i++) {
            arrNumber[i] = i;
        }
        System.out.println("Array number is: ");
        System.out.println(Arrays.toString(arrNumber));
        System.out.println("\n");

        for (int i = 0; i < arrLength; i++) {
            arrNumber[i] = i;
            {
                if(arrNumber[i] < minNumber) {
                minNumber = arrNumber[i];

                }else if (arrNumber[i] > maxNumber) {
                maxNumber = arrNumber[i];
                }
            }
        }
        System.out.printf("Min number is: %d", minNumber);
        System.out.printf("\nMax number is: %d", maxNumber);

    }
}
