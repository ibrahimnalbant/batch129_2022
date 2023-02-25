package day32collections;

import java.util.LinkedHashSet;

public class LinkedHashSet01 {
    public static void main(String[] args) {

        //LinkedHashSet olusturma
        LinkedHashSet<String> artist = new LinkedHashSet<>();

        artist.add("Ajda");
        artist.add("Tom");
        artist.add("Brad");
        artist.add("Angelina");
        artist.add("Tom");
        //"Set"ler tekrarsiz eleman icerirler.
        //Siz ayni elemani tekrar tekrar eklerseniz Java hata vermez, ama tekrarli eklenen elemani "Set"e sadece bir kere koyar
        System.out.println(artist); // [Ajda, Tom, Brad, Angelina, Tom]  set'lerde tekrarli eleman olmaz (Tom)
                                    //[Ajda, Tom, Brad, Angelina] bu sekilde olur. Burada gorulen Tom en son gorulendir

        LinkedHashSet<String> actress = new LinkedHashSet<>();
        actress.add("Ajda");
        actress.add("Angelina");

        artist.removeAll(actress);
        System.out.println(artist);  // [Tom, Brad]







    }//main

}//class
