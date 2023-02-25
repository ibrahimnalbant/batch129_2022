package sorubankasi;

public class VarargsAccessModifiers {
    public static void main(String[] args) {

        System.out.println("\n****Soru1");
        System.out.println(m1(true, false, true));

        System.out.println("\n****Soru2");
        m2(1, 2, 3, 4);
        m2(1, 2, 3, 4, 5);
        m2(1, 2);
       // m2(1);    Compile Time Error verir

        System.out.println("\n****Soru3");
        m3("Result: ", 2, 3, 4);
        // m3("Result: ", 2, 2.5);  Compile Time Error verir. "int" arguman istedigi icin.
        m3("Result: ");
        m3("Result: ", 2);

        System.out.println("\n****Soru5");
        m5(10);
        m5(11,12,13,14);

        System.out.println("\n****Soru6");
        m6("Java",101,102);
        // m6(100, 101, 102);   // CTE
        // m6(101, 102);        // CTE
        // m6(100, 101, "102"); // CTE

        System.out.println("\n****Soru7");
        System.out.println("Bir class member'i default yapmak için herhangi bir access modifier yazmayız. Fakat bir class \n" +
                "member'i protected yapmak için \"protected\" yazmak zorundayız.");
        System.out.println("default class member'lara diğer package'lardan ulaşılamaz fakat protected olanlara diğer \n" +
                "package'lardaki child class'lardan ulaşılabilir");
        /*
        diğer ismi "package private" olan access modifier "default"dir.
        Bu access modifier, sadece aynı paket içindeki sınıflardan erişilebilir.
        Erişim belirleyicisi belirtilmediyse varsayılan olarak "default" kullanılır.
         */
        /*
        Bir sınıfın access modifier'i ile metodunun access modifier'i farklı olsa bile,
        metodun access modifier'i genellikle daha kısıtlayıcıdır.
        Bu, metodun erişilebilirliğini sınıfın erişilebilirliğinden daha fazla sınırlandığı anlamına gelir.
        Örneğin, bir sınıf "public" olarak tanımlanmış olsa bile,
        içindeki bir metod "private" olarak tanımlanmışsa,
        o metod sadece o sınıfın içindeki diğer metodlardan erişilebilir, ancak diğer sınıflardan erişilemez.
         */



    }//main


    //Soru1
    public static int m1(boolean b1, boolean... b2){
        return b2.length;
    }
    //Soru2
    public static void m2(int i, int j, int... k) {
        System.out.println(k.length);
    }
    //Soru3
    public static void m3(String x, int... y) {
        int p = 1;
        for(int w: y) {
            p = p * w;
        }
        System.out.print(x);
        System.out.println(p);
    }
    //Soru5
    static void m5(int...a){
        System.out.println("==>"+a.length);
        for (int i: a) {
            System.out.println(i+" ");
        }
        System.out.println();
    }
    //Soru6
    static void m6(String str, int...a){
        System.out.println(str);
        for(int i:a){
            System.out.print(i+" ");
        }
        System.out.println();
    }

}//class
