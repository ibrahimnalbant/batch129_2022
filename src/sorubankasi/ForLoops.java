package sorubankasi;

import java.util.Scanner;

public class ForLoops {
    public static void main(String[] args) {
        /*

        int sum =0;
        for(int i=1; i<6; i++) {
            sum = sum + i;
        }
        System.out.println("Toplam = "+ sum);  // Toplam = 15

        int sum=0;
        for(int i=10; i>0; i=i-5) {
            sum=sum+i;
        }
        System.out.println(sum); // 15

        for (int j = 0; j <= 10 ; j=j+3) {
            System.out.print(j+" "); // 0 3 6 9
        }

        int product = 1;
        for (int i = 5; i >=0 ; i--) {
            product=product*i;
        }
        System.out.println(product);// 0

        for (int i = 1; i <=6 ; i++) {
            System.out.print(i + " ");    // 1 3 5
            i++;
        }

        for (int j = 10; j >0 ; j++) {
            System.out.print("Hello");// sonsuz kere Hello yazdirir.
        }

        for (int i = 'f'; i >'a' ; i--) {
            System.out.print(i+" "); // int i yazinca ASCII degerlerini veriyor // 102 100 98
            i--;
            }

        for (char j = 'f'; j >'a' ; j--) {
                System.out.print(j+" "); // char j yazinca karakterleri veriyor // f d b
                j--;

        for (int count = 1; count <11; count++) {
            System.out.println("Welcome to Java"); // ekrana 10 kere Welcome to Java yazdirir
        }

        for(int i=1; i<=5; i++) {
            for(int j=(5-i); j>1; j--) {
                System.out.print(i+j);    // 543
            }                             // 54
            System.out.println();         // 5
        }

         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Başlangıç değerini giriniz");
        int bas = scan.nextInt();
        System.out.println("Bitis değerini giriniz");
        int bit = scan.nextInt();
        int carpim = 1;
        int toplam = 0;
        if(bas<=bit) {
            for(int i=bas; i<=bit; i++) {
                toplam = toplam + i;
            }
        } else {
            for(int i=bas; i>=bit; i--) {
                carpim = carpim * i;
            }
        }
        System.out.print(carpim);
        System.out.println(toplam);
        scan.close();

    }//main
}//class
