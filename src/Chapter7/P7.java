package Chapter7;

import java.util.Scanner;
import java.util.Arrays;

/**
 * Program to accept a custom length for an array and it's values (separate
 * method) then Program a method that finds the average of the array then
 * Program to display the array and it's average
 *
 *
 *
 * @author Jessie Tilley
 */
public class P7 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the first array: ");
        int arrayLength = input.nextInt();
        int[] arrayList = new int[arrayLength];
        arrayList = arrayValues(arrayList);
        double average = arrayAvg(arrayList);
        showArray(arrayList, average);
    }

    /**
     * This method stores a user's input into the array until it is full
     *
     * @param array represents a list of values
     * @return the array that the user entered
     */
    public static int[] arrayValues(int[] array) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < array.length; ++i) {
            System.out.println("Enter the value: ");
            array[i] = input.nextInt();
        }
        return array;
    }

    /**
     * This method gets the average of the array
     *
     * @param array represents a list of values
     * @return a double that is the average of the array
     */
    public static double arrayAvg(int[] array) {
        double avg = 0;
        for (int i = 0; i < array.length; ++i) {
            avg += array[i];
        }
        double avgTotal = avg / array.length;
        return avgTotal;
    }

    /**
     * This method is designed to show the array and it's average
     *
     *
     * @param array represents a list of values
     * @param number
     */
    public static void showArray(int[] array, double number) {
        System.out.println("Here is your array: ");
        for (int i = 0; i < array.length; ++i) {
            System.out.print(array[i]);
            System.out.print(" ");
        }
        System.out.println("Here is your average: " + number);
    }
}
