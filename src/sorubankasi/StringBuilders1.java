package sorubankasi;

public class StringBuilders1 {
    public static void main(String[] args) {

        System.out.println("\n****Soru1");

        StringBuilder strBld = new StringBuilder(6);

        strBld.append("Learn");
        strBld.append("Java");

        System.out.println(strBld); // LearnJava
        System.out.println(strBld.length());    //9
        System.out.println(strBld.capacity());     //14

    /*
    StringBuilder kullandiginizda baslangic kapasitesi 6 olarak verilmistir.
    Fakat kapasite asilmasi otomatik olur ve verilen degerin 2 katina 2 eklenerek yeni kapasite olusturulur.
    bu kapasiteye istenen veri append edilebilir.
     */

        System.out.println("\n****Soru2");

        StringBuilder strBld2 = new StringBuilder("LearnJava");
        System.out.println(strBld2);//LearnJava

        strBld2.substring(3);
        System.out.println(strBld2);    //LearnJava
        //substring() method'u StringBuilder ustunde kullaninca StringBuilder'in orijinal degeri degismez
        String strBld21=strBld2.substring(3);
        System.out.println(strBld21);   //rnJava

//        strBld2.insert(0,"You");
//        System.out.println(strBld2);    //YouLearnJava
//        strBld2.reverse();
//        System.out.println(strBld2);    //avaJnraeL
//        strBld2.delete(5,9);
//        System.out.println(strBld2);    //Learn

        System.out.println("\n****Soru3");

        StringBuilder strBld3 = new StringBuilder("John ");
        strBld3.append("Woo ").append("Leo").deleteCharAt(6);
        System.out.println(strBld3);    //John Wo Leo


        System.out.println("\n****Soru4");

        StringBuilder str41 = new StringBuilder("LearnJava");
        str41.deleteCharAt(3);
        System.out.println(str41.substring(2, 6));  //anJa

        StringBuilder str42 = new StringBuilder("LearnJava");
        str42.setCharAt(5, 'L');
        System.out.println(str42);  //LearnLava

        StringBuilder str43 = new StringBuilder(7);
        str43.append("Java");
        System.out.println(str43.capacity() + "," + str43.length());    //7,4

        System.out.println("\n****Soru5");

        StringBuilder str51 = new StringBuilder("LearnJava");
        int index = str51.indexOf("earn");
        System.out.println(index);  //1

        StringBuilder str52 = new StringBuilder("LearnJava");
        int indx = str52.indexOf("a", 4);
        System.out.println(indx);   //6
        System.out.println(str52.indexOf("a", 4));  //6

        StringBuilder str53 = new StringBuilder("LearnJava");
        int idex = str53.indexOf("e", 4);
        System.out.println(idex);   //-1

        System.out.println("\n****Soru6");

        StringBuilder str6 = new StringBuilder("LearnJava");
        str6.reverse();
        System.out.println(str6);   //avaJnraeL

        String str62 = "LearnJava";
        String str63 = "";
        for(int i = str62.length()-1; i>=0; i--) {
            str63 = str63 + str62.charAt(i);
        }
        System.out.println(str63);  //avaJnraeL

        System.out.println("\n****Soru7");

        //Bilgi: append(char[] ch) method'u char array eklemek için kullanılır.

        StringBuilder stb7 = new StringBuilder("Learn ");
        char[] ch = new char[] { 'J', 'A', 'V', 'A' };
        stb7.append(ch);
        System.out.println(stb7);   //Learn JAVA


        System.out.println("\n****Soru8");
        String str8 = "Learn";
        str8 = str8 + "Java";
        System.out.println(str8);   //LearnJava

        String str82 = "Learn";
        str82 = str82 + "Java";
        System.out.println(str82);  //LearnJava

        String str83 = "Learn";
        join("Java");
        System.out.println(str83);  //Learn

        System.out.println("\n****Soru9");
        StringBuilder sb9 = new StringBuilder("Learn");
        System.out.println("Before trim: " + sb9.capacity());
        sb9.trimToSize();
        System.out.println("After trim: " + sb9.capacity());

        System.out.println("\n****Soru10");

        StringBuilder sb100=new StringBuilder(9);
        System.out.println(sb100.length()+"-"+sb100.capacity());    //0-9

        StringBuilder sb101 = new StringBuilder();
        System.out.println(sb101.length() + " - " + sb101.capacity());  //0 - 16

        StringBuilder sb102 = new StringBuilder("Java");
        System.out.println(sb102.length() + " - " + sb102.capacity());  //4 - 20

        StringBuilder sb103 = new StringBuilder("StringBuilder");
        System.out.println(sb103.delete(3, 6).toString() + " - " + sb103.length()); //StrBuilder - 10


    }//main

    //Soru8
    public static String join(String str83) {
        return str83+"Java";
    }

}//class

