package lab_03;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Scanner;

public class SortArray {

    public static void main(String[] args) {

        Scanner scannerArrLength = new Scanner(System.in);
        System.out.println("Please input an array length: ");
        int arrLength = scannerArrLength.nextInt();
        int[] arrNumber = new int[arrLength];
        int temp;
        for (int i = 0; i < arrLength; i++) {
            int randomNumber = new SecureRandom().nextInt(100);
            arrNumber[i] = randomNumber;
        }
        System.out.println("\nYour random number is: ");
        System.out.println(Arrays.toString(arrNumber));
        System.out.println("\n");

        for (int i = 0; i < (arrLength - 1); i++) {
            for (int j = 0; j < arrLength - i - 1; j++) {
                if (arrNumber[j] > arrNumber[j+1]) {
                    temp = arrNumber[j];
                    arrNumber[j] = arrNumber[j+1];
                    arrNumber[j+1] = temp;
                }
             }
        }
        System.out.println("The sorted array is: ");
        for (int i = 0; i < arrLength; i++);
        System.out.println(Arrays.toString(arrNumber));
    }
}
