package sorubankasi;

import java.util.Scanner;

public class IfElse_IfElseIf {

    public static void main(String[] args) {


        if (5>7 && 10>6){
            System.out.println("Elma");
        } else {
            System.out.println("Armut");
        }

        if (5<7 && 10>6){
            System.out.println("Elma");
        } else {
            System.out.println("Armut");
        }

        if (5>7 || 10<6){
            System.out.println("Elma");
        } else {
            System.out.println("Armut");
        }

        int yas=67;
        if (yas>65){
            System.out.println("emekli");
        }
        if (yas<70){
            System.out.println("dede");
        }
            byte sayi = 9;
        if (sayi!=10){
            System.out.println("Kayisi");
            }else{
            System.out.println("Kiraz");
        }

        byte sayi1 = 91;
        if (sayi1<100){
            System.out.println("Nar");
        }
        if (sayi1<90){
            System.out.println("Ayva");
        }

        byte sayi2;
        sayi2=100;
        if(sayi2<100){
            System.out.println("Kiwi");
        }else{
            System.out.println("Mango");
        }

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir pozitif integer giriniz");
        int b = scan.nextInt();

        if(b>9 && b<100) {
            System.out.println("Muz");
        }
        if(b>99 && b<1000);{
            System.out.println("Visne");
        }



        }//main
}//class

