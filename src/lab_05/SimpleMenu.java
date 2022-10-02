package lab_05;



import com.sun.org.apache.bcel.internal.generic.SWITCH;

import java.util.ArrayList;
import java.security.SecureRandom;
import java.util.*;
import java.util.Scanner;

public class SimpleMenu {
    public static void main(String[] args) {

        List<Integer> myArrayList = new ArrayList<>();
        boolean isContinuing = true;
        while(isContinuing) {
            printGameMenu();
            int option = getOption();

            switch (option) {
                case 0:
                    isContinuing = false;
                    break;
                case 1:
                    addNumberToArrayList(myArrayList);
                    break;
                case 2:
                    printArrayList(myArrayList);
                    break;
                case 3:
                    int maxNumber = getMaxNumber(myArrayList);
                    System.out.println(maxNumber);
                    break;
                case 4:
                    int minNumber = getMinNumber(myArrayList);
                    System.out.println(minNumber);
                    break;
                case 5:
                    searchNumber(myArrayList);
                    break;
                case 6:
                    resetArrayList(myArrayList);
                    break;
                default:
                    System.out.println("Wrong option");
            }
        }
    }

    private static void printGameMenu() {
        System.out.println("=====MENU=====");
        System.out.println("1. Add number into ArrayList");
        System.out.println("2. Print numbers");
        System.out.println("3. Get maximum number");
        System.out.println("4. Get minimum number");
        System.out.println("5. Find your number");
        System.out.println("6. Reset Array List");
        System.out.println("0. Exit");
    }

    private static int getOption() {
        System.out.println("Please choose your option: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static void addNumberToArrayList(List<Integer> myArrayList) {
        System.out.println("How many number that you want to input: ");
        Scanner scanner = new Scanner(System.in);
        int numerOfArray = scanner.nextInt();
        for (int i = 0; i < numerOfArray; i++) {
            System.out.print("Please enter the number " +(i+1) + ": ");
            int number = scanner.nextInt();
            myArrayList.add(number);
        }
    }

    private static void printArrayList(List<Integer> myArrayList) {
        System.out.println(myArrayList);
    }

    private static int getMaxNumber(List<Integer> myArrayList) {
        int maxNumber = myArrayList.get(0);
        for (int i = 0; i < myArrayList.size(); i++) {
            if (maxNumber < myArrayList.get(i)) {
                maxNumber = myArrayList.get(i);
            }
        }
        return (maxNumber);
    }

    private static int getMinNumber(List<Integer> myArrayList) {
        int minNumber = myArrayList.get(0);
        for (int i = 0; i < myArrayList.size(); i++) {
            if (minNumber > myArrayList.get(i)) {
                minNumber = myArrayList.get(i);
            }
        }
        return (minNumber);
    }

    private static int searchNumber(List<Integer> myArrayList) {
        System.out.print("Search your number: ");
        Scanner scanner = new Scanner(System.in);
        int searchNumber = scanner.nextInt();
        if (myArrayList.contains(searchNumber)) {
            System.out.println("Your position of search number is: "+myArrayList.indexOf(searchNumber));
        }
        else {
            System.out.println("There is no data");
        }
        return(myArrayList.indexOf(searchNumber));
    }

    private static void resetArrayList(List<Integer> myArrayList) {
        myArrayList.clear();
        System.out.println("Your array list is clear now");
    }

}

