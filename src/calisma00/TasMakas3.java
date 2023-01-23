package calisma00;

import java.util.Scanner;

public class TasMakas3 {
    /*
     tas    >   makas
     makas  >   kagit
     kagit  >   tas
Oncelikle kullanicidan secim alabilmek icin Scanner yapiyoruz.
Ardindan main fonksiyonumuzda kullanicinin ve bilgisayarin puanlarini tanimliyoruz.
While dongumuzun icerisinde kullanicidan aldigimiz secimi "secim" isimli degiskene atiyoruz.
Bilgisayarin secimini ise Math.random methodunu kullanarak aliyoruz.
Math.random()*3 diyerek bilgisayara 0 ile 3 arasinda bir rastgele sayi urettiriyoruz.
Ve secimimiz ile bilgisayarin secimini karsilastirip sonuclarini yaziyoruz.
En sonda da kullaniciya oyuna devam etmek isteyip istemedigini soruyoruz, eger istiyorsa
dongumuz en bastan calisiyor, istemiyorsa da cikis yapiyor.
*/
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int kPuan = 0;
        int bPuan = 0;
        while (true) {
            System.out.println("Tas mı? Makas mı? Kagıt mı?");
            String kSecim = input.next().toLowerCase();
            int rastgeleSayi = (int) (Math.random() * 3);
            String bSecim = rastgeleSayi == 0 ? "tas" : rastgeleSayi == 1 ? "makas" : "kagıt";
            switch (kSecim) {
                case "tas":
                    if (bSecim.equals("makas")) {
                        kPuan += 10;
                        System.out.println("Bilgisayar: "+bSecim);
                        System.out.println("Kazandın!  Puanın: " + kPuan);
                    } else if (bSecim.equals("kagıt")) {
                        bPuan += 10;
                        System.out.println("Bilgisayar: "+bSecim);
                        System.out.println("Kaybettin!");
                    } else {
                        System.out.println("Bilgisayar: "+bSecim);
                        System.out.println("Berabere");
                    }
                    break;
                case "makas":
                    if (bSecim.equals("kagıt")) {
                        kPuan += 10;
                        System.out.println("Bilgisayar: "+bSecim);
                        System.out.println("Kazandın!  Puanın: " + kPuan);
                    } else if (bSecim.equals("tas")) {
                        bPuan += 10;
                        System.out.println("Bilgisayar: "+bSecim);
                        System.out.println("Kaybettin!");
                    } else {
                        System.out.println("Bilgisayar: "+bSecim);
                        System.out.println("Berabere");
                    }
                    break;
                case "kagıt":
                    if (bSecim.equals("tas")) {
                        kPuan += 10;
                        System.out.println("Bilgisayar: "+bSecim);
                        System.out.println("Kazandın!  Puanın: " + kPuan);
                    } else if (bSecim.equals("makas")) {
                        bPuan += 10;
                        System.out.println("Bilgisayar: "+bSecim);
                        System.out.println("Kaybettin!");
                    } else {
                        System.out.println("Bilgisayar: "+bSecim);
                        System.out.println("Berabere");
                    }
                    break;
                default:
                    System.out.println("Geçersiz giriş yaptınız.");
                    break;
            }
            System.out.println("Devam etmek istiyor musunuz?  E ya ad H");
            char cikis = input.next().toLowerCase().charAt(0);
            if (cikis=='h'){
                System.out.println("Oyun sonlandırıldı.");
                if (kPuan>bPuan){
                    System.out.println("Kazandınız!.. Tebrikler");
                    System.out.println("Puanız: " +kPuan+" puan\nBilgisayarın Puanı: "+bPuan+" puan");
                }else{
                    System.out.println( "Kaybettiniz!!!");
                    System.out.println("Puanız: " +kPuan+"\nBilgisayarın Puanı: "+bPuan+" puan");
                }
                break;
            }
        }
    }
}
