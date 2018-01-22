package Chapter6;

import java.util.Scanner;

/**
 * Program to have the user enter a password must contain at least eight
 * characters, consist of only letters and numbers and consist two digits
 * then Program 
 *
 * @author Jessie Tilley
 */
public class C6_18 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Password must have at least eight characters. \n");
        System.out.print("Password consists of only letters and numbers. \n");
        System.out.print("Password must contain at least two digits. \n");
        System.out.println("Enter a password: ");
        String s = input.next();

        if (passCheckL(s) == false || passCheckLD(s) == false || passCheckTwoD(s) == false) {
            System.out.println("Invaild password!!");
        }
        if (passCheckL(s) == true && passCheckLD(s) == true && passCheckTwoD(s) == true) {
            System.out.printf("Your password meets all the standards. Here is your password: %s", s);
        }
    }

    /**
     * This method checks the length of the password
     *
     * @param password is the user's inputed password
     * @return a boolean that says it passes the check or not
     */
    public static boolean passCheckL(String password) {
        if (password.length() < 8) {
            return false;
        } else {
            return true;
        }
    }

    /**
     * This method checks if the password is a digit or a letter
     *
     * @param password is the user's inputed password
     * @return a boolean that says it passes the check or not
     */
    public static boolean passCheckLD(String password) {
        for (int i = 0; i < password.length(); i++) {
            if (!Character.isLetterOrDigit(password.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    /**
     * This method checks if the password has two digits within it
     *
     * @param password is the user's inputed password
     * @return a boolean that says it passes the check or not
     */
    public static boolean passCheckTwoD(String password) {
        int check = 0;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                check++;
            }
        }
        if (check >= 2) {
            return true;
        } else {
            return false;
        }
    }
}