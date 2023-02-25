package zaaadailystudy.ay01_ocak;

import java.util.Scanner;

public class Scanner03 {

    public static void main(String[] args) {

        //  Kullanıcıdan ad, ikinci ad, soyadı, SSN'yi alın ve ardından aşağıdaki gibi yazdırın

        //Ali Mert Can
        //kkno:123456789

        Scanner input=new Scanner(System.in);
        System.out.println("lutufen Adinize  giriniz");
        String ad = input.next();

        System.out.println("lutufen ikinciIsiminze   giriniz");
        String ikinciIsim = input.next();

        System.out.println("lutufen soyIsminz    giriniz");
        String soyIsminz = input.next();

        System.out.println("lutufen Kimlik kartinize   giriniz");
        int kkno = input.nextInt();

        System.out.println(ad+ " "+ikinciIsim+ " "+soyIsminz);

        System.out.println("kkno : "+kkno);








    }
}
