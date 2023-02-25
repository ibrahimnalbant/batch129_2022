package replit.TR_SCANNER;

import java.util.Scanner;

public class Q01 {
    /*
    Kullanıcıdan bir sayı alın ve sayının küpünün yarısını konsola yazdıran bir program yazın.
     */
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.print("Bir sayı girin: ");
            double number = sc.nextDouble();
            double result = Math.pow(number, 3) / 2;
            System.out.println("Sayının küpünün yarısı: " + result);


    }
}
