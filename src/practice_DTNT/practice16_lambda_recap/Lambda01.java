package practice_DTNT.practice16_lambda_recap;

import java.util.*;
import java.util.stream.Collectors;

public class Lambda01 {
    public static void main(String[] args) {


        List<Integer> sayi = new ArrayList<>(Arrays.asList(-5, -8, -12, 0, 1, 12, 5, 5, 6, 9, 15, 8));

        System.out.println(" \n  *******Soru1");
        ciftVePozitifLamExYazdir(sayi); // sayi: argument'imiz
        System.out.println(" \n  *******Soru2");
        ciftVePozitifMetRef(sayi);
        System.out.println(" \n  *******Soru3");
        kareYazdir(sayi);
        System.out.println(" \n  *******Soru4");
        kareTekrarsiz(sayi);
        System.out.println(" \n  *******Soru5");
        buyKucSirala(sayi);
        System.out.println(" \n  *******Soru6");
        pozitifKupBirlerBas5(sayi);
        System.out.println(" \n  *******Soru7");
        toplamMetRef(sayi);
        System.out.println(" \n  *******Soru8");
        toplamLambdaEx(sayi);
        System.out.println(" \n  *******Soru9");
        pozitifElCarpimLamEx(sayi);
        System.out.println(" \n  *******Soru10");
        System.out.println(ciftElKareKucBuySiraListReturn(sayi));
        System.out.println(" \n  *******");



    }

    //SORU1: List elemanlarının çift ve pozitif olanlarını, Lambda Expression kullanarak aralarında bosluk olacak sekilde yazdırın

    public static void ciftVePozitifLamExYazdir(List<Integer> sayi) {

        sayi.stream().filter(t -> t % 2 == 0 && t > 0).forEach(t -> System.out.print(t + " ")); //12 6 8

    }


    //SORU2: List elemanlarının çift ve pozitif olanlarını, Method Referances kullanarak aralarında bosluk olacak sekilde yazdırın

    public static void ciftVePozitifMetRef(List<Integer> sayi) {

        sayi.stream().filter(t -> t % 2 == 0 && t > 0).forEach(Utils::yazdir);//12 6 8
    }

    //SORU3 : List elemanlarinin karelerini, aralarinda bosluk olacak sekilde yazdiriniz.

    public static void kareYazdir(List<Integer> sayi){

      //  sayi.stream().map(t->t*t).forEach(Utils::yazdir);//25 64 144 0 1 144 25 25 36 81 225 64

        sayi.stream().map(Utils::kareBul).forEach(Utils::yazdir);//25 64 144 0 1 144 25 25 36 81 225 64


    }

    //SORU4 : List elemanlarının karelerini, tekrarsiz yazdırın\
    public static void kareTekrarsiz(List<Integer>sayi) {

        sayi.
                stream().distinct().map(Utils::kareBul).forEach(Utils::yazdir); //25 64 144 0 1 144 25 36 81 225 64
    }

    //SORU5: List elemanlarını buyukten kucuge sıralayarak yazdırın

    public static void buyKucSirala(List<Integer> sayi){

        sayi.
                stream().

                sorted(Comparator.reverseOrder()).
                forEach(Utils::yazdir);  //15 12 9 8 6 5 5 1 0 -5 -8 -12
    }

    // SORU6 : List elemanlarının pozitif olanlarının, kuplerini bulup, birler basamagı 5 olanları yazdırınız

    public static void pozitifKupBirlerBas5(List<Integer> sayi){

        sayi.stream().filter(t->t>0).map(t->t*t*t).filter(t->t%10==5).forEach(Utils::yazdir);
    }

    // SORU7: List elemanlarının Method References ile toplamını bulun ve yazdırın.
                                //(reduce(Integer::sum))

    public static void toplamMetRef(List<Integer> sayi){

        Optional<Integer> sonuc = sayi.stream().reduce(Integer::sum);
                                                //reduce() method “terminal” method’dur.
        // Terminal methodlardan sonra baska bir method kullanilamaz.
        //findFirst(), forEach(),    baska terminal methodlardir.

        /** int return type "null" degere exception verdigi icin Optional<Integer> return type yaptik */

        System.out.println(sonuc);   //Optional[36]
    }

    // SORU8: List elemanlarının Lambda Expression ile toplamını bulun ve yazdırın

    public static void toplamLambdaEx(List<Integer> sayi){

        int sonuc = sayi.stream().reduce(0,(a,b)->a+b);

        System.out.println(sonuc);

    }

    //SORU9 : Listin pozitif elemanlarının, carpımını Lambda Expression ile return ederek yazdırın

    public static void pozitifElCarpimLamEx(List<Integer> sayi){

        int sonuc = sayi.stream().filter(t->t>0).reduce(1,(a,b)->a*b);

        System.out.println(sonuc);

    }

    //SORU10 : Listin cift elemanlarının, karelerini, kucukten buyuge sıralayıp list halinde return ederek yazdırınız.

    public static List<Integer> ciftElKareKucBuySiraListReturn(List<Integer> sayi){

       List<Integer> sonuc =  sayi.stream().filter(t->t%2==0).map(t->t*t).sorted().collect(Collectors.toList());

       return sonuc;


    }



}
