package practice_DTNT.practice03;

import java.util.Arrays;
import java.util.Scanner;

public class C04_ArraysKarakterleriSaydir {

      /*
               INTERWIEW QUESTIONS
                         Kullanicidan bir String aliniz.
                         String'de var olan her character'in sayisini ekrana yazdiriniz.
                         Ornek: alacan ==> a = 3, l = 1, c = 1, n = 1
                                abaa   ==> a=3  b=1
    */

    // O    D   E   V  \\

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Bir String Giriniz :");

        String str = input.nextLine(); //alican
        String arr[]= str.split(""); // a ve l (her harf) harfleri arasi hiclik vardir.
                                            // o yuzden hiclikten ayirdik.split

        System.out.println(Arrays.toString(arr)); // [a, l, i, c, a, n]

        Arrays.sort(arr);
        int counter=0;

        for (int i = 1; i <arr.length ; i++) {

            if (arr[i-1].equals(arr[i])) {
                counter++; // Ayni olanlar icin 1 artir

            }else{
                System.out.println(arr[i-1] + " karakteri " + (counter+1) + " kez kullanilmistir");
                counter = 0; // baska harfe gectigi icin sifirlanmali
            }
            if (i==arr.length-1) {
                System.out.println(arr[i] + " karakteri " + (counter + 1) + " kez kullanilmistir");
            }
        }
    }
}
