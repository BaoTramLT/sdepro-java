package Lab_06;

import java.util.Arrays;

public class ExtractDigit {
    public static void main(String[] args) {
        String mystr = "100 minutes";
        char[] myCharacters = mystr.toCharArray();
        String number = "";

        for (char character : myCharacters) {
            if (Character.isDigit(character))
                number = number + character;
            }
        System.out.println("Your digit is: " + number);
    }
}

