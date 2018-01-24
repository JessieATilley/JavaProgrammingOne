package Chapter7;

import java.util.Scanner;
import java.util.Arrays;

/**
 * Program to accept 10 user inputs, place them in an array, sort it and display
 * the minimum
 *
 * @author Jessie Tilley
 */
public class C7_9 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double mini;
        double[] numbers = new double[10];
        System.out.println("Enter ten numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();
        }
        Arrays.sort(numbers);
        mini = numbers[0];
        System.out.printf("Here is the minimum: %.1f/n", mini);
    }
}
