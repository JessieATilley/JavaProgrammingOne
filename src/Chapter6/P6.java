package Chapter6;

import java.util.Scanner;

/**
 *
 * @author Jessie Tilley
 */
public class P6 {
    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        String sR;
        //Conversion 
        System.out.println("Please enter the US dollar conversion rate to the Euro: ");
        double sEuro = input.nextDouble();
        System.out.println("Please enter the US dollar conversion rate to the Pound: ");
        double sPound = input.nextDouble();
        System.out.println("Please enter the US dollar conversion rate to the Yen: ");
        double sYen = input.nextDouble();
        //Do
        do{
            System.out.println("Please enter the dollar amount you wish to convert: ");
            double money = input.nextDouble();
            System.out.println("Please enter E (Euro), P (Pound) or Y (Yen): ");
            String s = input.next().toLowerCase();
            switch(s){
                case "e":
                    System.out.printf("%.2f U.S. Dollars is %.2f %s. \n", money, euro(sEuro, money), s);
                    break;
                case "p":
                    System.out.printf("%.2f U.S. Dollars is %.2f %s. \n", money, euro(sPound, money), s);
                    break;
                case "y":
                    System.out.printf("%.2f U.S. Dollars is %.2f %s. \n", money, euro(sYen, money), s);
                    break;
                default:
                    
        }
            do{
                System.out.println("Continue? (yes or no): ");
                sR = input.next().toLowerCase();
            }while (!sR.equalsIgnoreCase("no") && !sR.equalsIgnoreCase("yes"));
        }while (sR.equalsIgnoreCase("yes"));
    }
            
    public static double euro(double rateE, double mathE){
        double resultE, resultPE, finalE;
        if (mathE <= 100){
            resultPE = mathE - (mathE * 0.1);
            resultE = resultPE * rateE;
        }
        else {
            resultPE = mathE - (mathE * 0.05);
            resultE = resultPE * rateE;
        }
        finalE = resultE;
        return finalE;
    }
}
