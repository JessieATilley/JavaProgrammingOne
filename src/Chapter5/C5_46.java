package Chapter5;

import java.util.Scanner;

/**
 *
 * @author Jessie Tilley
 */
public class C5_46 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Enter a string: ");
            String user = input.next().toUpperCase();
            System.out.println("The reversed string is " + (new StringBuffer(user).reverse().toString()));
        }
    }
}
