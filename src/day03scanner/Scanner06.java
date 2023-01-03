package day03scanner;

import java.util.Scanner;

public class Scanner06 {

    public static void main(String[] args) {

        //Kullanicidan alacaginiz 5 basamakli
        // bir sayinin ilk iki ve son iki basamagindaki
        // rakamlarin toplamini yazdiran kodu yaziniz

        Scanner input = new Scanner(System.in);

        System.out.println("5 basamakli bir sayi giriniz...");

        int number = input.nextInt();   // 38671

        // Son rakami al
        // int lastDigit = number % 10;
        // System.out.println(lastDigit);

        // Sayiyi kucult
        // number = number / 10;
        // System.out.println(number);

        // Son rakami al
        int lastDigit = number % 10;    // 1
        number = number / 10;           // 3867

        // Sondan ikinci rakami al
        int lastSecondDigit = number%10;  // 7
        number = number / 10;             // 386

        // Sondan ucuncu rakami al
        int lastThirdDigit = number%10;   //6
        number = number/10;               //38

        // Sondan dorduncu rakami al
        int lastFourthDigit = number%10;  //8
        number = number/10;               //3

        // Sondan besinci rakami al
        int lastFifthDigit = number%10;   //3

        System.out.println(lastDigit + lastSecondDigit + lastFourthDigit + lastFifthDigit ); // 19



    }
}
