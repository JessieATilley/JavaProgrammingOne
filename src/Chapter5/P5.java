package Chapter5;

import java.util.Scanner;

/**
 *
 * @author Jessie Tilley
 */
public class P5 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        int yCount = 0, nCount = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Y (to vote yes), N (to vote no) or Q (to quit voting): ");
        String s = input.next();
        char letter = s.charAt(0);
        do {
            if (letter == 'Y' || letter == 'y') {
                yCount++;
                System.out.println("Enter Y (to vote yes), N (to vote no) or Q (to quit voting): ");
                s = input.next();
                letter = s.charAt(0);
            } else if (letter == 'N' || letter == 'n') {
                nCount++;
                System.out.println("Enter Y (to vote yes), N (to vote no) or Q (to quit voting): ");
                s = input.next();
                letter = s.charAt(0);
            } else if (letter == 'Q' || letter == 'q') {
                break;
            } else {
                System.out.println("INVALID:Enter Y (to vote yes), N (to vote no) or Q (to quit voting): ");
                s = input.next();
                letter = s.charAt(0);
            }
        } while (letter != 'Q' || letter != 'q');
        System.out.println("Here's the vote counts; Yes votes: " + yCount + ", and No Votes: " + nCount);
    }
}
