package Chapter7;

import java.util.Scanner;
import java.util.Arrays;

/**
 * Program to accept a user's input that represent the length of two lists then
 * Program to accept a user's input that will placed within the two arrays then
 * Program a method that checks if they identical and display if they are or if
 * they are not
 *
 * @author Jessie Tilley
 */
public class C7_26 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean equal;
        System.out.println("Please enter the length of the arrays: ");
        int length = input.nextInt();
        int[] listOne = new int[length];
        int[] listTwo = new int[length];
        System.out.println("Enter " + length + " values for the first list: ");
        for (int x = 0; x < listOne.length; ++x) {
            listOne[x] = input.nextInt();
        }
        System.out.println("Enter " + length + " values for the second list: ");
        for (int x = 0; x < listTwo.length; ++x) {
            listTwo[x] = input.nextInt();
        }
        equalArray(listOne, listTwo);
    }

    /**
     * This method checks if the two lists are equal and prints if they are
     * identical
     *
     * @param arrayOne represents the first list of values
     * @param arrayTwo represents the second list of values
     */
    public static void equalArray(int[] arrayOne, int[] arrayTwo) {
        boolean correct = false;
        for (int x = 0; x <= arrayOne.length; ++x) {

            if (arrayOne[x] == arrayTwo[x]) {
                correct = true;
            } else {
                correct = false;
            }
        }

        if (correct = true) {

            System.out.print("Your lists are strictly identical.");
        } else {
            System.out.print("Your lists are not. ");
        }
    }
}
