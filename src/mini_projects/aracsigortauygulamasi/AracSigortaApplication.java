package mini_projects.aracsigortauygulamasi;

/*
Proje: Araç Sigorta Prim Hesaplama
       Araç tipleri:otomobil, kamyon, otobüs, motosiklet
                    -otobüs: 18-30 koltuk veya 31 ve üstü koltuk
       Tarife dönemi:Aralık 2022,Haziran 2022
       1.dönemi  :Haziran 2022            2.dönem  :Aralık 2022
          otomobil: 2000                       otomobil: 2500
          kamyon:   3000                       kamyon:   3500
          otobüs: tip1: 4000 tip2: 5000        otobüs: tip1: 4500 tip2: 5500
          motosiklet: 1500                     motosiklet: 1750
        Hatalı girişte hesaplama başarısız uyarisi verip tekrar menü gösterilsin.
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class AracSigortaApplication {

    public static void main(String[] args) {

        start();


    }//main

    public static void start(){
        Scanner inp=new Scanner(System.in);
        boolean isFail;//hesaplamanin durumunu kontrol etmek icin bir flag kullanalim
//hatali giriste veya yeni islem icin menu tekrar gosterilsin : while/do-while
        do {
            isFail=false;
            System.out.println("---Zorunlu Sigorta Primi Hesaplama---");
            System.out.println("Tarife donemi seciniz:");
            System.out.println("1-1.donem Haziran 2022");
            System.out.println("2-2.donem Aralik 2022");
            int term=0;
            try {
                term=inp.nextInt();
            }catch (InputMismatchException e){
                System.out.println("Gecersiz giris, lutfen sayi giriniz.");
            }
            inp.nextLine();
            //girilen donem gecerli mi?
            if (term==1 || term==2){
                String termName=term==1 ? "Haziran 2022" : "Aralik 2022";
                Arac arac=new Arac();
                System.out.println("Arac tipini giriniz:");
                System.out.println("otomobil, kamyon, otobüs, motosiklet");
                String select=inp.next();
                arac.type=select;
                arac.countPrim(term);
                if (arac.prim>0) {
                    System.out.println("Hesaplama islemi basariyla tamamlandi.");
                    //sonucu yazdir
                    System.out.println("Arac tipi: " + arac.type);
                    System.out.println("Tarife donemi: " + termName);
                    System.out.println("Aracinizin ilgili donem sigorta primi: " + arac.prim);

                    isFail = isAgain(inp);
                }else{
                    System.out.println("Hesaplama basarisiz, tekrar deneyiniz!!!");
                    isFail = isAgain(inp);
                }


            }else{
                System.out.println("Hatali giris!!!!");
                isFail=true;
            }



        }while (isFail);

        System.out.println("Iyi gunler dileriz....");


    }

    private static boolean isAgain(Scanner inp) {
        boolean isFail;
        System.out.println("Yeni islem icin 1, cikis icin 0 veya her hangi bir  sayi giriniz");
        int choice = inp.nextInt();
        if (choice == 1) {  // if'ten sonra 1 satir islem yapacaksan {} zorunlu degildir
            isFail = true;
        } else {          // else'ten sonra 1 satir islem yapacaksan {} zorunlu degildir
            isFail = false;
        }
        return isFail;
    }


}//class
