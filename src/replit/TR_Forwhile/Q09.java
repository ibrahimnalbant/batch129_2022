package TR_Forwhile;

import java.util.Scanner;

public class Q09 {
    /*
Kullanıcının girdiği sayıyı tersine çeviren bir java programı yazınız. (Mulakat Sorusu)
Input  :1238
Output :Girilen Numananin Tersi: 8321
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
        String sayi = input.next();

        String tersSayi = "";
        for (int i = sayi.length()-1; i >=0 ; i--) {
            tersSayi +=sayi.charAt(i);
        }
        System.out.println(tersSayi);
    }
}
