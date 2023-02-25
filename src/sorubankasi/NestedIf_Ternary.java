package sorubankasi;

import java.sql.SQLOutput;
import java.util.Scanner;

public class NestedIf_Ternary {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        /*

        int y = 20;
        System.out.println((y >= 20) ? (2 + y) : (y - 3));

        y = 8;
        int x = (y % 2 == 1) ? (3 * y) : (y / 4);
        System.out.println(x);

        y = 12;
        if (y % 2 == 0) {
            System.out.println(3 * y);
        } else {
            System.out.println(5 + y);
        }

        x = y % 2 == 0 ? 3 * y : 5 + y;
        System.out.println(x);

        x = y % 2 > 0 ? 5 + y : 3 * y;
        System.out.println(x);

        y = 9;
        x = y % 3 != 1 ? 4 * y : 8 + y;
        System.out.println(x);

        y = 2;
        int z = 0;

        if (z >= 0) {
            y++;
        } else {
            z--;
        }

        System.out.println(y + "," + z);

        // soru 5

        System.out.println("Lutfen Erkek veya Kadin olarak cinsiyet giriniz");
        String cinsiyet = input.next();
        System.out.println("Lutfen yas giriniz");
        int yas = input.nextInt();

        if (cinsiyet.equals("Erkek")) {
            if (yas < 18) {
                System.out.println("Alsancak");
            } else {
                System.out.println("Buca");
            }
        } else if (cinsiyet.equals("Kadin")) {
            if (yas < 18) {
                System.out.println("Konak");
            } else {
                System.out.println("Karsiyaka");
            }

        } else {
            System.out.println("Izmir");
        }

        // soru 6
        System.out.println("Enter an Integer");
        int a = input.nextInt();

        if (a % 2 == 0) {

                if (a % 3 == 0) {
                    System.out.println("Woooow!");
                }  else{
                System.out.println("Himmm!");
            }
        }else {
            if (a%3==0){
                System.out.println("Normal");
            }else {
                System.out.println("Yazik!");
            }
        }

        // soru 7
        System.out.println("Bir tamsayi giriniz");
        int n= input.nextInt();
        int result = n>=0? n : -1*n;
        System.out.println(result);

        */

        // Soru 8

        System.out.println("Enter password");
        String password = input.nextLine();
        char initial = password.charAt(0);

        if (initial>='A'  && initial<='Z'){
            if (initial=='A'){
                System.out.println("Gecerli");
            }else {
                System.out.println("Gecersiz");
            }
        }else if (initial>='a' && initial <='z'){
            if (initial=='z'){
                System.out.println("gecerli");
            }else {
                System.out.println("gecersiz");
            }
        }else{
            System.out.println("Bu ne?");
        }

        // Soru 9

        System.out.println("Urun miktarini sayi olarak giriniz");
        int miktar = input.nextInt();
        System.out.println("Urun birim fiyatini giriniz");
        double fiyat = input.nextDouble();
        double result = miktar>1000 ? fiyat*0.9*miktar : fiyat*miktar;
        System.out.println(result);

        // Soru 10

        System.out.println("iki tamsayi giriniz");
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        int result1 = n1 > n2 ? n2 : n1;
        System.out.println(result1);


    }//main
}//class
