package replitquestions;

import java.util.Scanner;

public class SwitchExample {
    /*
    This program uses the Scanner class to read in a string from the user,
    it then uses the charAt() method to get the first character of the string and store it in the char variable response.
     Then, it uses a switch statement to test the value of response and perform the specified actions based on the value.
      The program uses the break statement to exit the switch block after the corresponding message is printed.
       Finally, it close the scanner object.
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter command:");
        String input = sc.next();
        char response = input.charAt(0);

        switch(response) {
            case 'a':
                System.out.println("Your request is being processed");
                break;
            case 'b':
                System.out.println("Thank you anyway for your consideration");
                break;
            case 'c':
                System.out.println("Sorry, no help is currently available");
                break;
            default:
                System.out.println("Invalid entry, please try again!");
        }
        sc.close();
    }
}
