package practice_DTNT.practice06;

public class C05_WhileLoopDoWhileLoop {
    public static void main(String[] args) {

        // Ne zaman While Loop, Ne zaman Do While Loop kullanilir?

        // 0'dan baslayip 6'ya kadar 1'er 1'er artarak yazdiran kodu olusturunuz

        int i=0;

        while (i<7){      // 7 rakam (data)yazdirmak icin 8 kontrol yapti. cok calisti yani


            System.out.print("i = " + i+" ");
            i++;
        }
        System.out.println();

        int b=0;

        do {  // 7 rakam (data)yazdirmak icin 7 kontrol yapti. daha az calisti yani
            System.out.print("b = "+b+" ");
            b++;
        }while (b<7);//kontrol en sonda yapildi


    }
}
