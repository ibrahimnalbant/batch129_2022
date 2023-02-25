package advanced_practice.practice12;

import java.util.HashMap;
import java.util.Map;

public class Q05_Map_AdSoyad {
    /*
     İki farklı Array'de aynı indekste barındırırılan ad ve soyadları örnekteki gibi yazdıran bir kod yazınız.
          input : {"John", "Mark", "Ali"}; {"Doe", "Twain", "Can"};
          output : {John=Doe, Mark=Twain, Ali=Can};
     */
    public static void main(String[] args) {
        String[] ad = {"John", "Mark", "Ali", "Mehmet"};
        String[] soyad = {"Doe", "Twain", "Can", "Yilmaz"};

        Map<String,String> adSoyad = new HashMap<>();

        for (int i = 0; i < ad.length; i++) {
            adSoyad.put(ad[i],soyad[i] );

        }

        System.out.println("adSoyad = "+ adSoyad);

        // adSoyad = {John=Doe, Mark=Twain, Mehmet=Yilmaz, Ali=Can}

    }//main






}//class
/*
import java.util.HashMap;

public class Main {

public static void main(String[] args) {

String[] names = {"John", "Mark", "Ali"};
String[] surnames = {"Doe", "Twain", "Can"};
HashMap<String, String> nameSurname = new HashMap<>();

for (int i = 0; i < names.length; i++) {
        nameSurname.put(names[i], surnames[i]);
    }

    System.out.println(nameSurname);
}
}

//Output: {John=Doe, Mark=Twain, Ali=Can}


 */
