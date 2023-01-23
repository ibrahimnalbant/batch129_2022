package practice_DTNT.practice06;

public class C02_Varargs {
    //Verilen sayilardan ilki haric tum sayilari
    // toplayip ilk sayiyla carpan bir method olusturunuz (Varargs kullanarak)

    public static void main(String[] args) {

        int sayi1=5;
        int sayi2=7;
        int sayi3=2;
        int sayi4=4;
        int sayi5=9;
        int sayi6=3;

        sonuc(sayi1, sayi2, sayi3, sayi4,sayi5,sayi6);


    }//main

    private static void sonuc(int carpilacakSayi,int ...toplanacakSayi) {
        int toplam=0;

        for ( int w : toplanacakSayi ) {
            toplam +=w;
        }

        System.out.println(toplam);//25
        int sonuc = toplam*carpilacakSayi;  //25*5=125
        System.out.println("sonuc = " + sonuc);//125
    }
}//Class
