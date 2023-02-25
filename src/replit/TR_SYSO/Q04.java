package replit.TR_SYSO;

public class Q04 {
    /*
    Dairenin alanini ve cevresini hesaplayan java kodunu yaziniz.
    r=7;
    Pi=3.14

    Ipucu:
    Dairenin Cevresi : 2*Pi*r
    Dairenin Alani : Pi*r*r

    Ornek Cikti:
            43.96
            153.86
            */
    public static void main(String[] args) {
        double r = 7;
        double Pi = 3.14;

        double circumference = 2 * Pi * r;
        double area = Pi * r * r;

        System.out.println("Cevre: " + circumference);
        System.out.println("Alan: " + area);

    }
}
