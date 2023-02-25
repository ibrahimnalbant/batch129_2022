package calisma00;

import java.util.Scanner;

public class BasitTahminOyunu {
    public static void main(String[] args) {
         /*
        10 tane String bir dilek olusturunuz ve kullanicidan bir den 10 a kadar rakamla sayiyi aliniz
        ve bir sans oyunu olusturunuz
         */

        String bir = "Araba";
        String iki = "Ev";
        String uc = "Is";
        String dort = "Kariyer";
        String bes = "Son moodel bir telefon";
        String alti = "Daha fazla is";
        String yedi = "Ipad";
        String sekiz = "Mucevher";
        String dokuz = "Tatil";
        String on = "Saglik";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen 1 den 10 a kadar sayiy harfle giriniz");
        String sayi = scanner.next().toLowerCase();


        switch (sayi) {
            case "bir":
                System.out.println("Yeni yilda seni "+bir+ " bekliyor");
                break;
            case "iki":
                System.out.println("Yeni yilda seni "+iki+ " bekliyor");
                break;
            case "uc":
                System.out.println("Yeni yilda seni "+uc+ " bekliyor");
                break;
            case "dort":
                System.out.println("Yeni yilda seni "+dort+ " bekliyor");
                break;
            case "bes":
                System.out.println("Yeni yilda seni "+bes+ " bekliyor");
                break;
            case "alti":
                System.out.println("Yeni yilda seni "+alti+ " bekliyor");
                break;
            case "yedi":
                System.out.println("Yeni yilda seni "+yedi+ " bekliyor");
                break;
            case "sekiz":
                System.out.println("Yeni yilda seni "+sekiz+ " bekliyor");
                break;
            case "dokuz":
                System.out.println("Yeni yilda seni "+dokuz+ " bekliyor");
                break;
            case "on":
                System.out.println("Yeni yilda seni "+on+ " bekliyor");
                break;
            default:
                System.out.println("Lutfen gecerli bir sayi giriniz");

        }


    }
}
