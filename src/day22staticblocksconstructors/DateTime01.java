package day22staticblocksconstructors;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Date;

public class DateTime01 {

    public static void main(String[] args) {


        Date myDate = new Date();
        System.out.println(myDate);  // Sat Jan 07 23:26:53 EET 2023

        System.out.println(myDate.getTime()); //  1673123332556  ==> 1 Ocak 1970 den su ana kadar ki mili saniye miktari

        // Icinde bulundugumuz an nasil alinir?
        System.out.println(LocalDate.now()); // 2023-01-07

        System.out.println(LocalTime.now()); // 23:35:43.275973700

        System.out.println(LocalDateTime.now()); // 2023-01-07T23:36:31.536656

        //Dunyanin herhangi bir saat dilimindeki saati nasil aliriz?

        System.out.println(LocalDateTime.now().atZone(ZoneId.of("Asia/Tokyo"))); //2023-01-07T23:40:05.213145100+09:00[Asia/Tokyo]

        System.out.println(LocalDateTime.now().atZone(ZoneId.of("Europe/Paris"))); //2023-01-07T23:41:25.900571900+01:00[Europe/Paris]

        System.out.println(LocalDateTime.now(ZoneId.of("Europe/Vienna")));//2023-01-07T21:45:56.717465800

        System.out.println(LocalDateTime.now(ZoneId.of("Europe/Istanbul")));//2023-01-07T23:46:42.732564700


        //Ileriki bir tarihe nasil gidilir?
        System.out.println(LocalDate.now().plusYears(7).plusMonths(5).plusDays(35));//2030-07-12

        //Geriki bir tarihe nasil gidilir?
        System.out.println(LocalDate.now().minusYears(4).minusMonths(3).minusDays(2));//2018-10-05

        //Ileriki bir zamana nasil gidilir?
        System.out.println(LocalTime.now().plusHours(3));//02:56:56.779257900

        //Geriki bir zamana nasil gidilir?
        System.out.println(LocalTime.now().minusMinutes(45));//23:13:22.905304700

        //Zaman'da belli bir bolumu nasil aliriz.(sadece saat ve dakikayi almak gibi)
        System.out.println(LocalTime.now().getHour() + ":" + LocalTime.now().getMinute());//0:1  saat 00:01

        //Tarih'te belli bir bolumu nasil aliriz?
        System.out.println(LocalDate.now().getMonth()+":"+LocalDate.now().getDayOfMonth());//JANUARY:8

        //Iki tarih nasil karsilastirilir?
        //02/13/2005 - 03/01/2007
        boolean result=LocalDate.of(2005,02,13).isBefore(LocalDate.of(2007,03,01));
        System.out.println(result);//true

        boolean result1=LocalDate.of(2005,02,13).isAfter(LocalDate.of(2007,03,01));
        System.out.println(result1);//false

        //Tarih'lerin formatlari nasil degistirilir?
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(dtf.format(LocalDate.now()));//    08/01/2023

        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/MMM/yyyy");
        System.out.println(dtf1.format(LocalDate.now()));// 08/Jan/2023

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd/MMMM/yyyy");
        System.out.println(dtf2.format(LocalDate.now()));// 08/January/2023




    }
}
