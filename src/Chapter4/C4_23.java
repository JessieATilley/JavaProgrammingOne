package Chapter4;

import java.util.Scanner;

/**
 * Program to accept several user inputs such as name, pay rate, hours worked,
 * state tax and federal tax then Program to find the gross pay, net pay and
 * deductions from federal and state tax then Program to display the name, pay
 * rate, hours worked, state and federal tax, gross pay, the deductions and the
 * net pay
 *
 * @author Jessie Tiiley
 */
public class C4_23 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        double grossPay;
        double netPay;
        double deduction;
        double fed, stat;

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        System.out.println("Please enter hours worked in the week: ");
        System.out.println("Please enter payrate: ");
        System.out.println("Please enter federal tax withholding rate: ");
        System.out.println("Please enter state tax withholding rate: ");
        String name = input.next();
        double hours = input.nextDouble();
        double payR = input.nextDouble();
        double federal = input.nextDouble();
        double state = input.nextDouble();

        grossPay = hours * payR;
        fed = grossPay * federal;
        stat = grossPay * state;
        deduction = fed + stat;
        netPay = grossPay - deduction;

        System.out.printf("Employee: %s\n", name);
        System.out.printf("Hours Workded: %.2f\n", hours);
        System.out.printf("Pay Rate: %.2f\n", payR);
        System.out.printf("Gross Pay: %.2f\n", grossPay);
        System.out.println("Deductions: ");
        System.out.printf(" Federal Withholding (" + federal + "): %.2f\n", fed);
        System.out.printf(" State Withholding: (" + state + "): %.2f\n", stat);
        System.out.printf(" Deduction: %.2f\n", deduction);
        System.out.printf("Net Pay: %.2f\n", netPay);
    }
}
