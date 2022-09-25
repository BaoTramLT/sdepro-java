package Lab_05;



import java.util.ArrayList;
import java.security.SecureRandom;
import java.util.*;
import java.util.Scanner;

public class SimpleMenu {
    public static void main(String[] args) {

        //Create menu
        System.out.println("=====MENU=====");
        System.out.println("1. Add number into ArrayList");
        System.out.println("2. Print numbers");
        System.out.println("3. Get maximum number");
        System.out.println("4. Get minimum number");
        System.out.println("5. Find your number");


        //Create array list
        List<Integer> myArrList = new ArrayList<>();
        myArrList.add(new SecureRandom().nextInt(100));
        myArrList.add(new SecureRandom().nextInt(100));
        myArrList.add(new SecureRandom().nextInt(100));
        myArrList.add(new SecureRandom().nextInt(100));
        myArrList.add(new SecureRandom().nextInt(100));

        System.out.println("Random number is: " + myArrList);

        //Pick a choice
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please opt: ");
        int option = scanner.nextInt();

        switch (option) {
            case 1:
                System.out.print("Please choose your position to add: ");
                int position = scanner.nextInt();
                while (position > myArrList.size()) {
                    System.out.printf("Please choose position that less than or equal to %d: ", myArrList.size());
                    position = scanner.nextInt();
                }
                System.out.print("Please input your number: ");
                int number = scanner.nextInt();
                myArrList.add(position, number);
                System.out.println("Your array list after input is: " + myArrList);
                break;

            case 2:
                System.out.println("Array list is: " + myArrList);
                break;

            case 3:
                int maxNumber = myArrList.get(0);
                for (int i = 1; i < myArrList.size(); i++) {
                    if (maxNumber < myArrList.get(i)) {
                        maxNumber = myArrList.get(i);
                    }
                }
                System.out.println("Maximum number is: " + maxNumber);
                break;

            case 4:
                int minNumber = myArrList.get(0);
                for (int i = 1; i < myArrList.size(); i++) {
                    if (minNumber > myArrList.get(i)) {
                        minNumber = myArrList.get(i);
                    }
                }
                System.out.println("\nMinimum number is: " + minNumber);
                break;

            case 5:
                System.out.println("Search your number: ");
                int searchNumber = scanner.nextInt();
                if (myArrList.contains(searchNumber)) {
                    System.out.print("Your position of search number is: " + myArrList.indexOf(searchNumber));
                } else {
                    System.out.println("There is no data");
                }

        }

    }

}
