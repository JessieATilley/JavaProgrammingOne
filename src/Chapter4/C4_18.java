package Chapter4;

import java.util.Scanner;

/**
 * Program to accept a user's input that is converted to a char that runs
 * through an if statement and a set of switch statements
 *
 * @author Jessie Tilley
 */
public class C4_18 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter M or C or I and 1, 2, 3, or 4: ");
        String s = input.next().toUpperCase();
        char num = s.charAt(1);
        char letter = s.charAt(0);
        if ((letter == 'M' || letter == 'C' || letter == 'I') && (num == '1' || num == '2' || num == '3' || num == '4')) {
            switch (letter) {
                case 'M':
                    System.out.print("Mathematics ");
                    break;
                case 'C':
                    System.out.print("Computer Science ");
                    break;
                case 'I':
                    System.out.print("IT ");
                    break;
            }
            switch (num) {
                case '1':
                    System.out.println("Freshman");
                    break;
                case '2':
                    System.out.println("Sophomore");
                    break;
                case '3':
                    System.out.println("Junior");
                    break;
                case '4':
                    System.out.println("Senior");
                    break;
            }
        } else {
            System.out.println("Invaild input");
        }
    }
}
