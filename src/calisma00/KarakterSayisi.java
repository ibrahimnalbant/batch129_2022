package calisma00;

import java.util.Arrays;
import java.util.Scanner;

public class KarakterSayisi {

    /*
    Kullanicidan bir String aliniz.
    String'de var olan her character'in sayisini ekrana yazdiriniz.
    Ornek: alacan ==> a = 3, l = 1, c = 1, n = 1
           abaa   ==> a=3  b=1
          */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Bir ifade giriniz:");
        String ifade = input.nextLine();
        String arr[] = ifade.split("");
        Arrays.sort(arr);

        int counter = 0;
        String output = ifade + "  ==>  ";

        for (int i = 1; i < arr.length; i++) {

            if (arr[i - 1].equals(arr[i])) {
                counter++;
            } else {
                output += arr[i - 1] + " = " + (counter + 1) + " ";
                counter = 0;
            }
            if (i == arr.length - 1) {
                output += arr[i] + " = " + (counter + 1) + " ";
            }
        }
        System.out.println(output);
    }
}
