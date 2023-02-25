package sorubankasi;

import java.util.Scanner;

public class NestedTernarySwitch {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        /*

        //soru 1

        System.out.println("Lutfen bir buyuk harf giriniz");

        String harf = input.next();

        char m = harf.charAt(0);

        switch (m){
            case 'A':
                System.out.println("First letter");
                break;
            case 'B' :
                System.out.println("Second letter");
            case 'C':
                System.out.println("Third letter");
                break;
            case 'D' :
                System.out.println("Fourth letter");
            default:
                System.out.println("What kind of letter is this?");
        }

        // Soru 2

        System.out.println("Lutfen 1'den 7'ye kadar bir gun sayisi girin.");
        int dayNum = input.nextInt();

        switch (dayNum){
            case 1:
                System.out.println("Sunday");
             //   break;
            case 2:
                System.out.println("Monday");
             //   break;
            case 3:
                System.out.println("Tuesday");
             //   break;
            case 4:
                System.out.println("Wednesday");
             //   break;
            case 5:
                System.out.println("Thursday");
             //   break;
            case 6:
                System.out.println("Friday");
             //   break;
            case 7:
                System.out.println("Saturday");
                break;

            default:
                System.out.println("Enter a valid day number");


        }

        // Soru 3
        int y =  10;
        int x = (y>5) ? (y<10 ? 2+y : 3*y) : (y>10 ? 2*y : 3+y);
        System.out.println(x);
        y = 4;
        int x1 = (y>5) ? (y<10 ? 2+y : 3*y) : (y>10 ? 2*y : 3+y);
        System.out.println(x1);
        y=11;
        int x2 = (y>5) ? (y<10 ? 2+y : 3*y) : (y>10 ? 2*y : 3+y);
        System.out.println(x2);
        y=1;
        int x3 = (y>5) ? (y<10 ? 2+y : 3*y) : (y>10 ? 2*y : 3+y);
        System.out.println(x3);


        // Soru 4

        char f='P';
        String str = (f > 'a' && f<'z') ? (f<'f' ? "Good" : "Bad") : (f>'K' ? "B!g" : "Small");
        System.out.println(str);



        // Soru 5
        int y=-17;
        boolean result = (y%2==0 || y<13) ? (true) : (y<0 ? true : false);
        System.out.println(result);


        // Soru 6

        int a=44;
        String result = (a%2!=0 && a>29) ? ("Good") : ("Bad");
        System.out.println(result);


        //Soru 7
        int i = 1;
        int  j = 0;
        switch (i) {
            case 2 :
                j += 6;
            case 4 :
                j += 1;
            case 1 :
                j += 4;
            default :
                j += 2;
        }
        System.out.println("j = " + j);

        // Soru 8
        char ch = 'a';
        switch (ch){
            case 'a' :
            case 'A' :
                System.out.print(ch);
                break;
            case 'b' :
            case 'B' :
                System.out.print(ch);
                break;
            case 'c' :
            case 'C' :
                System.out.print(ch);
                break;
            case 'd' :
            case 'D' :
                System.out.print(ch);
        }



        // Soru 9

        int number = 3;
        if(number == 1) {
            System.out.println("One");
        }
        if(number == 2){
            System.out.println("Two");
        }
        if(number == 3){
            System.out.println("Three");
        }


        int number = 3;
        switch(number) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            default:
                System.out.println("Done");
        }
         */
        // Soru 10
        int variable = 1;
        switch (variable){
            case 1:
                System.out.print("P");
            case 2:
            case 3:
                System.out.print("Q");
                break;
            case 4:
                System.out.print("R");
            default:
                System.out.print("S");
        }



        }//main
}//class
