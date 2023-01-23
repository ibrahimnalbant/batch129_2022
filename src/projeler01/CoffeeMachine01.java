package projeler01;

import java.util.Scanner;

public class CoffeeMachine01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Which Coffee would you like? 1. Turkish Coffee 2. Filter Coffee 3. Espresso:");
        String whichCoffee = sc.nextLine();
        whichCoffee = whichCoffee.toLowerCase(); // make the input case-insensitive

        // Note: In Java we use .equals() method to compare two string objects, instead of "==" operator.

        if (whichCoffee.equals("turkish coffee")) {
            System.out.println("Turkish coffee is being prepared.");
        } else if (whichCoffee.equals("filter coffee")) {
            System.out.println("Filter coffee is being prepared.");
        } else if (whichCoffee.equals("espresso")) {
            System.out.println("Preparing Espresso...");
        } else {
            System.out.println("You have entered the wrong key.");
        }

        // Note: It is required to use "nextLine()" method after "nextInt()" method to avoid input miss match issue.

        // Create string to store milk choice
        String milk;
        System.out.print("Would you like milk? (Answer yes or no): ");
        milk = sc.nextLine();

        // Condition to check for milk choice
        if (milk.equalsIgnoreCase("yes")) {
            System.out.println("Adding milk...");
        } else if (milk.equalsIgnoreCase("no")) {
            System.out.println("No milk added.");
        }

        // Create string to store sugar choice
        String sugar;
        System.out.print("Would you like sugar? (Answer yes or no): ");
        sugar = sc.nextLine();

        // Condition to check for sugar choice
        if (sugar.equalsIgnoreCase("yes")) {
            System.out.print("How many sugars? ");
            int howManySugar = sc.nextInt();
            System.out.println("Adding " + howManySugar + " sugars.");
            String blankCode = sc.nextLine();
        } else if (sugar.equalsIgnoreCase("no")) {
            System.out.println("No sugar added.");
        }
    }
}
