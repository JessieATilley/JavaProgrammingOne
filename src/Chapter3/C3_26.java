package Chapter3;

import java.util.Scanner;

/**
 * Program to accept a value from the user and take modulus and compare to 0
 * then Program to display "True," or "False," to the console
 *
 * @author Jessie Tilley
 */
public class C3_26 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double inp;
        System.out.println("Please enter a value: ");
        inp = input.nextDouble();
        System.out.print("Can" + inp + " be divided by both 5 and 6? ");
        System.out.println(((inp % 5.0 == 0) && (inp % 6.0 == 0)) ? "true" : "false");
        System.out.print("Can" + inp + " be divided by 5 or 6? ");
        System.out.println(((inp % 5.0 == 0) || (inp % 6.0 == 0)) ? "true" : "false");
        System.out.print("Can" + inp + " be divided by 5 or 6, but not both? ");
        System.out.println(((inp % 5.0 == 0) ^ (inp % 6.0 == 0)) ? "true" : "false");
    }
}
