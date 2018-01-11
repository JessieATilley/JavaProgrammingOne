package Chapter3;

import java.util.Scanner;

/**
 * Program to accept a user's input to choose Heads or Tails and compare that to
 * a set value then Program to display Correct or Incorrect to the console
 *
 * @author Jessie Tilley
 */
public class C3_14 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        int coinSide = (int) (Math.random() * 2);
        Scanner input = new Scanner(System.in);
        int inp;
        System.out.println("Please enter 0 (Heads) or 1 (Tails): ");
        inp = input.nextInt();
        System.out.println(((coinSide == inp)) ? "Correct" : "Incorrect");
    }
}
