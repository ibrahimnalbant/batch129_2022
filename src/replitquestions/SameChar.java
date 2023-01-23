package replitquestions;

import java.util.Scanner;

public class SameChar {
    /*
    This program uses the Scanner class to read in a string from the user and check if the length of the string is 3.
    If the length is not 3, it prints an error message and exits the program using the return statement.
    If the length is 3, it uses a ternary operator to check whether all the characters in the string are the same or not.
    If they are the same, it prints "String has duplicate characters" otherwise it prints "String has unique characters"
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a name with three characters:");
        String name = sc.next();
        //sc.close();
        if (name.length() != 3) {
            System.out.println("Invalid input, name must have exactly three characters.");
            return;
        }
        String result = (name.charAt(0) == name.charAt(1) || name.charAt(0) == name.charAt(2) || name.charAt(1) == name.charAt(2)) ? "Your String has duplicate characters" : "Your String has unique characters";
        System.out.println(result);
    }
}
