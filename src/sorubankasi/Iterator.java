package sorubankasi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/*
  Iterator'lar Loop'ların yaptığı işi yapar.
  Iterator's'lar tıpkı loop'larda olduğu gibi elemanı alarak işleme sokar.
  Java'nın Iterator'ları ortaya çıkarma sebebi Infinite Loop riskini bitirmektir.
  Iterator'larda sonsuz loop yoktur.
  Iterator'lar Java tarafından sonradan oluşturulmuşlardır ve loop'ların yaptıkları bütün işlemleri yapabilirler.
  Loop'lar ile Iterator'larin performance farki yoktur ama Iterator'lar eleman silme ve update etmede daha basarilidirlar.

  Iki tip Iterator var;
    i)Iterator: Sadece eleman'lari remove edebilirsiniz
                    Sadece sol'dan sag'a calisir yani tek yonludur.
    ii)ListIterator: Elemani "remove etme", "update etme", ve "add" yapabilirsiniz.
                        Hem sol'dan saga hem de sag'dan sola calisabilir yani cift yonludur.
 */

public class Iterator {
    public static void main(String[] args) {

        System.out.println("\n*****Soru1a");
        List<String> listA = new ArrayList<>();
        listA.add("X");
        listA.add("Y");
        listA.add("Z");
        ListIterator<String> it1 = listA.listIterator();
        while(it1.hasNext()) {
            Object el = it1.next();

            System.out.print(el + " "); //X Y Z
        }
        System.out.println("\n*****Soru1b");
        List<String> listB = new ArrayList<>();
        listB.add("X");
        listB.add("Y");
        listB.add("Z");
        ListIterator<String> it2 = listB.listIterator();
        while(it2.hasNext()) {
            Object el = it2.next();
            it2.remove();
        }
        System.out.println(listB);  //[]

        System.out.println("\n*****Soru1c");
        List<String> listC = new ArrayList<>();
        listC.add("X");
        listC.add("Y");
        listC.add("Z");
        ListIterator<String> it3 = listC.listIterator();
        while(it3.hasNext()) {
            Object el = it3.next();
            it3.set(el + "!");
        }
        System.out.println(listC);  //[X!, Y!, Z!]

        System.out.println("\n*****Soru1d");
        List<String> listD = new ArrayList<>();
        listD.add("X");
        listD.add("Y");
        listD.add("Z");
        for(String w : listD) {
            w = w + "!";
        }
        System.out.println(listD);  //[X, Y, Z]

        System.out.println("\n*****Soru2a");
        List<String> list2A = new ArrayList<>();
        list2A.add("AB");
        list2A.add("CD");
        list2A.add("EF");
        ListIterator<String> it2A = list2A.listIterator();
        if(it2A.previousIndex()==-1) {
            while(it2A.hasNext()) {
                System.out.print(it2A.next() + " ");
            }
        }else {
            System.out.print("Good Morning!");
        }

        System.out.println("\n*****Soru2b");
        /*
        Not: ListIterator interface'inin previousIndex() method 'u verilen elemanın index'ini return eder.
        Bu method pointer list'in basina yerlestirildiginde -1 return eder.
         */
        List<String> list2B = new ArrayList<>();
        list2B.add("AB");
        list2B.add("CD");
        list2B.add("EF");
        ListIterator<String> it2B = list2B.listIterator();
        if(it2B.previousIndex()!=-1) {
            while(it2B.hasNext()) {
                System.out.print(it2B.next() + " ");
            }
        }else {
            System.out.print("Good Morning!");
        }

        System.out.println("\n*****Soru3a");
        /*
        Not: ListIterator interface'inin nextIndex() method 'u verilen elemanın index'ini return eder. Bu
        method pointer list'in sonuna yerleştirildiğinden -1 return eder.
         */
        List<String> list3A = new ArrayList<>();
        list3A.add("AB");
        list3A.add("CD");
        list3A.add("EF");
        ListIterator<String> it3A = list3A.listIterator();
        if(it3A.nextIndex()==-1) {
            while(it3A.hasNext()) {
                System.out.print(it3A.next() + " ");
            }
        }else {
            System.out.print("Good Morning!");  //Good Morning!
        }

        System.out.println("\n*****Soru3b");
        List<String> list3B = new ArrayList<>();
        list3B.add("AB");
        list3B.add("CD");
        list3B.add("EF");
        ListIterator<String> it3B = list3B.listIterator();
        if(it3B.nextIndex()!=-1) {
            while(it3B.hasNext()) {
                System.out.print(it3B.next() + " ");    //AB CD EF
            }
        }else {
            System.out.print("Good Morning!");
        }

        System.out.println("\n*****Soru4");
        List<String> list4 = new ArrayList<>();
        list4.add("AB");
        list4.add("CD");
        list4.add("EF");
        ListIterator<String> it4 = list4.listIterator();
        Collections.reverse(list4);
        while(it4.hasNext()) {
            System.out.print(it4.next() + " ");
        }
        /*
        iterator ile ilgili aşağıdakiler;
        A) Iterator kullanarak, collection'daki elemanlari okuyabilir ve silebiliriz.
        B) Iterator collection içinde bastan sona doğru ilerleyebilmemize imkan sağlar.
        C) Iterator kullandığımızda index'lerle çalışamayız.
        D) Iterator kullanarak bir collection'a eleman ekleyemeyiz.

        ListIterator ile ilgili aşağıdakiler;
        A) ListIterator collection içinde bastan sona ve sondan basa doğru ilerleyebilmemize imkan sağlar.
        B) ListIterator sadece List'ler için kullanılabilir.
        C) ListIterator'da set() method'unu kullanarak elemanları değiştirebiliriz.
        D) ListIterator'da aşağıdaki method'larin hepsini kullanmak mümkündür;
        next(), previous(), hasNext(), hasPrevious(), add(), set(), nextIndex(), previousIndex().
         */
        System.out.println("\n*****Soru7");
        List<Integer> list7 = new ArrayList<>();
        list7.add(22);
        list7.add(23);
        list7.add(24);
        ListIterator<Integer> it7 = list7.listIterator();
        while(it7.hasNext()) {
            it7.next();
        }
        while(it7.hasPrevious()) {
            Integer el = it7.previous();
            it7.set(el = el + 3);
            System.out.print(el + " ");
        }

        System.out.println("\n*****Soru8");
        List<Integer> list8 = new ArrayList<>();
        list8.add(12);
        list8.add(13);
        list8.add(14);
        list8.add(15);
        list8.add(16);
        System.out.println(list8);
        ListIterator<Integer> it8 = list8.listIterator();
        int idx = 0;
        while(it8.hasNext()) {
            Integer el = it8.next();
            if(idx>2) {
                break;
            }
            it8.set(el = el*2);
            System.out.print(el + " ");
            idx++;
        }






    }//main


}//class
