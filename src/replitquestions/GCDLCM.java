package replitquestions;
import java.util.Scanner;
public class GCDLCM {

    /*
    the user is prompted to enter two integers,
    which are stored in the variables "a" and "b". Then a loop iterates from 1 to the minimum of the two integers,
    and checks for the "greatest common divisor" (GCD) using the modulus operator(%)
    if both integers are divisible by the iterator,
        i. Then the GCD is stored in the variable gcd.
        Then LCM (Least Common Multiple) is calculated by multiplying both integers and dividing by GCD.
    Finally, the GCD and LCM are printed for the user to see.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first integer: ");
        int a = scanner.nextInt();
        System.out.println("Enter second integer: ");
        int b = scanner.nextInt();

        // Find GCD
        int gcd = 1;
        for (int i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }
        System.out.println("GCD for " + a + " and " + b + " = " + gcd);

        // Find LCM
        int lcm = (a*b)/gcd;
        System.out.println("LCM for " + a + " and " + b + " = " + lcm);
    }

}
