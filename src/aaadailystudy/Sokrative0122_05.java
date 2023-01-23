package aaadailystudy;

public class Sokrative0122_05 {

    public static void main(String[] args) {
            int num1 = 22;
            int num2 = 0;

        try {

            System.out.println(num1/num2);

        }catch(ArithmeticException e) {

            System.out.println("Do not divide by 0");

        }finally {

            System.out.println("Done");

        }
    }//main
}//class
