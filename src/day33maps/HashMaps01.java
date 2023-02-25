package day33maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMaps01 {
    /*
    1) Map'ler "USA = 400,000,000" seklinde data depolamamiz gerektiginde kullanilir.
    2) "USA = 400,000,000" data'sinin "USA" kismi "key" olarak adlandirilir ve "key"ler uniqie'dir.
    3) "USA = 400,000,000" data'sinin "400,000,000" kismi "value" olarak adlandirilir ve "value"ler tekrarli olabilir
    4) Map'lerde depoladiginiz her bir data'ya "Entry" denir. "Eleman" denmez.
    5) "Entry" ler "unique" dir. Cunku key kisimlari unique oldugundan herbir "Entry" digerlerinden farklidir

     )"HashMap" cok hizlidir cunku "HashMap"ler "entry"leri siralama ile ugrasmazlar.
     7)"HashMap"lerde bir tane "key"i "null" yapabilirsiniz.
     8) "HashMap"lerde birden fazla "value"u "null" yapabilirsiniz.
     9)"HashMap"ler "multi thread" icin kullanilamaz ve "synhronization" yoktur.

     */

    public static void main(String[] args) {
        //HashMap nasil olusturulur?
        HashMap<String, Integer> hm = new HashMap<>();

        //HashMap'lere nasil entry eklenir?
        hm.put("USA", 400000000);
        hm.put("Germany", 85000000);
        hm.put("Albania", 3000000);
        //Ayni "key"i kullanarak yeni bir "entry" eklerseniz var olan "value u update etmis olursunuz.
        hm.put("Albania", 2800000);
        hm.put(null, 12000000);
        hm.put(null, 18000000);
        hm.put("Myanmar", null);
        hm.put("Btuhan", null);

        System.out.println(hm); // {null=18000000, Myanmar=null, USA=400000000, Btuhan=null, Germany=85000000, Albania=2800000}

        //HashMap'lerde sadece "key" leri almak istiyorum
        //Returns a Set view of the keys contained in this map.
        Set<String> hmKeys = hm.keySet();
        System.out.println(hmKeys); //[null, Myanmar, USA, Btuhan, Germany, Albania]
        System.out.println(hm.keySet());  //[null, Myanmar, USA, Btuhan, Germany, Albania]

        //HashMap'lerde sadece "value" lari almak istiyorum
        //Exm.1: hm Map'indeki ulkelerin toplam nufusunu bulunuz.
        Collection<Integer> hmValues =hm.values();
        int sum = 0;
        for (Integer w: hmValues) {
            if (w!=null){
                sum = sum + w;
            }
        }
        System.out.println(sum);  // 505800000

        //HashMap;lerde belirli bir "key' nin "value" sunu nasil alabiliriz.
        Integer usaPopulation = hm.get("USA");
        System.out.println(usaPopulation); // 400000000

        //HashMap'lerde replace() methodu varolan bir "key"nin "value"sunu degistirmek icin kullanilir.
        hm.replace("Btuhan", 35000);
        System.out.println(hm); //{null=18000000, Myanmar=null, USA=400000000, Btuhan=35000, Germany=85000000, Albania=2800000}

        hm.putIfAbsent("USA", 700000000);
        System.out.println(hm);//{null=18000000, Myanmar=null, USA=400000000, Btuhan=35000, Germany=85000000, Albania=2800000}
        hm.putIfAbsent("India", 700000000);
        System.out.println(hm);//{null=18000000, Myanmar=null, USA=400000000, Btuhan=35000, Germany=85000000, Albania=2800000, India=700000000}


        //Exm.2: Yeni ogretmenin maasi standart ucretten 1000TL fazla, eski ogretmenin maasi standart ucretten 2000TL fazla olsun.
        HashMap<String,Integer> salaries = new HashMap<>();
        salaries.put("Ali", 8000);
        salaries.put("Ayse", 5000);
        salaries.put("Veli", 9000);
        salaries.put("Tom", 9900);
        /*
        String teacherName = "Kemal";

        salaries.putIfAbsent(teacherName, 11000);

        System.out.println(salaries);//{Tom=9900, Veli=9000, Ayse=5000, Kemal=11000, Ali=8000}
        String teacherNamee = "Tom";
        salaries.put(teacherNamee, 12000);
        System.out.println(salaries);//{Tom=12000, Veli=9000, Ayse=5000, Kemal=11000, Ali=8000}
        */
//      String teacherName = "Kemal";
//        if (salaries.keySet().contains(teacherName)) {
//            salaries.put(teacherName, 12000);
//        } else {
//            salaries.putIfAbsent(teacherName, 11000);
//        }
//               System.out.println(salaries);//{Tom=9900, Veli=9000, Ayse=5000, Kemal=11000, Ali=8000}
        String teacherName = "Tom";
        if (salaries.keySet().contains(teacherName)) {
            salaries.put(teacherName, 12000);
        } else {
            salaries.putIfAbsent(teacherName, 11000);
        }
        System.out.println(salaries);//{Tom=12000, Veli=9000, Ayse=5000, Ali=8000}


        //replace("USA",400000000,500000000) methodu key USA ve value 400000000 ise value'u 500000000 yapar
        hm.replace("USA",400000000,500000000);
        System.out.println(hm);//{null=18000000, Myanmar=null, USA=500000000, Btuhan=35000, Germany=85000000, Albania=2800000, India=700000000}


        //"getOrDefault()" olan "key" lerin degerini verir, olmayan "key"ler icin de sizin ikinci parametrede yazdiginiz degeri verir
        Integer r = hm.getOrDefault("Btuhan", 100);
        System.out.println(r);// 35000
        Integer r1 = hm.getOrDefault("Tutan", 0);
        System.out.println(r1);// 0

        //entrySet(); "Map"i "Set"e cevirir.
        //Setlerin methodlarini kullanabilmek icin entrySet(); methodu kullanilarak Map'i Set'e cevirebiliriz.
        // Map'i Set'e cevirdigimizde Set'in butun ozelliklerini kullanabiliriz. Mesela loop gibi.
        // entrySet(); method'unu kullandiginizda elde ettiginiz Set'in elemanlari "Map.Entry<String,Integer>" seklinde bir Map olur.
        //Bu yuzden elemanlar icin Map method'lari kullanilabilir.
        Set<Map.Entry<String,Integer>> myEntries = hm.entrySet();
        System.out.println(myEntries);//[null=18000000, Myanmar=null, USA=500000000, Btuhan=35000, Germany=85000000, Albania=2800000, India=700000000]

        //Exm.3: Ulke ismindeki character sayisini ulke nufusuna ekleyen ve sonucu consola yazdiran kodu yaziniz.
        for (Map.Entry<String,Integer> w : myEntries) {

            if (w.getValue() != null && w.getKey() != null) {
                int toplam = w.getValue() + w.getKey().length();
                System.out.println(toplam);// 500000003 \n 35006 \n 85000007 \n 2800007 \n 700000005
            }
        }



    }//main

}//class
