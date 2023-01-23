package replitquestions;

import java.util.Scanner;

public class If_Switch_Ternary_StringMeth_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scan.nextLine();
        System.out.print("Enter your surname: ");
        String surname = scan.nextLine();
        System.out.print("Enter your credit card number: ");
        String creditCard = scan.nextLine();

        // Get initials of name and surname in uppercase
        String nameInitial = name.substring(0, 1).toUpperCase();
        String surnameInitial = surname.substring(0, 1).toUpperCase();

        // Format credit card number
        String formattedCard = creditCard.substring(0, 4) + "-" + creditCard.substring(4, 8) + "-" + creditCard.substring(8, 12) + "-" + creditCard.substring(12);

        // Print the result
        System.out.println("Name: " + nameInitial + ". " + surnameInitial + ".");
        System.out.println("Credit Card: " + formattedCard);
    }
}
