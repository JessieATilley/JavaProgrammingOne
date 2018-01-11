package Chapter2;

import java.util.Scanner;

/**
 * Program to take the user's Celsius input and display it in Fahrenheit to the
 * console
 *
 * @author Jessie Tilley
 */
public class C2_1 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        double celsius;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the degree in Celsius: ");
        celsius = input.nextDouble();
        double fahrenheit = (9.0 / 5) * celsius + 32;
        System.out.println(fahrenheit);
    }
}
