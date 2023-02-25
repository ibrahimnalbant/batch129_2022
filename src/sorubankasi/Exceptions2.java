package sorubankasi;

public class Exceptions2 {

    public static void main(String[] args) {

        System.out.println("\n******Soru1");
        try {
            run();
        } catch (Exception e) {
          System.out.println(e.getMessage());
        }

        System.out.println("\n******Soru5a");
        Integer z = 0;
        try {
            String s = "1234";
            z = Integer.parseInt(s);
        }catch(NumberFormatException e) {
            System.out.println(e);
        }
        System.out.println(z);

        System.out.println("\n******Soru5b");
        Integer d = 0;
        try {
            String g = "abcd";
            d = Integer.parseInt(g);
        }catch(NumberFormatException e) {
            System.out.println("Good");
        }
        System.out.println(d);

        System.out.println("\n******Soru5c");
        Integer f = 0;
        try {
            String g = "abcd";
            f = Integer.parseInt(g);
        }catch(NumberFormatException e) {
            System.out.println("Good");
        }
        System.out.println(f);

        System.out.println("\n******Soru5d");
        String s = "abcd";
        try {
            Object obj = new Integer(12);
            s = (String) obj;
        }catch(ClassCastException e){
           System.out.println("Good");
        }
        System.out.println(s);

        System.out.println("\n******Soru6a");
        try {
            m(-12);
        }catch(IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n******Soru7");
        try {
            int a = 0;
            System.out.println("Hi");
            int b = 20 / a;
            System.out.println("How are you?");
        } catch (ArithmeticException e) {
            System.out.println("Good");
        } finally {
            System.out.println("Bad");
        }

        System.out.println("\n******Soru8");
        try {
            int a[]= {7, 8, 9};
            for (int i = 1; i <= 3; i++){
                System.out.println(a[i]);
            }
        } catch(Exception e) {
            System.out.println ("Out of index");
        } finally {
            System.out.println("Done!");
        }

        System.out.println("\n******Soru9");

        int num1 = 2;
        int num2 = 22;

        try {
            System.out.println(num1/num2);
        }catch(ArithmeticException e) {
            System.out.println("Do not divide by 0");
        }finally {
            System.out.println("Done");
        }

        System.out.println("\n******Soru11");
        String s1 = "";
        String s2 = null;
        try {
            s1 = s1 + "J";
            System.out.println(s2.length());
            s1 = s1 + "a";
        }catch(ArithmeticException e) {
            s1 = s1 + "v";
        }catch(NullPointerException e) {
            s1 = s1 + "u";
        }finally{
            s1 = s1 + "n";
        }
        s1 = s1 + "e";
        System.out.println(s1);



    }//main

    //Soru1
    private static void run() {
        throw new RuntimeException("Run more");
    }

    //Soru6a
    public static void m(int x) {
        if(x<0 || x>9) {
            throw new IllegalArgumentException("Good");
        }else {
            System.out.println(x);
        }
    }

    /*
    A) finally{} try-catch block'dan sonra kullanılır.
    finally block exception atılsa da atılması da çalışır.
    B) final variable'larin değerleri değiştirilemez ve final variable'lar mutlaka initialize edilmelidirler.
    C) final method'lar override edilemezler.
    D) final class'lara extend edilemez.
    E) finalize() method, Garbage Collector datalari imha etmeden once çalıştırılır.
     */


}//class
