package calisma00;

public class KarakterSayisi2 {

    public static void main(String[] args) {

        String kelime = "Fatma";
        kelime = kelime.toLowerCase();
        String alfabe = "0123456789abcdefghijklmnopqrstuvwxyz"; // Bulmak istedigimiz karakterleri belirliyoruz. Buraya istedigimiz karakteri ekleyip cikarabiliriz Ben sadece numara ve harfleri kullandim.
        int[] sayac = new int[alfabe.length()];                //arraydeki kelimeler ile eşleşen karakterleri teker teker almak ve eşleştirme yapmak için array olusturuyoruz

        for (int i = 0; i < kelime.length(); i++) {            //arraydeki kelimelerde Bulmak istedigimiz karakterleri aramak icin LOOP kullaniyoruz.
            int karakter = alfabe.indexOf(kelime.charAt(i));      //alfabedeki index kelimedeki indexle eşleşiyorsa
            sayac[karakter]++;                                    //karakter sayisini arttir ve aramaya devam et

        }for (int i = 0; i < sayac.length; i++) {               //buradaki loopta ise array sayacındaki karakterlerin uzunluguna bak
            if (sayac[i] < 1)                                   //sayacın içindeki karakterin sırası 0 ise bosver. sayma(karakter yok demek)
                continue;

            System.out.println(( ""+ alfabe.charAt(i)+sayac[i]));
        }

    }
}
