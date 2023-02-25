package sorubankasi;

import java.util.Scanner;

public class StringMethods {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        /*

        // soru 1  kullanicidan ismi aldiktan sonra tum harfleri buyuk harfe cevir ve yazdir.

        System.out.println("Lutfen isminizi yaziniz...");

        String isim = scan.nextLine();

        // isim = isim.toUpperCase();

        System.out.println(isim.toUpperCase());

        // Soru 2
        String str = "sarikanarya";

        System.out.println(str.charAt(4));
        System.out.println(str.charAt(0));
        System.out.println(str.length());
        System.out.println(str.charAt(str.length()-1));

        // Soru 3
        String str = "Ayhan Beyhan";

        System.out.println(str.toLowerCase());
        System.out.println(str.replace("h",""));
        System.out.println(str.replace("han", "ol"));
        System.out.println(str.length());



        // Soru 4

        String str = "Java ah java";

        System.out.println(str.contains("j"));
        System.out.println(str.contains("x"));
        System.out.println(str.contains("ja"));

        // soru 5
        String str1 = "Ali";
        String str2 = "ali";

        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println(str2.equals(str1));
        System.out.println(str2.equalsIgnoreCase(str1));


        // Soru 6
        !(false)=true  dogru
        !(!true)=true  dogru
        !(4<5)=false   dogru
        !(2>3)=false   yanlis

        // Soru 7
        String str1 = "ali";
        String str2 = "Ali";

        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println(str1==str1);
        System.out.println(str1.equals(str2));
        System.out.println((str1+str2).equals(str2+str1));

        // Soru 8
        String str = "seyhan yavuz";

        System.out.println(str.replace("s","S"));
        System.out.println(str.replace("y","Y"));

        System.out.println(str.replaceAll("s","S"));
        System.out.println(str.replaceAll("y","Y"));

        System.out.println(str.replace('s','S'));
        System.out.println(str.replace('y','Y'));

        // System.out.println(str.replaceAll('s','S')); incompatible types: char cannot be converted to java.lang.String
        // System.out.println(str.replaceAll('y','Y')); incompatible types: char cannot be converted to java.lang.String

        // Soru 9
        String str = "Java Kolaydir";

        System.out.println(str.endsWith("r"));
        System.out.println(str.endsWith("dir"));
        System.out.println(str.endsWith(""));
        System.out.println(str.endsWith("Java Kolaydir"));

         */
        //Soru 10
        String  b = "Ali 12 ?_";

        System.out.println(b.replaceAll("\\d","*"));
        System.out.println(b.replaceAll("\\D","*"));
        System.out.println(b.replaceAll("\\S","*"));
        System.out.println(b.replaceAll("\\w","*"));




    }//main

}//class
