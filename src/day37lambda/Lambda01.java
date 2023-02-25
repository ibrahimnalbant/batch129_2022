package day37lambda;

import day36lambda.Utils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Lambda01 {
    public static void main(String[] args) {

        List<Integer> myList = new ArrayList<>();
        myList.add(12);
        myList.add(8);
        myList.add(23);
        myList.add(10);
        myList.add(7);

        System.out.println("\n *****Example1:");
        System.out.println(getSumOfAllElements(myList));
        System.out.println("\n *****Example2:");
        System.out.println(getSumFromToSeventy());
        System.out.println("\n *****Example3:");
        System.out.println(getMultFrom3ToNine1());
        System.out.println("\n *****Example3.1:");
        System.out.println(getMultFrom3ToNine2());
        System.out.println("\n *****Example4:");
        System.out.println(getFactorial(5));
        System.out.println("\n *****Example5:");
        System.out.println(getSumOfEvensBetweenTwoInt(15,5));
        System.out.println("\n *****Example6:");
        System.out.println(getSumOfDigitsBetweenTwoInts(12,18));
        System.out.println("\n *****Example7:");




    }//main

    //Example 1: Verilen list'teki tum sayilarin toplamini veren method'u olusturunuz.
    public static int getSumOfAllElements(List<Integer> myList){
        return myList.stream().reduce(Math::addExact).get();

    }

    //Ex2: 7'den 70'e kadar tum tamsayilarin toplamini veren kodu yaziniz.
    public static int getSumFromToSeventy(){

        return IntStream.rangeClosed(7,70).reduce(Math::addExact).getAsInt();
    }
    //Ex3: 3'den 9'a kadar tum tamsayilarin carpimini veren methodu olusturunuz.rangeClosed() ile

    public static int getMultFrom3ToNine1(){

        return IntStream.rangeClosed(3,9).reduce(Math::multiplyExact).getAsInt();
    }

    //Ex3.1: 3'den 9'a kadar tum tamsayilarin carpimini veren methodu olusturunuz.(range()) ile
    public static int getMultFrom3ToNine2(){

        return IntStream.range(3,10).reduce(Math::multiplyExact).getAsInt();
    }
    //Ex4: Size verilen sayinin faktoriyelini hesaplayan kodu yaziniz.

    public static int getFactorial(int x){

        if (x==0){
            return 1;
        } else if (x<0) {
            System.out.println("Faktoriyel islemi negatif sayilarla yapilamaz");
            return -1;
        }else {
            return IntStream.rangeClosed(1,x).reduce(Math::multiplyExact).getAsInt();
        }


    }
    //Ex5: Size verilen iki tamsayi arasindaki tum cift sayilarin toplamini veren kodu yaziniz.

    public static int getSumOfEvensBetweenTwoInt(int a,int b){

        if (a>b){
            int temp = a;
            a=b;
            b=temp;

        }   // bu kismi yaptik cunku range'de ikinci rakam ilk rakamdan buyuk olmali

       return IntStream.range(a+1,b).filter(Utils::isNumberEven).sum();

    }
    //Ex6:Size verilen iki tamsayi arasindaki tum tamsayilarin rakamlari toplamini veren kodu yaziniz.
    //12 ve 18 ==> 13 14 15 16 17 ==> 4+5+6+7+8 = 30

    public static int getSumOfDigitsBetweenTwoInts(int a, int b){
        if (a>b){
            int temp = a;
            a=b;
            b=temp;}

      return   IntStream.range(a+1,b).map(Utils::getSumOfDigitis).sum();
    }
    //Exm7:





}//class
