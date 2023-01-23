package calisma00;

public class DailyStudy01 {

    public static void main(String[] args) {

        double gomlekFiyat = 35.99;
        double sapkaFiyat= 23.99;
        double ayakkabiFiyat = 15.99;
        double a = 9;
        double b = 4;
        double son = a/b;
        System.out.println(son);  // 2.25

        int c = 9;
        int d = 4;
        int sonuc = c/d;   //  int oldugunda bolum sonucu tam sayi olarak yaziliyor. nokta sonrasi atiliyor.
        System.out.println(sonuc);  // 2

        System.out.println("Toplam Fiyat: " + (gomlekFiyat + sapkaFiyat + ayakkabiFiyat));


        String s1 = "Java Kolaydır";
        System.out.println(s1.toUpperCase());

        byte b1 = 10;
        byte b2 = 20;
        int b3 = b1 * b2;    // b3 byte olsaydı Compile Time Error verir.
        System.out.println(b3);


    }
}
