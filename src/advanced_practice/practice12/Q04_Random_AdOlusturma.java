package advanced_practice.practice12;

import java.util.Random;

public class Q04_Random_AdOlusturma {
    //Rastgele alınan harfleri bir Stringe ekleyerek adınızı oluşturan ve bunu
    // kaç deneme ile yaptığını yazdıran bir kod yazınız.

    public static void main(String[] args) {
        String alfabe = "abcçdefgğhıijklmnoöprsştuüvyzABCÇDEFGĞHIİJKLMNOÖPRSŞTUÜVYZ ";
        String isim = "Fatma Nalbant";
        String yeniIsim = "";

        int sayac = 0;

        for (int i = 0; i < isim.length(); i++) {

            while (true) {
                char rastgeleHarf = alfabe.charAt((int) (Math.random() * alfabe.length()));
                sayac++;
                if (isim.charAt(i) == rastgeleHarf) {
                    yeniIsim += rastgeleHarf;
                    System.out.println("yeniIsim = " + yeniIsim);
                    System.out.println("sayac = " + sayac);
                    break;
                }
            }
        }

        System.out.println("sayac = " + sayac);
    }
}//class

/*
import java.util.Random;

public class NameGenerator {
    public static void main(String[] args) {
        String name = "";
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        Random random = new Random();
        int count = 0;
        while (!name.equals("yourName")) {
            char c = alphabet.charAt(random.nextInt(alphabet.length()));
            name += c;
            count++;
        }
        System.out.println("Adınız: " + name);
        System.out.println("Adınızı bulduğum deneme sayısı: " + count);
    }
}
Bu kod, rastgele alınan harfleri bir String'e ekleyerek adınızı oluşturmaktadır.
İstenen ad "yourName" olana kadar döngü devam eder ve her döngüde, rastgele bir harf seçilir ve ada eklenir.
 Bu işlem kaç kez yapıldığı, count değişkeni ile tutulur.
 Son olarak adınız ve adınızı bulmak için kaç deneme yaptığınız ekrana yazdırılır.
 */
