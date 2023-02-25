package advanced_practice.practice12;


import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Q02_Map_FiyatToplamEntrySet {
    /*
Bir map içerisinde verilen fiyatların toplamını bulan bir kod yazınız.(for each loop kullanınız)
    Örn: {Kemer=19.99, Gömlek=29.99, Ayakkabı=89.99, Kazak=24.99, Kravat=19.99} ==> Toplam: 184.95


     */
    public static void main(String[] args) {

        Map<String, Double> urunlerFiyatlar = new HashMap<>();
        urunlerFiyatlar.put("Kemer: ", 19.99);
        urunlerFiyatlar.put("Gomlek: ", 25.99);
        urunlerFiyatlar.put("Ayakkabi: ", 45.99);
        urunlerFiyatlar.put("Kazak: ", 20.99);
        urunlerFiyatlar.put("Kravat: ", 19.99);


        System.out.println(fiyatToplam(urunlerFiyatlar));

    }//main

    public static double fiyatToplam(Map<String, Double> map) {
        System.out.println("Urunler ve fiyatlar: " + map);


        double toplam = 0;

        for (Map.Entry<String, Double> w : map.entrySet()) {
            toplam+=w.getValue();

        }


        return toplam;

    }
}//class
