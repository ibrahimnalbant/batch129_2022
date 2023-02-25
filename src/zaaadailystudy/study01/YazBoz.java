package zaaadailystudy.study01;

import java.util.Scanner;

public class YazBoz {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        m2(1, 2, 3, 4, 5);

        System.out.println("Lutfen bir karakter giriniz");
        char harf = scan.next().charAt(0);
        System.out.println(harf);

    }

    public static void m2(int i, int j, int... k) {

        System.out.println(k.length);






    }
}
