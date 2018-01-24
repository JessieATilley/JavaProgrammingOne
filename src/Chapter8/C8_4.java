package Chapter8;

import java.util.Scanner;

/**
 * Program to display an array of integers that is in line with the days of the
 * week and the number of the employee
 * 
 * @author Jessie Tilley
 */
public class C8_4 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] weekHours = {{2, 4, 3, 4, 5, 8, 8}, {7, 3, 4, 3, 3, 4, 4}, {3, 3, 4, 3, 3, 2, 2}, {9, 3, 4, 7, 3, 4, 1}, {3, 5, 4, 3, 6, 3, 8}, {3, 4, 4, 6, 3, 4, 4}, {3, 7, 4, 8, 3, 8, 4}, {6, 3, 5, 9, 2, 7, 9}};
        int[] hoursTotal = new int[8];
        int total = 0;
        System.out.println("                    Sun   Mon   Tue   Wed   Thur   Fri   Sat   Total");
        for (int r = 0; r < weekHours.length; r++) {
            System.out.printf("\nEmployee: %d \t", r);
            for (int c = 0; c < weekHours[r].length; c++) {
                System.out.print("     " + weekHours[r][c]);
                total += weekHours[r][c];
                if (c == 6) {
                    hoursTotal[r] = total;
                    System.out.print("      " + hoursTotal[r]);
                }
            }
            total = 0;
            System.out.println("\n");
        }
    }
}
