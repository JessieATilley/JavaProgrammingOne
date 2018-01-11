package Chapter2;

import java.util.Scanner;

/**
 * Program to accept the user's input for the subtotal and gratuity then Program
 * to get the rate by taking the gratuity and dividing it by 100 times the
 * subtotal then Displaying the result of that.
 *
 * @author Jessie Tilley
 */
public class C2_5 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main3(String[] args) {
        //Declare the Scanner and your main variables 
        Scanner input = new Scanner(System.in);
        double gratRate;
        double subtotal;
        double gratuity;
        //Get the user's values by using the Scanner input 
        System.out.println("Enter the subtotal: ");
        subtotal = input.nextDouble();
        System.out.println("Enter the gratuity: ");
        gratuity = input.nextDouble();
        //Then find the by taking the gratuity and dividing it by 100 times the subtotal and displaying as the total
        gratRate = gratuity / 100 * subtotal;
        double total = gratRate + subtotal;
        System.out.println("Here's the total: " + total);
    }
}
