package sorubankasi;

import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        /*

        int num = 1;
        do {
            System.out.print(num + " ");
            num++;
        }while(num<4);  // 1 2 3

        int num = 1;
        do {
            System.out.print(num + " ");
            num++;
        }while(num<1);  // 1

        int num = 1;
        do {
            System.out.print(num + " ");
            num++;
        }while(num<2); // 1

        num=1;
        while(num<2) {
            System.out.print(num + " "); // 1
            num+=1;
        }

        num=1;
        while(num<=1) {
            System.out.print(num + " ");
            num++;  // 1
        }

        for(num=1; num<2; num++){
            System.out.print(num + " "); // 1
        }

            // while loop once condition'i kontrol eder sonra kodu çalıştırır.
            // do-while loop once kodu çalıştırır sonra condition'i kontrol eder
            // while loop'da body içindeki kod bazı durumlarda hiç çalışmayabilir.
            // do-while loop'da body içindeki kod en az bir kere çalışır.

        int numA=4;
        while(numA<3) {
            System.out.print(numA);  // bisey yazdirmaz
            numA++;
        }

        int numB=4;
        do {
            System.out.print(numB);  // 4
            numB++;
        }while(numB<3);

        int num = 2;
        do {
            System.out.print(num + " ");
            num++;
        }while(num>2);  // sonsuz dongu olusur

        int num=0;
        do {
            System.out.print(num + " ");
            num+=2;
        }while(num<8); // 0 2 4 6

        int num=0;
        do {
            if(num%2==0){
                System.out.print(num + " ");
            }
            num++;
        }while(num<8);// 0 2 4 6

        String str = "AliCan";
        System.out.println(str.substring(2,5)); //iCa

        Scanner scan = new Scanner(System.in);
        System.out.println("Passwordunuzu giriniz");
        String password = scan.nextLine();
        while(!(password.equals("AliCan"))) {
            System.out.println("Yanlış");
            System.out.println("Passwordunuzu giriniz");
            password = scan.nextLine();
        }
        System.out.println("Doğru");

        Scanner scan = new Scanner(System.in);
        String password = "";
        do {
            System.out.println("Passwordunuzu giriniz");
            password = scan.nextLine();

            if(password.equals("AliCan")) {
                System.out.println("Doğru");
            }else {
                System.out.println("Yanlış");
            }

        }while(!(password.equals("AliCan")));

         */
        Scanner scan = new Scanner(System.in);
        String password = "";
        do {
            System.out.println("Passwordunuzu giriniz");
            password = scan.nextLine();

            if(!(password.equals("AliCan"))) {
                System.out.println("Yanlış");
            }
        }while(!(password.equals("AliCan")));
        System.out.println("Doğru");


    }//main
}//class
