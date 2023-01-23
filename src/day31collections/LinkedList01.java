package day31collections;

import java.util.LinkedList;

public class LinkedList01 {

        /*
        1)interface'lerden object olusturulamaz cunku interface'lerin constructor'i yoktur.
        2)Abstract Class'lardan object olusturulamaz, constructor'lari vardir ama constructor object olusturmada kullanilamaz.
        3)interface'lerin constructor'lari olmadigindan collection olustururken interface isimleri "new" keyword'unden sonra kullanilamaz.
        4)*class --> class ==> extends
              class --> interface ==> implements
              *interface --> interface ==> extends
              interface --> class ==> Bu mumkun degildir.
        5)ArrayList'ler eleman silme ve eleman eklemede basarisizdirlar. O yuzden eleman silme ve ekleme islemleri coklukla
             yapilacaksa ArrayList kullanmak tavsiye edilmez.
        6)LinkList'ler index kulanmadiklarindan eleman silme ve eklemede re-index yapilmasina gerek yoktur. Bu da LinkList
             leri eleman ekleme ve silmede cok basarili hale getirir. Bu yuzden eleman ekleme ve silmenin cok yapilmasi gereken
             durumlarda LinkList kullanmak tavsiye edilir.
        7)ArrayList'lerde "search" islemi kolay yapilir cunku index'ler adres gibidir.
        8)LinkedList'lerde "search" islemi zor yapilir cunku LinkedList'ler index kullanmaz index kullanmayinca herhangi
             bir elemani bulmak icin en bastan tum elemanlar kontrol edilir bu da cok fazla is demektir.

     1)Interface'lerden object olusturulamaz cunku interface'lerin constructor'i yoktur.
     2)Abstract Class'larda object olusturulamaz,constructor'lari vardir ama constructor object olusturmada kullanilamaz.
     3)Interface'lerin constructor'lari olmadigindan collection olustururken interface isimleri "new" keyword'unden
     sonra kullanilamaz.
     4)*class --> class ==> extends  1.yi 2.nin child'i yapmak icin
       class --> interface ==> implements
       *interface --> interface ==> extends
       interface --> class ==> Bu mumkun degil
       Ayni isimliler (* koyduk)"extends" ile, farkli isimliler "interface" ile child yapilir.
     6)LinkedList'lerde eleman yerine "Node" kelimesi kullanilir. En bastaki Node'a "Head", en sondaki Node'a "Tail" denir.
     7)LinkedList'ler yapiları dolayisiyla index kullanmadıklarından, eleman silmede ve eklemede re-index yapilmasına gerek yoktur.
   Bu da LinkedList'leri eleman ekleme ve silmede çok başarılı hale getirir, bu yüzden eleman ekleme ve silmenin çok yapılması
   gereken durumlarda LinkedList kullanmak tavsiye edilir.
     8)LinkedList'lerde "search" islemi zor yapilir cunku LinkedList'ler index kullanmaz index kullanmayinca herhangi
 bir elemani bulmak icin en bastan tum elemanlar kontrol edilir bu da cok fazla is demektir.

        */

    public static void main(String[] args) {

        LinkedList<String> cityNames = new LinkedList<>();

        LinkedList<String> names = new LinkedList<>();
        names.add("Steve");
        names.add("Ajda");
        names.add("Raj");
        names.add("Megan");
        names.add("Brandon");
        System.out.println(names); // [Steve, Ajda, Raj, Megan, Brandon]

        names.addFirst("Cuneyt");
        System.out.println(names); //[Cuneyt, Steve, Ajda, Raj, Megan, Brandon]

        names.addLast("Ajda"); // "addLast" is (This method is) equivalent to add.
        System.out.println(names); // [Cuneyt, Steve, Ajda, Raj, Megan, Brandon, Ajda]

        names.add(3,"Suleyman"); //aslinda index kullanmiyor, pointeri index gibi gosteriyor.
                                                // node'u index gibi kullaniyor.
        System.out.println(names); // [Cuneyt, Steve, Ajda, Suleyman, Raj, Megan, Brandon, Ajda]

        names.remove("Ajda"); // Ilk Ajda'yi siler ve loop'u kirar
        System.out.println(names); // [Cuneyt, Steve, Suleyman, Raj, Megan, Brandon, Ajda]

        names.remove(4);
        System.out.println(names); // [Cuneyt, Steve, Suleyman, Raj, Brandon, Ajda]

        names.add("Suleyman");
        names.add("Suleyman");
        System.out.println(names);//[Cuneyt, Steve, Suleyman, Raj, Brandon, Ajda, Suleyman, Suleyman]

        String r1=names.remove(); // Retrieves and removes the head (first element) of this list. (Cut + Paste)
                                    // ilk elemani siler ve size verir
        System.out.println(r1); // Cuneyt // ilk elemani sildi ve sildigini bize verdi (Retrives and removes)
        System.out.println(names); //[Steve, Suleyman, Raj, Brandon, Ajda, Suleyman, Suleyman]

        names.removeFirstOccurrence("Suleyman");
        System.out.println(names);//[Steve, Raj, Brandon, Ajda, Suleyman, Suleyman]

        names.removeLastOccurrence("Suleyman");
        System.out.println(names);//[Steve, Raj, Brandon, Ajda, Suleyman]

        String r2 =names.peek();//Retrieves, but does not remove, the head (first element) of this list. (Copy + Paste)
                                // Returns:  the head of this list, or null if this list is empty
                                //ilk elemani silmeden size verir
        System.out.println(r2);//Steve
        System.out.println(names);//[Steve, Raj, Brandon, Ajda, Suleyman]

        names.poll();//Retrieves and removes the head (first element) of this list.
                    //Returns: the head of this list, or null if this list is empty
        //remove() bos Linkedlist'te kullanilirsa "hata verir", poll() bos LinkedList'te kullanilirsa "null" verir.

        names.pop();//removes and returns the first element of this list.
        //This method is equivalent to removeFirst().
        //Returns: the element at the front of this list (which is the top of the stack represented by this list)


    }//main

}//class
