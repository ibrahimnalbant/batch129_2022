package calisma00;

public class PracticeSokrative20230110 {

    public static void main(String[] args) {
        /*
        StringBuilder strBld = new StringBuilder(6);

        strBld.append("Learn");

        strBld.append("Java");

        System.out.println(strBld);

         */
            /*
        StringBuilder strBld = new StringBuilder("John ");

        strBld.append("Woo ").append("Leo").deleteCharAt(6);

        System.out.println(strBld);

             */
        /*
        StringBuilder strBld = new StringBuilder("LearnJava");

           strBld.insert(0,"You");
           System.out.println(strBld); // YouLearnJava

           strBld.substring(3);
           System.out.println(strBld);//  LearnJava

           strBld.delete(5, 9);
            System.out.println(strBld); // Learn (5 dahil 9 dahil degil demektir.)

           strBld.reverse();
           System.out.println(strBld); // avaJnraeL
            */


 //       StringBuilder str = new StringBuilder(7);

 //       str.append("Java");

 //       System.out.println(str.capacity() + "," + str.length());  // 7,4

//        StringBuilder str = new StringBuilder("LearnJava");

 //       str.setCharAt(5, 'L');

 //       System.out.println(str); // LearnLava

 //       StringBuilder str = new StringBuilder("LearnJava");

  //      str.deleteCharAt(3);

 //       System.out.println(str.substring(2, 6));  // anJa

 //       StringBuilder str = new StringBuilder("LearnJava");
//     int index = str.indexOf("a", 4);
 //   System.out.println(index); // 6

//        StringBuilder str = new StringBuilder("LearnJava");
//      int index = str.indexOf("e", 4);
 //    System.out.println(index); // -1

//        StringBuilder str = new StringBuilder("LearnJava");
//        int index = str.indexOf("earn");
//        System.out.println(index); // 1

//        StringBuilder str = new StringBuilder("LearnJava");

//        str.reverse();

//        System.out.println(str); // avaJnraeL
        /*
        String str2 = "LearnJava";

        String str3 = "";

        for(int i = 0; i<=str2.length()-1; i++) {

            str3 = str3 + str2.charAt(i);

        }

        System.out.println(str3); // LearnJava
        */
        /*
        String str2 = "LearnJava";

        String str3 = "";

        for(int i = str2.length()-1; i>=0; i--) {

            str3 = str3 + str2.charAt(i);

        }

        System.out.println(str3); // avaJnraeL
        */
            /*
        String str2 = "LearnJava";

        String str3 = "";

        for(int i = str2.length()-1; i>=0; i++) {

            str3 = str3 + str2.charAt(i);

        }

        System.out.println(str3);  // String index out of range: 9
            */

        // Bilgi: append(char[] ch) method'u char array eklemek icin kullanilir.
        /*
        StringBuilder stb = new StringBuilder("Learn ");

        char[] ch = new char[] { 'J', 'A', 'V', 'A' };

        stb.append(ch);

        System.out.println(stb); // Learn JAVA
*/
        /*
        String str = "Learn";

        str = str + "Java";

        System.out.println(str); // LearnJava
        */
        /*
        String str = "Learn";

        System.out.println(str + "Java"); //LearnJava
        */

        /*
        String str = "Learn";

        join("Java");

        System.out.println(str);

    }
    public static String join(String str) {

        return str + "Java"; // Learn
*/
/*
        StringBuilder sb3 = new StringBuilder("Learn");

        System.out.println("Before trim: " + sb3.capacity()); // Before trim: 21

        sb3.trimToSize();

        System.out.println("After trim: " + sb3.capacity()); // After trim: 5
*/
        /*
      StringBuilder sb = new StringBuilder();
      System.out.println(sb.length() + " - "  + sb.capacity());  // 0-16

      StringBuilder sb = new StringBuilder(9);
      System.out.println(sb.length() + " - "  + sb.capacity());  // 0-9

       StringBuilder sb = new StringBuilder("StringBuilder");
       System.out.println(sb.delete(3, 6).toString() + " - " + sb.length()); // StrBuilder - 10

       StringBuilder sb = new StringBuilder("Java");
       System.out.println(sb.length() + " - "  + sb.capacity()); // 4 - 20

         */





    }//main

}//class
