package calisma00;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArmstrongMus {
    /*  soru1: Check if the integer is an Armstrong numbers to 4 digit numbers(4 digit-> exclusive)
                Armstrong sayi:herhangi bir 3 basamakli sayinin rakamlarinin kupleri toplami o sayiyi veriyorsa sayi  Armstrong sayidir
            (0, 1, 153, 370, 371, 407)
            153 = 1*1*1 + 5*5*5 + 3*3*3 = 153
            370 = 3*3*3 + 7*7*7 + 0*0*0 = 370
        soru2: Birden baslayarak girilen sayıya kadar her bir tamsayının amstrong sayı olup olmadıgını
                gösteren program yazınız */

    public static void main(String[] args) {
        System.out.println("************* Soru 1 *****************");
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Çıkış İçin 'negatif'(-) değer giriniz. \nBir sayı giriniz");
            int num = scan.nextInt();
            if (num < 0) {
                break;
            } else {
                int sum = 0;

                for (int i = num; i > 0; i /= 10) {
                    int a = i % 10;
                    sum += a * a * a;

                }
                if (num == sum) {
                    System.out.println(num + " sayısı Armstrong Sayısıdır.\n");
                } else {
                    System.out.println(num + " sayısı Armstrong Sayısı Değildir!..\n");
                }

            }
        }

        System.out.println("************* Soru 2 *****************");
        while (true) {
            System.out.println("Çıkış İçin 'negatif'(-) değer giriniz. \nBir sayı giriniz");
            int num = scan.nextInt();
            if (num < 0) {
                break;
            } else {
                List<Integer> armstrong = new ArrayList<>();

                for (int i = 0; i <= num; i++) {
                    int sum = 0;

                    for (int j = i; j > 0; j /= 10) {
                        int a = j % 10;
                        sum += a * a * a;
                    }
                    if (i == sum) {
                        armstrong.add(i);
                    }

                }
                System.out.println("Armstrong Sayısıları: " + armstrong + "\n");

            }
        }

    }
}
