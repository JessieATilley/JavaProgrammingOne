package Chapter4;

import java.util.Scanner;

/**
 * Program to accept several user inputs for two bidders that ask for their
 * name, hours worked, pay rate then Program to times the hours worked by the
 * pay rate then Program to compare the result of it and the hours and display
 * the winner of the bid
 *
 * @author Jessie Tilley
 */
public class P4 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double hourly1, hourly2;
        //Bidder 1
        System.out.println("Bidder 1, please enter your name: ");
        System.out.println("Bidder 1, please enter hours worked: ");
        System.out.println("Bidder 1, please enter charges per hour: ");
        String name1 = input.next();
        int hours1 = input.nextInt();
        double payR1 = input.nextDouble();
        //Bidder 2
        System.out.println("Bidder 2, please enter your name: ");
        System.out.println("Bidder 2, please enter hours worked: ");
        System.out.println("Bidder 2, please enter charges per hour: ");
        String name2 = input.next();
        int hours2 = input.nextInt();
        double payR2 = input.nextDouble();
        //Hourly
        hourly1 = hours1 * payR1;
        hourly2 = hours2 * payR2;
        //If statements
        if (hourly1 < hourly2) {
            System.out.printf("The winner is: %s, %.2f", name1, hourly1);
        } else if (hourly2 < hourly1) {
            System.out.printf("The winner is: %s, %.2f", name2, hourly2);
        } else if ((hourly1 == hourly2) && (hours1 < hours2)) {
            System.out.printf("The winner is: %s, %.2f, %d", name1, hourly1, hours1);
        } else if ((hourly1 == hourly2) && (hours2 < hours1)) {
            System.out.printf("The winner is: %s, %.2f, %d", name2, hourly2, hours2);
        } else if ((hourly1 == hourly2) && (hours2 == hours1)) {
            System.out.printf("They have identical bids: %s, %.2f, %d, %s, %.2f, %d", name1, hourly1, hours1, name2, hourly2, hours2);
        } else;
    }
}
