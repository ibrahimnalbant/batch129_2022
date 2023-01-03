package calisma00;

import java.util.Scanner;

public class Palindrome {
    /*
      Crteate a program checks if a String is PALINDROME or not.
      If a word, phrase, or sequence that reads the same backword as forward then it is called "palindrome",
      For Example : "madam" or "nursesrun" .
      Kuulanıcının girdiği bir  String'in PALINDROME olup olmadığını kontrol eden bir method create ediniz
      polindrome :tersten okunuşu da aynı olan ifadeierdir.
      ornek : Ey edip Adanada pide ye,  Traş niçin şart
       */
    public static void main(String[] args) {
        System.out.println("************* Soru 1 *****************");
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Çıkış İçin 'Q' giriniz. \nBir ifade giriniz:");
            String str = scan.nextLine().toLowerCase();
            if (str.equals("q")) {
                break;
            } else {
                String[] ch = str.split("");
                String newStr = "";

                for (int i = ch.length - 1; i >= 0; i--) {
                    newStr += ch[i];

                }
                if (str.equals(newStr)) {
                    System.out.println("\"" + str + "\" ifadesi Palindrome dur.\n");
                } else {
                    System.out.println("\"" + str + "\" ifadesi Palindrome değildir.\n");
                }

            }
        }

    }
}
