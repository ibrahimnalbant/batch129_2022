package lambda_recap;

import java.util.stream.IntStream;

public class Lambda04 {
// IntStream bize integer degerler veriyor.
    public static void main(String[] args) {


        System.out.println("\n********Soru1");
        System.out.println(birdenXeKadarToplam(10));

        System.out.println("\n********Soru2");
        System.out.println(birdenXeKadarTekSayTop(5));

        System.out.println("\n********Soru3");
        System.out.println(birdenSonsuzaKadarGidenTekSayilardanIlkXtanesiniTop(3));

        System.out.println("\n********Soru4");
        System.out.println(ikidenSonsuzaKadarGidenCiftSayilardanIlkXtanesiniTop(3));

        System.out.println("\n********Soru5");
        System.out.println(besdenSonsuzaKadarKuvIlkXKuvTop(3));

        System.out.println("\n********Soru5a");
        System.out.println(besdenSonsuzaKadarKuvIlkXKuvTop2(3));

        System.out.println("\n********Soru6");
        System.out.println(faktoriyel(5));

    }//main

    //SORU1: 1'den x'e kadar int degerleri akısa alınız(x dahil olacak), toplamını bulup return ederek yazdırınız.

    public static int birdenXeKadarToplam(int x){

        int sonuc = IntStream.range(1,x+1).sum();

        return sonuc;
    }


    //SORU2: 1'den x'e kadar int degerleri akısa alınız(x dahil olacak),
    // tek sayıların, toplamını bulup return ederek yazdırınız. (x dahil olacak)

    public static int birdenXeKadarTekSayTop(int x){

        int sonuc = IntStream.rangeClosed(1,x).filter(t->t%2!=0).sum();

        return sonuc;
        /*
        lambda ile cozmezsek asagidaki gibi olur

        public static int birdenXeKadarTekSayilarToplamLoop(int x) {
            int sonuc = 0;
            for (int i = 0; i<=x; i++) {
                if (i%2==1) {
                    sonuc += i;
                }
            }
            return sonuc;
       }
         */

    }

    //SORU3: 1'den sonsuza kadar giden Tek sayılardan,
    // ilk x tanesini toplayınız sonucu return ederek yazdırınız
    /*
    Sonsuzaa kadar dediği için iterate metodunu kullanabiliriz.
    ( iterate bizim belittigimiz değerden baslar ve bizim belirttiğimiz artis oranlariyla sonsuza kadar gider.)
     */

    public static int birdenSonsuzaKadarGidenTekSayilardanIlkXtanesiniTop(int x){

        int sonuc = IntStream.iterate(1,t->t+2).limit(x).sum();

        return sonuc;
    }

    //SORU4: 2'den sonsuza kadar giden Çift sayılardan,
    // ilk x tanesini toplayınız sonucu return ederek yazdırınız

    public static int ikidenSonsuzaKadarGidenCiftSayilardanIlkXtanesiniTop(int x){

        int sonuc = IntStream.iterate(2,t->t+2).limit(x).sum();

        return sonuc;
    }

    //SORU5: 5'den sonsuza kadar giden kuvvetlerinden
    // ilk x kuvvetinin toplamını return ederek yazdırınız

    public static int besdenSonsuzaKadarKuvIlkXKuvTop(int x){

        int sonuc= IntStream.iterate(5,t->t*5).limit(x).sum();

        return sonuc;
    }
    //5a

    public static int besdenSonsuzaKadarKuvIlkXKuvTop2(int x){

        return IntStream.rangeClosed(1, x).map(t -> (int) Math.pow(5, t)).sum();
    }

    //Soru6: x sayisinin faktoriyelini bulunuz

    public static int faktoriyel(int x){

        int sonuc = IntStream.rangeClosed(1,x).reduce(1,(a,b)->a*b);

        return sonuc;

    }



}//class
