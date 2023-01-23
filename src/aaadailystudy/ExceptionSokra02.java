package aaadailystudy;

public class ExceptionSokra02 {

/*
    public static void main(String[] args) {

        public static int divide(a,b) {
            int a = 2 ;
            int b = 8;

            if (a < b) {
                throw new ArithmeticException("bu islemi yapma");
            }
        }


        int num1 = 22;
        int num2 = 2;

//    try {
//      //  divide();
//
//        System.out.println(num1/num2);
//
//    }catch(ArithmeticException e) {
//
//        System.out.println("Do not divide by 0");

//    }finally {

        System.out.println("Done");

    }
}//main
}//class

 */

    static  int b=22;
    static   int a;
    public static void main(String[] args){



        try {

            islem();
        }catch(Exception e) {
            System.out.println("bu sekilde islem hatali**  "+ e.getMessage());

        }finally  {
            System.out.println("!!!!");
        }
    }//main


    private static void islem() {

        if (a <b){
            throw new ArithmeticException("bu sekilde islem yapma");

        }
    }//method islem
}//class

