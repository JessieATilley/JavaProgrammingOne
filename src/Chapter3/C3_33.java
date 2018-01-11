package Chapter3;

import java.util.Scanner;

/**
 * Program to accept a user's input of two packages both weight and price then
 * Program if-else statements to compare the price and weight then Program to
 * display that a) Package 1 is better, b) Package 2 is better or c) they are
 * the same
 *
 * @author Jessie Tilley
 */
public class C3_33 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double onePrice;
        double twoPrice;
        int oneWeight;
        int twoWeight;
        System.out.println("Please enter the price of the package 1: ");
        onePrice = input.nextDouble();
        System.out.println("Please enter the weight of the package 1: ");
        oneWeight = input.nextInt();
        System.out.println("Please enter the price of the package 2: ");
        twoPrice = input.nextDouble();
        System.out.println("Please enter the weight of the package 2: ");
        twoWeight = input.nextInt();
        if ((onePrice / oneWeight) > (twoPrice / twoWeight)) {
            System.out.println("Package 2 has a better price!");
        } else if ((onePrice / oneWeight) < (twoPrice / twoWeight)) {
            System.out.println("Package 1 has a better price!");
        } else {
            System.out.println("Both Package 1 and 2 have the same price.");
        }
    }
}
