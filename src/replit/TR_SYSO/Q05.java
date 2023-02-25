package replit.TR_SYSO;

public class Q05 {
    /*
    Dikdortgenin alanini ve cevresini hesaplayan java kodunu yaziniz.
A=5
B=3
Ipucu:
Dikdortgenin Cevresi : 2*(A+B);
Dikdortgenin Alani : A * B ;
Ornek Cikti:
Dikdortgenin Cevresi : 16
Dikdortgenin Alani : 15
     */

    public static void main(String[] args) {
        int a=5;
        int b=3;

        int dikdortgenCevre=2*(a+b);
        int dikdortgenAlan=a*b;
        System.out.println("Dikdortgenin Cevresi : " + dikdortgenCevre);
        System.out.println("Dikdortgenin Alani : " + dikdortgenAlan);

    }
}
