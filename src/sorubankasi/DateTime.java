package sorubankasi;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTime {
    public static void main(String[] args) {

        System.out.println("\n****Soru1");
        LocalDate date = LocalDate.now();

        System.out.println(date);   //2023-02-09
        System.out.println(date.plusMonths(2)); //2023-04-09
        System.out.println(date.minusDays(5));  //2023-02-04

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MMM/yyyy");
        System.out.println(dtf.format(date));         //     09/Feb/2023

        System.out.println("\n****Soru2");
        LocalTime time = LocalTime.now();

        System.out.println(time);   //23:06:02.024943500
        System.out.println(time.plusMinutes(11));   //23:17:02.024943500
        System.out.println(time.minusHours(2)); //21:06:02.024943500

        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("hh:mm");
        System.out.println(dtf1.format(time));  //11:06

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("HH:mm");
        System.out.println(dtf2.format(time));  //23:06

        System.out.println("\n****Soru3");
        int x=5;
        change(x);
        System.out.println(x);  // change method x=20; demesine ragmen sonuc 5(main icindeki degeri en son atiyor.)

        System.out.println("\n****Soru6");
        LocalDate date6=LocalDate.now();
        System.out.println(date6);  //2023-02-10

        DateTimeFormatter dtf6=DateTimeFormatter.ofPattern("dd:MMM:yy");
        System.out.println(dtf6.format(date6));           //10:Feb:23

        dtf6=DateTimeFormatter.ofPattern("dd/MMMM/yyyy");
        System.out.println(dtf6.format(date6));// 10/February/2023

        dtf6=DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(dtf6.format(date6));// 10/02/2023

        System.out.println("\n****Soru7");
        for(int i=1; i<4; i++) {
            for(int k=3; k>1; k--) {
                System.out.println(i + "==>" + k);
            }
        }

        System.out.println("\n****Soru8");
        int a[] = {1, 2};
        int b[] = {3, 2, 1};
        for(int w : a) {
            for(int m : b) {
                System.out.print(w + m + " ");
            }
        }

        System.out.println("\n****Soru9");
        LocalDate currentDate=LocalDate.now();
        System.out.println(currentDate.plusDays(3).minusMonths(4).plusYears(2));
                                                            //2024-10-13

    }//main

    //soru 3
    public static void change(int x){
        x=20;
    }


}//class
