package Chapter2;

import java.util.Scanner;

/**
 * Program to find the user's prices of the drink, food and desserts then
 * Program to find the total of the drink, food and dessert, the sales tax, the
 * cost for tip and the grand total then Program to display the total of the
 * food, the tip, the sales tax and the grand total
 *
 * @author Jessie Tilley
 */
public class P2 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        //Declaring the varaibles and the Scanner for the user input.
        Scanner input = new Scanner(System.in);
        double drink;
        double food;
        double dessert;
        //The start of the user input for the drink, dessert and meal. 
        System.out.println("Enter the price of the meal: ");
        food = input.nextDouble();
        System.out.println("Enter the price of the drink: ");
        drink = input.nextDouble();
        System.out.println("Enter the price of the dessert: ");
        dessert = input.nextDouble();
        //Declaring the last set of the varaibles; tax, tips, total for the food and the grand total.
        double totalFood = food + drink + dessert;
        double salesTax = totalFood * 0.10;
        double tips = (totalFood + salesTax) * 0.15;
        double total = tips + salesTax + totalFood;
        //This last bit will display the tips, tax food total and the grand cost of it all.
        System.out.println("Here is the total for the drink, dessert, and the meal: " + totalFood);
        System.out.println("Here is the tax: " + salesTax);
        System.out.println("Here is the tip total: " + tips);
        System.out.println("Here is the grand total: " + total);
    }
}
