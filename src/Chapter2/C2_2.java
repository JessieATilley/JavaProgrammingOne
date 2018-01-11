package Chapter2;

import java.util.Scanner;

/**
 * Program to accept the user's radius input then retrieve the area. Then
 * then Program to accept the user's length input then display the user's area and
 * length and volume.
 * 
 *
 * @author Jessie Tilley
 */
public class C2_2 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main2(String[] args) {
        Scanner input = new Scanner(System.in);
        double radius;
        System.out.println("Enter the radius: ");
        radius = input.nextDouble();
        double area = radius * radius * 3.14;
        double length;
        System.out.println("Enter the lentgh: ");
        length = input.nextDouble();
        double volume = area * length;
        System.out.println("Here is your area: " + area + " and length: " + length);
        System.out.println("Here is your volume: " + volume);
    }
}
