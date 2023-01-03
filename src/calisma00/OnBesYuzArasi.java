package calisma00;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OnBesYuzArasi {
    /*  Kullanicidan toplanmak uzere sayilar isteyin
     sayi adedi 10'u gecerse veya toplam 500 'u gecerse
     bu kadar sayi yeter
     ".. adet sayi girdin, toplami..." yazdirin
    */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();
        int sum = 0;
        int numLength = 0;
        do {
            System.out.println("Sayı giriniz");
            int a = input.nextInt();
            numbers.add(a);
            numLength = numbers.size();
            for (Integer w : numbers) {
                sum += w;
            }
        } while (numLength < 10 && sum <= 500);

        System.out.println(numLength + " sayı girdiniz, toplamı: " + sum);
    }
}
