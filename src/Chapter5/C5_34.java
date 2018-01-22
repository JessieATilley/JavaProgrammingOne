package Chapter5;

import java.util.Scanner;

/**
 *
 * @author Jessie Tilley
 */
public class C5_34 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int playerCount = 0, comCount = 0;
        do {
            int com = (int) (Math.random() * 3);
            System.out.println("Enter 0 (rock), 1 (paper), or 2 (scissor): ");
            int n = input.nextInt();
            switch (n) {
                case 0:
                    if (com == 0) {
                        System.out.println("Tie"); //Tie
                    }
                    if (com == 1) {
                        System.out.println("You Lose!");
                        comCount++;
                    }
                    if (com == 2) {
                        System.out.println("You win!");
                        playerCount++;
                    }
                    break;
                case 1:
                    if (com == 0) {
                        System.out.println("You win!");
                        playerCount++;
                    }
                    if (com == 1) {
                        System.out.println("Tie"); //Tie
                    }
                    if (com == 2) {
                        System.out.println("You Lose!");
                        comCount++;
                    }
                    break;
                case 2:
                    if (com == 0) {
                        System.out.println("You Lose!");
                        comCount++;
                    }
                    if (com == 1) {
                        System.out.println("You win!");
                        playerCount++;
                    }
                    if (com == 2) {
                        System.out.println("Tie"); //Tie
                    }
                    break;
            }
        } while (playerCount <= 2 || comCount <= 2);
        System.out.println("Here's the score; Player: " + playerCount + " Computer: " + comCount);
    }
}