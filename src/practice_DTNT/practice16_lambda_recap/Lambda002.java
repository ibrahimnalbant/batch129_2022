package practice_DTNT.practice16_lambda_recap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Lambda002 {
    public static void main(String[] args) {

        List<Integer> sayi = new ArrayList<>(Arrays.asList(-5,-8,-12,0,1,12,5,5,6,9,15,8));
        ciftVePozitifLamExYazdir(sayi);
        System.out.println("\n ********************");
        ciftvePozitifMetRef(sayi);
        System.out.println("\n ********************");
        kareYazdir(sayi);
        System.out.println("\n ********************");
        kareTekrarsiz(sayi);
        System.out.println("\n ********************");
        buyKucSirala(sayi);
        System.out.println("\n ********************");
        pozitifKupBirlerBas5(sayi);
        System.out.println("\n ********************");


    }
    //SORU1: List elemanlarının çift ve pozitif olanlarını, Lambda Expression kullanarak aralarında bosluk olacak sekilde yazdırın

    public static void ciftVePozitifLamExYazdir(List<Integer> sayi){
        sayi.
                stream().
                filter(t->t%2==0 && t>0).
                forEach(t-> System.out.print(t+" "));

    }

        //SORU2: List elemanlarının çift ve pozitif olanlarını, Method Referances kullanarak aralarında bosluk olacak sekilde yazdırın

    public static  void ciftvePozitifMetRef(List<Integer> sayi){

        sayi.stream().filter(t->t%2==0 && t>0).forEach(Utils::yazdir);

    }
    //SORU3 : List elemanlarının karelerini, aralarında bosluk olacak sekilde yazdırın

    public static void kareYazdir(List<Integer> sayi){

        sayi.stream().map(Utils::kareBul).forEach(Utils::yazdir);
    }
    //SORU4 : List elemanlarının karelerini, tekrarsiz yazdırın

    public static void kareTekrarsiz(List<Integer> sayi){

        sayi.stream().distinct().map(Utils::kareBul).forEach(Utils::yazdir);
    }
    //SORU5: List elemanlarını buyukten kucuge sıralayarak yazdırın
    public static void buyKucSirala(List<Integer> sayi){

        sayi.stream().sorted(Comparator.reverseOrder()).forEach(Utils::yazdir);
    }
    // SORU6 : List elemanlarının pozitif olanlarının,
    // kuplerini bulup, birler basamagı 5 olanları yazdırınız
    public static void pozitifKupBirlerBas5(List<Integer> sayi){

        sayi.
                stream().
                filter(t->t>0).
                map(Utils::kupAl).
                filter(t->t%10==5).
                forEach(Utils::yazdir);

    }
}
