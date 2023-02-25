package calisma00;

import java.sql.SQLOutput;

public class ForDongusuForLoop {

    public static void main(String[] args) {


    /*
    Tekrarlanma, sıralama, arttırma, azaltma, matematiksel ifadeler ve daha birçok alanda kullanılan döngülerden
     biri olan for döngüsü, 3 parametre alarak çalışmaktadır. Öncelikle for döngüsünün yapısını inceleyelim;

        for (değişken başlatma; koşul; değişken arttırma/azaltma) {
	        GERÇEKLEŞEN İŞLEM
            }

     */

    //Örneğin elimizdeki bir metni ekrana birden fazla defa yazdırmak istersek;
        for (int i = 0; i < 3; i++) {
            System.out.println("ibrahim nalbant");
        }

        //1'den 100'e kadar sayıları ekrana yazdır
        for (int i = 0; i < 101; i++) {
            System.out.print(i+" ");
        }
        System.out.println();
        //1'den 100'e kadar olan tüm tek sayıları yazdır
        for (int i = 0; i < 101; i+=2) {
            System.out.print(i+" ");
        }
        System.out.println();
        // 1'den 5'e kadar olan sayıların karelerini ekrana yazdır.
        for(int i=1; i<=5; i++) {
            System.out.println(i + "' nin karesi " + " = " +i*i);
        /*
        For döngüsü kullanarak aşağıdaki şekli oluşturun.
                <------->
                +	+	+
                    +
                +	+	+
                    +
                +	+	+
                    +
                +	+	+
                    +
                +	+	+
                    +
                <------->
         */
        }

        System.out.println("<------->");
        for(int i=1; i<=5; i++) {
            System.out.println("+\t+\t+");
            System.out.println("    +");
        }
        System.out.println("<------->");

        //For döngüsü kullanarak 50 ile 60 dereceleri arasını fahrenheit cinsinden ekrana yazdırınız.
        for(int c=20; c<=30; c++) {
            double f = c*1.8+32;
            System.out.println(c+" Derece = "+f+" Fahrenheit");
        }

        //1'den 5'e kadar basit bir çarpım tablosu oluşturun.
        for(int a=1; a<=10; a++) {
            System.out.print(a+"\t");
        }
        System.out.println();
        for(int b=1; b<=10; b++) {
            System.out.print(b*2+"\t");
        }
        System.out.println();
        for(int c=1; c<=10; c++) {
            System.out.print(c*3+"\t");
        }
        System.out.println();
        for(int d=1; d<=10; d++) {
            System.out.print(d*4+"\t");
        }
        System.out.println();
        for(int e=1; e<=10; e++) {
            System.out.print(e*5+"\t");
        }
        System.out.println();
        System.out.println("Nested Loop = ic ice for dongusu");
        /*
        Ic ice for dongusu
        Birçok for döngüsünün iç içe kullanılması ile gerçekleştirilir.
        Nested Loop olarakta bilinir.
         */
        for(int a=1; a<=5; a++) {
            for(int b=1; b<=10; b++) {
                System.out.print((b*a)+"\t");
            }
            System.out.println();
        }

        //Aşağıdaki şekli nested loop kullanarak oluşturun.
                    /*
         **********
         *********
         ********
         *******
         ******
         *****
         ****
         ***
         **
         *
                    */
        for(int a=10; a>=1; a--) {
            for(int b=1; b<=a; b++) {
                System.out.print("*");
            }
            System.out.println();
        }
             /*  Asagidaki sekli olusturun ve yazdirin.
        1*********
        2********
        3*******
        4******
        5*****
        6****
        7***
        8**
        9*
        10
                 */
        for(int a=1; a<=10; a++) {
            System.out.print(a);
            for(int b=10; b>a; b--) {
                System.out.print("*");
            }
            System.out.println();
        }
        // nalan hanim in sorusu
        for (int i =1; i<=5; i++){

            for (int bosluk=1; bosluk<i; bosluk ++){
                System.out.print(" ");
                for (int s=i ; s<=10; s++){
                    System.out.print("*");
                }
                System.out.println();
            }

        }

        // hakan bey in cozumu
        short sayac=6;//ilk satirda kac yildiz olmasini istiyorsak o rakamın 1 ustu girilecek
        for (int i =1; i<=5; i++){//satırı ayarlar

            for (int j=1; j<sayac; j ++){//yildiz yazmaya 1 den baslayacak. sayac in 1 altina kadar yazacak=5
                System.out.print("* ");

            }System.out.println();
            sayac--;//for disinda sayac azalacak ki bir sonraki sefer yildiz 1 eksilsin
        }
        // Yukaridaki ornege kisa cozum.
        for(int a=5; a>=1; a--) {
            for(int b=1; b<=a; b++) {
                System.out.print("* ");
            }
            System.out.println();
        }


    }//main

}//class
