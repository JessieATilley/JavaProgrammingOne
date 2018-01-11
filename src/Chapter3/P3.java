package Chapter3;

import java.util.Scanner;

/**
 * Program to accept a user's input for two numbers between 1 and 100 then
 * Program a series of if statements that compare the First input to the Second
 * input that will display a string Being A) First is less than Second, B) First
 * greater than Second, C) First equal to Second, D) First greater than or equal
 * to Second, E) First less than or equal to Second, F) First not equal to
 * Second then Program to find if the inputs are proper functions and can be
 * divided by 0 and check the grade of the inputs then Program to check if the
 * inputs are within the range (1 to 100)
 *
 * @author Jessie Tilley
 */
public class P3 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double firstNum;
        double secondNum;
        //User input
        System.out.println("Give me a number between 1 and 100: ");
        firstNum = input.nextDouble();
        System.out.println("Give me a number between 1 and 100: ");
        secondNum = input.nextDouble();
        //Less than, Greater than, Equal to, and Not Equal to
        if (firstNum < secondNum) {
            System.out.println("The first number is less than the second number");
        } else;
        if (firstNum > secondNum) {
            System.out.println("The first number is greater than the second number");
        } else;
        if (firstNum == secondNum) {
            System.out.println("The first number is equal the second number");
        } else;
        if (firstNum <= secondNum) {
            System.out.println("The first number is less than or equal to the second number");
        } else;
        if (firstNum != secondNum) {
            System.out.println("The first number is not equal to the second number");
        } else;
        // Divde By Zero and Proper/Improper Function
        if (secondNum == 0) {
            System.out.println("Cannot divide by zero");
        } else if ((firstNum / secondNum) < 1) {
            System.out.println("Proper function");
        } else {
            System.out.println("Improper function");
        }
        // Grade
        if (firstNum >= 90) {
            System.out.println("A");
        } else if (firstNum >= 80) {
            System.out.println("B");
        } else if (firstNum >= 70) {
            System.out.println("C");
        } else if (firstNum >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
        //In or out of range
        if ((secondNum > 1) && (secondNum < 100)) {
            System.out.println("In range");
        } else {
            System.out.println("Out of range");
        }
    }
}
