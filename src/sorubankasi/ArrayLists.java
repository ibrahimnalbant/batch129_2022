package sorubankasi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayLists {
    public static void main(String[] args) {
        System.out.println("\n****Soru1");
        ArrayList<String> list = new ArrayList<String>();
            list.add("A");
            list.add("B");
            list.add("F");
            list.add("D");
        System.out.println(list); //[A, B, F, D]

            list.set(2,"C");
        System.out.println(list); //[A, B, C, D]

            list.add(1,"*");
        System.out.println(list); //[A, *, B, C, D]

        System.out.println(list.contains("F"));  //false

        System.out.println(list.isEmpty());  //false

        System.out.println("\n****Soru2");
        ArrayList<String> list2=new ArrayList<String>();
        list2.add("A");
        list2.add("B");
        list2.add("C");
        list2.add("D");
        System.out.println(list2); //[A, B, C, D]

        list2.remove(3);
        list2.remove("A");
        System.out.println(list2); //[B, C]

        System.out.println("\n****Soru3");
        ArrayList<String> list3=new ArrayList<String>();
        list3.add("A");
        list3.add("B");
        list3.add("C");
        list3.add("D");
        for (int i=0; i<list3.size(); i++){
            System.out.print(list3.get(i)+" ");  // A B C D
        }

        System.out.println("\n****Soru4");
        System.out.println(list3.remove(2));
        System.out.println(list3);
        System.out.println(list3.remove("C"));

        System.out.println("\n****Soru5");
        int arr[]=new int[5];
        ArrayList<Integer> list5=new ArrayList<Integer>();
        for (int i = 1; i <=arr.length ; i++) {
            list5.add(i);
        }
        System.out.println(list5); //[1, 2, 3, 4, 5]

        System.out.println("\n****Soru6");

        ArrayLists obj1=new ArrayLists();
        obj1.myMethod(obj1.list6);
        obj1.list6.add("z");
        obj1.list6.add("t");
        System.out.println(obj1);         // sorubankasi.ArrayLists@17550481
        System.out.println(obj1.list6);   // [x, y, z, t]

        System.out.println("\n****Soru7");
        ArrayList<Character> list7=new ArrayList<Character>();
        for (char i = 'a'; i <= 'e' ; i++) {
            list7.clear();
            list7.add(i);
        }
        System.out.println(list7); // [e]

        System.out.println("\n****Soru9");
        List<Integer> list9 = new ArrayList<>();
        list9.add(3);
        list9.add(5);
        list9.add(7);
        list9.add(9);
        int i = 0;
        int x = 0;
        while(i<list9.size()) {
            x = x + list9.get(i);
            i++;
        }
        System.out.println(x);

        System.out.println("\n****Soru10");
        int arr10[] = {2, 4, 6, 8};
        List<Integer> list10 = new ArrayList<>();
        int e = 0;
        do {
            list10.add(arr10[e]);
            e++;
        } while (e < arr10.length);
        System.out.println(list10); //[2, 4, 6, 8]  Array'i list'e çeviriyor
        System.out.println(Arrays.toString(arr10)); //[2, 4, 6, 8]

        System.out.println("\n****Soru11");
        List<Integer> list11 = new ArrayList<>();
        list11.add(5);
        list11.add(2);
        list11.add(4);
        list11.add(3);
        list11.add(1);
        System.out.println(list11); //[5, 2, 4, 3, 1]
        list11.remove(4);
        System.out.println(list11); //[5, 2, 4, 3]
        System.out.println(list11.remove("4")); // false
        System.out.println(list11.remove(3)); // 3





    }//main

    //Soru6
    List<String> list6=new ArrayList<String>();

    public List<String> myMethod(List<String> list6){
        list6.add("x");
        list6.add("y");
        return list6;
    }


}//class

