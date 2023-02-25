package day37lambda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class Lambda02 {
    public static void main(String[] args) throws IOException {

        //Ex1: LambdaTextFile dosyasi icindeki metni console'a yazdiran kodu yaziniz.
        System.out.println("\n *****Example1:");

        Files.lines(Paths.get("src/day37lambda/LambdaTextFile.txt")).forEach(System.out::println);

        //Ex2: LambdaTextFile dosyasi icindeki her character'i uppercase yapiniz.
        System.out.println("\n *****Example2:");

        Files.
                lines(Paths.get("src/day37lambda/LambdaTextFile.txt")).
                map(String::toUpperCase).
                forEach(System.out::println);

        //Ex3:LambdaTextFile dosyasi icinde herhangi bir kelimanin var olup olmadigini gosteren kodu yaziniz.
        System.out.println("\n *****Example3:");

        boolean result1 = Files.
                                lines(Paths.get("src/day37lambda/LambdaTextFile.txt")).
                                map(t->t.split(" ")).
                                flatMap(Arrays::stream).
                                anyMatch(t->t.contains("Java"));// herhangi bir kelime "java" ise sonuc true olur.
                        System.out.println(result1);

        //Ex4: LambdaTextFile dosyasi icindeki her kelimenin "a" icerip icermedigini gosteren kodu yaziniz.
        System.out.println("\n *****Example4:");

        boolean result2 = Files.
                                lines(Paths.get("src/day37lambda/LambdaTextFile.txt")).
                                map(t->t.split(" ")).
                                flatMap(Arrays::stream).
                                allMatch(t->t.contains("a"));// her kelime "a" harfini iceriyorsa sonuc true olur aksi halde false olur
        System.out.println(result2);

        //Ex5: LambdaTextFile dosyasi icindeki hicbir kelimenin "x" icermedigini gosteren kodu yaziniz.
        System.out.println("\n *****Example5:");

        boolean result3 = Files.
                lines(Paths.get("src/day37lambda/LambdaTextFile.txt")).
                map(t->t.split(" ")).
                flatMap(Arrays::stream).noneMatch(t->t.contains("x"));
        System.out.println(result3);
        /*
            AnyMath: Vereceğimiz şarta bağlı olarak Stream içerisinde gezinir ve
            herhangi bir elemanla eşleşme durumunda true dönecektir.


            AllMatch: Verilen şarta göre Stream içerisindeki tüm elemanların
            bu şarta uyması durumunda true dönecektir.


            NoneMatch: Şarta göre Stream içindeki hiç bir
            elemanın şartı sağlamaması durumunda true dönecektir.
         */

        //Ex6: LambdaTextFile dosyasi icinde "r" ile biten kelimeleri sayan kodu yaziniz.
        System.out.println("\n *****Example6.1:");

        long result4=Files.
                                lines(Paths.get("src/day37lambda/LambdaTextFile.txt")).
                                map(t->t.split(" ")).
                                flatMap(Arrays::stream).
                                filter(t->t.endsWith("r")).
                                count();
        System.out.println(result4);



    }//main
}//class
