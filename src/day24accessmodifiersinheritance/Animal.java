package day24accessmodifiersinheritance;

    /*
        Inheritance'in faydalari;
        1) Code standardında tekrar iyi değildir.
        2) Code değişime açık olmalıdır.Hatayı düzeltmek kolay olmalı.
        3) Gelişime update'e açık olmalıdır
        4) Code atomic yapıda olmalı.
        Note 1:  "parent class"(super class)(ortak ozellikleri icerir)-
                    "child class"(sub class)(Class'a ozel ozellikleri icerir)
        Note 2: Bir parent class'a bağlı child class'ı belirtmek için "extends" keyword kullanırız
        Note 3: "public" mrthod'lar "child class'lar tarafindan kullanilabilir"
                "child class'lar tarafindan kullanilabilir" demek "inherit edilebilir" demektir.
        Note 4: "protected" method'lar "inherit edilebilir"
                Cunku "protected" olan metthod ve variable'lar child'lar tarafindan kullanilabilir.
        Note 5: "default" method'lar object ile ayni package'de olduklari surece "inherit edilebilir".
                Ama default method ile object'in uretildigi class farkli package'lerde ise inherit edilemezler.
        Note 6: "private" method'lar "inherit edilemezler".
        Note 7: Java "birden fazla parent" i (multiple inheritance Java tarafindan desteklenmez) onaylamaz".
        Note 8: Child --> Parent --> Grand Parent --> Grand Grand Parent .... seklinde
                    ilerleyen inheritance'lara "multilevel inheritance" denir.
        Note 9: Java da "Object Class" tum Java Class'larinin ortak parent'idir.
        Note 10: Java da "Object Class" haric tum class'larin parent'i vardir.
                    Java da parent'i olmayan tek class "Objact Class"dir.
        Note 11: Java'da "parent" dan "child" a dogru giden iliskilere (yukaridan asagiya) HAS-A Relationship denir.
                Java'da "child" dan "parent" a dogru giden iliskilere (asagidan yukariya) IS-A Relationship denir.
        Note 12: Java'da her class'in bir tane default constructor'i vardir.
                Bu default constructor class'in icinde gorunmez cunku default constructor "Object Class" icindedir.
                Bizim class'imiz default constructor'a ihtiyac duyduğunda
                    parent olan "Object Class"a gider ve oradaki constructır'ı kullanır.
     */

public class Animal {

    public void eat(){
        System.out.println("Animals eat....");
    }

    public void drink(){
        System.out.println("Animals drink....");

    }

}
