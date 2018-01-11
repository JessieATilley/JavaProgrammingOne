package Chapter4;

import java.util.Scanner;

/**
 * Program to accept two user string inputs that see if the first string has the
 * second string contained within it
 *
 * @author Jessie Tiiley
 */
public class C4_22 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter string s1: ");
        System.out.println("Please enter string s2: ");
        String s1 = input.next().toUpperCase();
        String s2 = input.next().toUpperCase();
        if (s1.contains(s2)) {
            System.out.println(s2 + " is a substring of " + s1);
        } else {
            System.out.println(s2 + " is not a substring of " + s1);
        }
    }
}
