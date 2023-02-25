package zaaadailystudy.study01;

public class Sokrative0122_06 {
    public static void main(String[] args) {

        try {

            int a = 0;

            System.out.println("Hi");

            int b = 20 / a;

            System.out.println("How are you?");

        } catch (ArithmeticException e) {

            System.out.println("Good");
          //  e.getMessage();  // bu satir mesaj vermiyor
            System.out.println(e);
            System.out.println(e.getMessage());

        } finally {

            System.out.println("Bad");

        }

    }
}//class
