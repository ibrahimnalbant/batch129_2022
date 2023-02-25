package TR_Forwhile;

import java.util.Scanner;

public class Q07 {
    /*
  Sayinin Mükemmel sayı olup olmadığını kontrol eden Java kodunu yazın.
* Sayının kendisi hariç pozitif bölenlerinin toplamı o sayıya eşitse, herhangi bir sayı Mükemmel Sayı olarak bilinir.
Input : 6
Output: 6 Mukemmel Sayidir.
======================
Input 7
Output: 7 Mukemmel Sayidir degildir.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
        int num = scan.nextInt();
        int sum = 0;

        for (int i = 1; i < num; i++) {

            if (num % i == 0) {
                sum += i;
            }
        }
        if (sum == num) {
            System.out.println(num + " sayısı Mükemmel bir sayıdır.");
        } else {
            System.out.println(num + " sayısı Mükemmel bir sayı Değildir!..");
        }
    }
}
