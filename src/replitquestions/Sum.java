package replitquestions;

import java.util.Scanner;

public class Sum {

    /*
    This program uses the Scanner class to read in two long integers from the user.
    The sum of the two integers is calculated and stored in the variable "sum".
    Then it checks if any of the two integers and sum are greater than or equal to 10 digits.
    If any of them is, it prints "overflow" otherwise prints the sum of the two integers.
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input two integers:");
        long num1 = sc.nextLong();
        long num2 = sc.nextLong();
        sc.close();
        long sum = num1 + num2;

        if (num1 >= 10000000000L || num2 >= 10000000000L || sum >= 10000000000L) {
            System.out.println("overflow");
        } else {
            System.out.println("Sum of the numbers: " + sum);
        }
    }
}//class
