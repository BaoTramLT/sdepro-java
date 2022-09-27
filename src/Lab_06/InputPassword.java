package Lab_06;


import java.util.Scanner;

public class InputPassword {
    public static void main(String[] args) {

        String myPassword = "password123";

        System.out.println("Please input your password: ");
        Scanner scanner = new Scanner(System.in);
        String password = scanner.next();

        for(int i = 0; i < 3; i++) {
            if (myPassword.equals(password) && i <= 3) {
                System.out.println("Login success");
                break;
            } else if (i < 2) {
                System.out.println("Wrong password. Try again");
                password = scanner.next();
            }
            else {
                System.out.println("Your account is blocked");
            }
        }
    }
}
