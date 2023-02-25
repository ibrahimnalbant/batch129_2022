package day32collections;

import java.util.HashSet;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSet01 {
    public static void main(String[] args) {

        long one = System.nanoTime();  // calistirdigimiz andaki nanoTime'i bize soyler.

        TreeSet<Integer> ts = new TreeSet<>();

        ts.add(12);
        ts.add(25);
        ts.add(8);
        ts.add(32);
        ts.add(3);

        System.out.println(ts); // [3, 8, 12, 25, 32]

        long two = System.nanoTime();

        HashSet<Integer> hs = new HashSet<>();

        hs.add(12);
        hs.add(25);
        hs.add(8);
        hs.add(32);
        hs.add(3);
        // elemanlari eklemede HashSet kullanicaz.
        //Sonra da TreeSet ile siraya dizecez
        TreeSet<Integer> hts = new TreeSet<>(hs);
        System.out.println(hts); // [3, 8, 12, 25, 32]
        //System.out.println(hs); // [32, 3, 8, 25, 12]

        long three = System.nanoTime();

        System.out.println("TreeSet in uygulama suresi: " + (two-one));
        System.out.println("HashSet in uygulama suresi: " + (three-two));

        //Note: TreeSet eleman eklemede coookkk yavas, HashSet ise cooook hizlidir.
        //TreeSet'in bu negatif yonunden kurtulmak icin; HashSet olusturur, elemanlari ekler ve sonra HashSet'i TreeSet'e ceviririz.


        int first = ts.first();
        System.out.println(first);// 3

        int last = ts.last();
        System.out.println(last);// 32

        int floor1 = ts.floor(15);
        System.out.println(floor1); //12 ==> 15 eleman degil, verdigin degerin bir kucugunu(oncesini) verir.

        int floor2 = ts.floor(12);
        System.out.println(floor2);//12 ==> 12 elemanlardan biri o yuzden 12 direkt yazdirildi
        // floor() method'u en az en kucuk eleman kadar olabilir.

        int ceiling1 = ts.ceiling(15);
        System.out.println(ceiling1);//25 ==> 15 eleman degil, verdigin degerin bir buyugunu(sonrasini) verir.

        int ceiling2 = ts.ceiling(25);
        System.out.println(ceiling2);//25==> 25 elemanlardan biri o yuzden 25 direkt yazdirildi
        // ceiling() method'u en buyuk en buyuk eleman kadar olabilir.(en buyuk'ten buyuk olamaz)

        SortedSet<Integer> tailSet1 = ts.tailSet(12);
        System.out.println(tailSet1);//[12, 25, 32]==>12 elemanlardan biri, o yuzden 12 ve sonraki alamanlar bir set icinde yazdirildi

        SortedSet<Integer> tailSet2 = ts.tailSet(15);
        System.out.println(tailSet2);//[25, 32]==>15 elemanlardan biri degil, o yuzden 15 den sonraki elemanlar bir set icinde yazdirildi

        NavigableSet<Integer> tailSet3 = ts.tailSet(12,false);
        System.out.println(tailSet3);//[25, 32]==>12 elemanlardan biri normalde 12 ve sonraki elemanlar bir set icinde
                                //yazdirilirdi ama ikinci parametre "false" kullandigim icin 12 haric tutuldu

        NavigableSet<Integer> tailSet4 = ts.tailSet(12,true);
        System.out.println(tailSet4);//[12, 25, 32]

        SortedSet<Integer> headSet1 = ts.headSet(12);
        System.out.println(headSet1);//[3, 8]==>12 elemanlardan biri,"onceki elemanlar" bir set icinde yazdirildi.
                                    // 12 yazdirilmadi. otomatik 12 ye kadar aldi. asagida dahil olani var.

        SortedSet<Integer> headSet2 = ts.headSet(12,true);
        System.out.println(headSet2);//[3, 8, 12]

        Integer higher1 = ts.higher(12);
        System.out.println(higher1);//25 ==> 12'den bir sonraki elemani verir.
        //Normal method'lar parametrelerde belirtilen data type'lari ile calisirlar.
        //Generic Method: Generic Method'lar ise verilen her turlu data type ile calisma becerisine sahiptirler.

        Integer higher2 = ts.higher(15);
        System.out.println(higher2);//25 ==> 15(verilen rakamdan)'den bir sonraki elemani verir.

        Integer lower1 = ts.lower(12);
        System.out.println(lower1);//8 ==>12 den bir onceki elemani verir.

        int lower2 = ts.lower(12);// unboxing isleminden dolayi "int"de calisir.
        System.out.println(lower2);     //Wrapper class ile primitive birbiri yerine kullanilabilir.

    }
}
