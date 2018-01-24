package Chapter8;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Program to accept a worker's ID of A,B,C or D and the day of their sale then
 * Program a two-dimensional array that takes the worker's ID (row) and add the
 * sale amount to the day of the week (column) then Program to display a chart
 * of what the workers amount of sale throughout the week
 *
 * @author Jessie Tilley
 */
public class P8 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] workers = {
            {0.00, 0.00, 0.00, 0.00, 0.00},
            {0.00, 0.00, 0.00, 0.00, 0.00},
            {0.00, 0.00, 0.00, 0.00, 0.00},
            {0.00, 0.00, 0.00, 0.00, 0.00},
            {0.00, 0.00, 0.00, 0.00, 0.00}
        };
        String salesman, day;
        String stop = "Y";
        do {
            System.out.println("ENTER THE SALESMAN ID AS A, B, C, D: ");
            salesman = input.next();
            if ("A".equals(salesman.toUpperCase()) || "B".equals(salesman.toUpperCase()) || "C".equals(salesman.toUpperCase()) || "D".equals(salesman.toUpperCase())) {
                System.out.println("ENTER THE DAY (M, T, W, H, or F): ");
                day = input.next();
                switch (salesman.toUpperCase()) {
                    case ("A"):
                        switch (day.toUpperCase()) {
                            case ("M"):
                                System.out.println("ENTER THE AMOUNT OF THE SALE: ");
                                workers[0][0] += input.nextDouble();
                                break;
                            case ("T"):
                                System.out.println("ENTER THE AMOUNT OF THE SALE: ");
                                workers[0][1] += input.nextDouble();
                                break;
                            case ("W"):
                                System.out.println("ENTER THE AMOUNT OF THE SALE: ");
                                workers[0][2] += input.nextDouble();
                                break;
                            case ("H"):
                                System.out.println("ENTER THE AMOUNT OF THE SALE: ");
                                workers[0][3] += input.nextDouble();
                                break;
                            case ("F"):
                                System.out.println("ENTER THE AMOUNT OF THE SALE: ");
                                workers[0][4] += input.nextDouble();
                                break;
                            default:
                                System.out.println("INVALID.");
                                break;
                        }
                        break;
                    case ("B"):
                        switch (day.toUpperCase()) {
                            case ("M"):
                                System.out.println("ENTER THE AMOUNT OF THE SALE: ");
                                workers[1][0] += input.nextDouble();
                                break;
                            case ("T"):
                                System.out.println("ENTER THE AMOUNT OF THE SALE: ");
                                workers[1][1] += input.nextDouble();
                                break;
                            case ("W"):
                                System.out.println("ENTER THE AMOUNT OF THE SALE: ");
                                workers[1][2] += input.nextDouble();
                                break;
                            case ("H"):
                                System.out.println("ENTER THE AMOUNT OF THE SALE: ");
                                workers[1][3] += input.nextDouble();
                                break;
                            case ("F"):
                                System.out.println("ENTER THE AMOUNT OF THE SALE: ");
                                workers[1][4] += input.nextDouble();
                                break;
                            default:
                                System.out.println("INVALID.");
                                break;
                        }
                        break;
                    case ("C"):
                        switch (day.toUpperCase()) {
                            case ("M"):
                                System.out.println("ENTER THE AMOUNT OF THE SALE: ");
                                workers[2][0] += input.nextDouble();
                                break;
                            case ("T"):
                                System.out.println("ENTER THE AMOUNT OF THE SALE: ");
                                workers[2][1] += input.nextDouble();
                                break;
                            case ("W"):
                                System.out.println("ENTER THE AMOUNT OF THE SALE: ");
                                workers[2][2] += input.nextDouble();
                                break;
                            case ("H"):
                                System.out.println("ENTER THE AMOUNT OF THE SALE: ");
                                workers[2][3] += input.nextDouble();
                                break;
                            case ("F"):
                                System.out.println("ENTER THE AMOUNT OF THE SALE: ");
                                workers[2][4] += input.nextDouble();
                                break;
                            default:
                                System.out.println("INVALID.");
                                break;
                        }
                        break;
                    case ("D"):
                        switch (day.toUpperCase()) {
                            case ("M"):
                                System.out.println("ENTER THE AMOUNT OF THE SALE: ");
                                workers[3][0] += input.nextDouble();
                                break;
                            case ("T"):
                                System.out.println("ENTER THE AMOUNT OF THE SALE: ");
                                workers[3][1] += input.nextDouble();
                                break;
                            case ("W"):
                                System.out.println("ENTER THE AMOUNT OF THE SALE: ");
                                workers[3][2] += input.nextDouble();
                                break;
                            case ("H"):
                                System.out.println("ENTER THE AMOUNT OF THE SALE: ");
                                workers[3][3] += input.nextDouble();
                                break;
                            case ("F"):
                                System.out.println("ENTER THE AMOUNT OF THE SALE: ");
                                workers[3][4] += input.nextDouble();
                                break;
                            default:
                                System.out.println("INVALID.");
                                break;
                        }
                        break;
                    default:
                        System.out.println("INVALID.");
                        break;
                }
            } else {
                System.out.println("INVALID.");
            }
            do {
                System.out.println("MORE DATA? ENTER Y FOR MORE OR N TO STOP: ");
                stop = input.next();
            } while (!stop.toUpperCase().equals("N") && !stop.toUpperCase().equals("Y"));

            if (stop.toUpperCase().equals("N")) {
                System.out.println("SALESMEN   \tM    \tT    \tW    \tH    \tF");
                System.out.print("A:       ");
                for (int y = 0; y < 5; y++) {
                    System.out.print("\t" + workers[0][y]);
                }
                System.out.println("\t   ");
                System.out.print("B:       ");
                for (int y = 0; y < 5; y++) {
                    System.out.print("\t" + workers[1][y]);
                }
                System.out.println("\t   ");
                System.out.print("C:       ");
                for (int y = 0; y < 5; y++) {
                    System.out.print("\t" + workers[2][y]);
                }
                System.out.println("\t   ");
                System.out.print("D:       ");
                for (int y = 0; y < 5; y++) {
                    System.out.print("\t" + workers[3][y]);
                }
                System.out.println("\t   ");
                return;
            }
        } while (!"N".equals(stop));
    }
}
