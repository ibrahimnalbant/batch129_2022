package replitquestions;

import java.util.Scanner;
/*
In this program, the user is prompted to enter a string, which is then stored in the "input" variable.
Then the last 2 characters of the string are extracted using the substring() method and
stored in a separate variable "lastTwo".
This last two characters are then concatenated and printed out.
 */

public class StringCopy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();

        // Find last 2 characters of the string
        String lastTwo = input.substring(input.length()-2);
        // Repeat last 2 characters 3 times
        String output = lastTwo + lastTwo + lastTwo;
        System.out.println("New string: " + output);
    }
}
