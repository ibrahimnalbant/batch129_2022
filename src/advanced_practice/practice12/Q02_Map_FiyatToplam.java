package advanced_practice.practice12;


import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Q02_Map_FiyatToplam {
    /*
Bir map içerisinde verilen fiyatların toplamını bulan bir kod yazınız.(for each loop kullanınız)
    Örn: {Kemer=19.99, Gömlek=29.99, Ayakkabı=89.99, Kazak=24.99, Kravat=19.99} ==> Toplam: 184.95

    Bu kod, Map veri yapısının içindeki tüm fiyatların toplamını hesaplamaktadır.
    for-each döngüsü ile mapin içindeki değerlerin tümünü dolaşır ve toplam değişkenine her bir fiyatı ekler.
    Son olarak toplam değer döndürülür.

    public static double calculateTotalPrice(Map<String, Double> prices) {
        double total = 0;
        for (double price : prices.values()) {
            total += price;
        }
        return total;
    }

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

        Collection<Double> fiyatlar = map.values();
        System.out.println("fiyatlar = " + fiyatlar);

        double toplam = 0;
        for (double w : fiyatlar) {
            toplam += w;

        }

        return toplam;

    }
}//class
