package replitquestions;
import java.util.Scanner;

public class Factorial {
    /*
    a method factorial takes an integer as input and calculates its factorial using a loop.
    Then the main method prompts the user to enter a number and uses the factorial method to find its factorial.
    Then it uses a StringBuilder to format the output in the desired format.
    The result of the factorial calculation and the formatted string are printed for the user to see.
     */
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();
        int factorial = factorial(num);
        StringBuilder sb = new StringBuilder();
        sb.append(num);
        sb.append("!=");
        for (int i = num; i > 0; i--) {
            sb.append(i);
            if (i > 1) {
                sb.append("*");
            }
        }
        sb.append("=");
        sb.append(factorial);
        System.out.println(sb);
    }

}