/*
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ArrayList Methodlari~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        // 1-add() methodu list e eleman eklemek icin kullanilan methoddur. index li de eklenebilir index sizde eklenebilir.
        // 2-set() methodu var olan bir elemani baskasiyla degistirmeye yarar.
        // 3-remove() methodu silmeye yarar iki sekilde yapilir.
        // i)--index kullanarak siler
        // ii)--direk elaman belirtilerek kullanilan ilk yerdeki elemani siler
        // 4-sort() methodu elemanlari a dan z ye buyukten kucuge naturel order seklinde siralar.
        // Bunu yaparken """"Collections.sort()"""" seklinde yapar.
        // 5-contains() methodu ise list te bir elemanin var olup olmadigini kontrol eder true ve false olarak dondurur.
        // 6-get() methodu ise List te istenen index teki elemanlari getirir.
        // 7-size() methodu kac eleman oldugunu verir.uzunlugu da diyebiliriz.
        // Onemli noktasi array in uzunlugunu length verirken Array list te size verir.
        // 8-clear() methodu adi ustunde temizlik yapar tum elemanlari siler.
        // 9-isEmpty methodu ise List in ici bos ise true dolu ise false olarak dondurmeye yarar.
        // 10-equals() methodu ise List lerin yani birden fazla list in icindeki elemanlari kiyaslar
        // Esit ise true degilse false dondurur...
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        // Soru uzerinde gosterilmis olacak tum methodlar...

        // 1)Elemanlari A, C, E, ve F olan
        // bir String ArrayList olusturup ekrana yazdiriniz.
        List<String> list1 = new ArrayList<>();
        list1.add("A");
        list1.add("C");
        list1.add("E");
        list1.add("F");
        System.out.println(list1); // [A, C, E, F]
        // 1. sorunun devaminda sunlar isteniyor
        // indexsiz add() methodunu kullanarak, B yi ekleyiniz.
        // indexli add() methodunu kullanarak, L yi 1 numarali indexe ekleyiniz.
        // ArrayList i ekrana yazdiriniz, list boyle olmali; A, L, C, E, F, B.
        list1.add("B");
        System.out.println(list1); // [A, C, E, F, B]
        list1.add(1, "L");
        System.out.println(list1); // [A, L, C, E, F, B]

        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        // 2)set() methodu kullanarak, E yi D yapiniz.
        // ArrayList i ekrana yazdiriniz, list boyle olmali; A, L, C, D, F, B.
        list1.set(3, "D");
        System.out.println(list1); // [A, L, C, D, F, B]

        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        // 3)remove() methodu kullanarak, F yi siliniz.
        // ArrayList i ekrana yazdiriniz, list goyle olmali; A, L, C, D, B.
        // Remove un 2 yontemle kaldirilma yolu var. bunlari uygulayalim.
        // 1. yontem ;
        // list1.remove("F"); // bunu aktif edince index degistiginden dolayi bu sekilde
        // uygulamis olduk.
        System.out.println(list1); // [A, L, C, D, B]
        // 2. yontem ;
        list1.remove(4);
        System.out.println(list1); // [A, L, C, D, B]
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        // 4)sort() methodu kullanarak, elemanlari alfabetik siraya diziniz.
        // ArrayList i ekrana yazdiriniz, list boyle olmali; A, B, C, D, L.
        Collections.sort(list1);
        System.out.println(list1); // [A, B, C, D, L]
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        // 5)contains() methodu kullanarak, L nin list de var oldugunu ve
        // M nin list de var olmadigini dogrulayiniz.
        boolean sonuc = list1.contains("L");
        boolean sonuc1 = list1.contains("M");
        System.out.println(sonuc); // true
        System.out.println(sonuc1); // false
        // 2. yol ;
        System.out.println(list1.contains("L")); // true
        System.out.println(list1.contains("M")); // false
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        // 6)get() methodu kullanarak istenen 2. indexi dondurur
        System.out.println(list1.get(2)); // C
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        // 7)size() methodu kullanarak, list in kac eleman oldugunu ekrana yazdiriniz.
        System.out.println(list1.size()); // 5

        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        // 8)clear() methodu kullanarak, list deki tum elemanlari siliniz.
        list1.clear();
        System.out.println(list1); // []

        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        // 9)isEmpty() methodu kullanarak, list deki tum elemanlarin silindigini
        // dogrulayiniz
        System.out.println(list1.isEmpty()); // true
        // Soru bitti fakat kalan methodu hatirlatma icin yaziyoruz...

        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        // 10)equals() methodu iki ayri list te ki elamanlari kiyaslayip true veya false
        // dondurur..
        List<String> first = new ArrayList<>();
        List<String> second = new ArrayList<>();
        // iki bos list olusturup esit mi diye sorduk.
        // Bos oldugu icin bize true dondurdu...
        System.out.println(first.equals(second)); // true
        // Sonraki adimda first list icine a harfi ekleyip sorunca false dondurdu.
        first.add("a"); // first'e a harfi ekledik.
        System.out.println(first.equals(second)); // false
        System.out.println("a");
    }
}
 */
