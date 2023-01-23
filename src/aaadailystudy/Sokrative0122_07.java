package aaadailystudy;

public class Sokrative0122_07 {
    public static void main(String[] args) {

        /*
        Integer z = 0;

        try {

            String s = "abcd";

            z = Integer.parseInt(s);

        }catch(NumberFormatException e) {

            System.out.println("Good");

        }

        System.out.println(z); // Good
                                // 0
        */

        /*
        String s = "abcd";

        try {

            Object obj = new Integer(12);

            s = (String)obj;

        }catch(ClassCastException e){

            System.out.println("Good");

        }

        System.out.println(s);  //Good
                                //abcd
        */
        /*
        Integer z = 0;

        try {

            String s = "abcd";

            z = Integer.parseInt(s);

        }catch(NumberFormatException e) {

            System.out.println("Good");

        }

        System.out.println(z); //Good
                                // 0
        */
        Integer z = 0;

        try {

            String s = "1234";

            z = Integer.parseInt(s);

        }catch(NumberFormatException e) {

            System.out.println(e);

        }

        System.out.println(z);  // 1234

    }//main

}//class
