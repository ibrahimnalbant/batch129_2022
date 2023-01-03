package calisma00;

import java.util.Scanner;

public class TasKagitMakas2 {
    /*Java ile taş, kağıt, makas oyunu nasıl yapılır bunu anlatacağız.
    Öncelikle kullanıcıdan seçim alabilmek için Scanner sınıfını aktarıyoruz.
    Ardından main fonksiyonumuzda kullanıcının ve bilgisayarın puanlarını tanımlıyoruz.
    While döngümüzün içerisinde kullanıcıdan aldığımız seçimi “secim” isimli değişkene atıyoruz.
    Bilgisayarın seçimini ise Math.random methodunu kullanarak alıyoruz.
    Math.random()*3 diyerek bilgisayara 0 ile 3 arasında bir rastgele sayı ürettiriyoruz.
    Ve seçimimiz ile bilgisayarın seçimini karşılaştırıp sonuçlarını yazıyoruz.
     */


    public static void main(String args []){

        Scanner s = new Scanner(System.in);
        int kul_puan =0;
        int bil_puan=0;
        System.out.println("Taş kağıt makas oyununa hoş geldiniz!");
        System.out.println("1-Taş 2-Kağıt 3-Makas");
        while(true) {
            System.out.println("Seçiminiz: ");
            int secim = s.nextInt();
            int bil_secim = (int)(Math.random()*3);
            if (secim == 1) {
                if (bil_secim == 1) {
                    System.out.println("Bilgisayarın seçimi: Taş Sonuç: Berabere");
                    System.out.println("Puanınız: "+kul_puan+" Bilgisayarın puanı:"+bil_puan);
                } else if (bil_secim == 2) {
                    System.out.println("Bilgisayarın seçimi: Kağıt Sonuç: Kaybettiniz");
                    bil_puan++;
                    System.out.println("Puanınız: "+kul_puan+" Bilgisayarın puanı:"+bil_puan);
                } else {
                    System.out.println("Bilgisayarın seçimi: Makas Sonuç: Kazandınız");
                    kul_puan++;
                    System.out.println("Puanınız: " + kul_puan + " Bilgisayarın puanı:" + bil_puan);
                }
            } else if (secim == 2) {
                if (bil_secim == 1) {
                    System.out.println("Bilgisayarın seçimi: Taş Sonuç: Kazandınız");
                    kul_puan++;
                    System.out.println("Puanınız: "+kul_puan+" Bilgisayarın puanı:"+bil_puan);
                } else if (bil_secim == 2) {
                    System.out.println("Bilgisayarın seçimi: Kağıt Sonuç: Berabere");
                    System.out.println("Puanınız: "+kul_puan+" Bilgisayarın puanı:"+bil_puan);
                } else {
                    System.out.println("Bilgisayarın seçimi: Makas Sonuç: Kaybettiniz");
                    bil_puan++;
                    System.out.println("Puanınız: " + kul_puan + " Bilgisayarın puanı:" + bil_puan); }
            } else if (secim == 3) {
                if (bil_secim == 1) {
                    System.out.println("Bilgisayarın seçimi: Taş Sonuç: Kaybettiniz");
                    bil_puan++;
                    System.out.println("Puanınız: "+kul_puan+" Bilgisayarın puanı:"+bil_puan);
                } else if (bil_secim == 2) {
                    System.out.println("Bilgisayarın seçimi: Kağıt Sonuç: Kazandınız");
                    kul_puan++;
                    System.out.println("Puanınız: "+kul_puan+" Bilgisayarın puanı:"+bil_puan);
                } else {
                    System.out.println("Bilgisayarın seçimi: Makas Sonuç: Berabere");
                    System.out.println("Puanınız: " + kul_puan + " Bilgisayarın puanı:" + bil_puan);
                }
            } else{
                System.out.println("Hatalı giriş yaptınız tekrar deneyin");
                continue;}
            if(kul_puan==3){
                System.out.println("Oyunu "+kul_puan+"-"+bil_puan+" kazandınız");
                break; }
            else if(bil_puan==3){
                System.out.println("Oyunu "+bil_puan+"-"+kul_puan+" kaybettiniz");
                break; }
        }
    }
}
