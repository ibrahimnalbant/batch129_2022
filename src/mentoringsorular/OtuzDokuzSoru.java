package mentoringsorular;

import java.util.Scanner;

public class OtuzDokuzSoru {

    public static void main(String[] args) {

    /*
        1---Sayının Sayı değerlerinin toplamasını yapan Java kodu yazınız.

        Test Data
        34
        Beklenen Çıktı
        7
     */
        Scanner scan = new Scanner(System.in); // Klavyeden okuma yapmak için Scanner nesnesini oluştur.
        System.out.print("Bir Sayı Girin: ");

        int num = scan.nextInt();  // nextInt() metodu ile tam sayı türünde değer okuması yapılır.

        int adet = 0,toplam=0;

        while(num != 0)
        {
            toplam=(num%10)+toplam;
            num /= 10;
            ++adet;
        }

        System.out.println("Basamak Toplamı: " + toplam);


    /*
    2) 1 den 20 ye kadar tam sayıları alt alta yazan Java kodu yazınız.
    Hint: For döngüsü kullanınız.
    Beklenen Çıktı:
    1
    2
    3
    4
    .
    .
    .
    19
    20
     */


            for (int i = 1; i < 21; i++) {
            System.out.println(i);
        }//for loop

        /*
        3)----Belirlenen sayının 1 den 10 a kadar çarpım sonuçlarını yapan Java programını yazınız.

    Örnek Sonuç:
    5 x 1 = 5
    5 x 2 = 10
    5 x 3 = 15
    5 x 4 = 20
    5 x 5 = 25
    5 x 6 = 30
    5 x 7 = 35
    5 x 8 = 40
    5 x 9 = 45
    5 x 10 = 50
         */
        System.out.print("Bir Sayı Girin:");

        int sayi = scan.nextInt();
        for(int i = 1; i <= 10; ++i) {
            System.out.printf("%d * %d = %d \n", sayi, i, sayi * i);

        }



    }// main


}//class
