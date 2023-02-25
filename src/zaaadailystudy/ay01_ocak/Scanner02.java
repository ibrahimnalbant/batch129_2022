package zaaadailystudy.ay01_ocak;

import java.util.Scanner;

public class Scanner02 {

    public static void main(String[] args) {

        //  uzunluk, genişlik, yükseklik olan dikdörtgenler prizmasının hacmini hesaplayan bir program yazıniz
        // İpucu: dikdörtgenin hacmi= width*height*length;

        Scanner input=new Scanner(System.in);
        System.out.println("Uzunlugu giriniz ");
        double length= input.nextDouble();

        System.out.println("Genisligi  giriniz ");
        double width= input.nextDouble();

        System.out.println("Yuksekligi  giriniz ");
        double height= input.nextDouble();

        System.out.println("Dikdortgen hacmi :" + length*width*height);


        System.out.println("Dikdortgen hacmi "+DikdortgenHacmi(12,3,5));
        System.out.println("Dikdortgen hacmi "+DikdortgenHacmi(length,width,height));

    }

    public static double DikdortgenHacmi(double length,double width, double height){
        return  length*width*height;

    }
}
