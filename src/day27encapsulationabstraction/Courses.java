package day27encapsulationabstraction;

public abstract class Courses {

    /*
   1)Bazen method body'sini yazmak gerekmez, bu durumlarda body'siz method olusturmak gerekir.
        body'si olmayan method'lara "abstract method" denir.

   2)"abstract method" lar child class'lar tarafindan "override" edilmek zorundadirlar.
        bu yuzden eger bir fonsiyonunun child class'lar tarafindan kullanilmasini mecbur kilmak isterseniz
        o method'u "abstract" yapmak gerekir.

   3)Bir method'un body'sini silmek o method'un abstract olmasi icin yeterli degildir.
        "access modifier" ile "return type" arasina "abstract" keyword koymak gerekir.

   4)"abstract method" lar siradan class'larin icine yazilamazlar. "abstract method"larin icine
        yazildiklari class'lar da abstract olmak zorundadirlar.

   5)"abstract class" larda hem "abstract method" lar hem de "concrete method"lar kullanilabilir.

   6)"Concrete class"lar "abstract class"larin child'i olabilirler.
        "abstract method"larin override edilme zorunlulugu "concrete class"lar icindir.

    //"abstract class" larin parent'daki abstract method'lari override etme zorunlulugu yoktur.
    //mesela; Rooms class abstract class'tir. Rooms Class'i Courses abstract class'inin child'i yaptigim
    // ve override yaptigim halde kod sikayet etmiyor.

     */

    public abstract void math();

    public void art(){

        System.out.println("Painting...");  // concrete method
    }

    //final method'lar override edilemezle, halbuki "abstract" method'lar override edilmek icin olusturulurlar.
        //bu celiskidir. bu yuzden Java abstract method'larin final olmasina musaade etmez.
                     //public final abstract void science();  olmaz.

    //Concrete Class'lar final oldugunda Child Class'a sahip olamazlar.
    //Ama "Abstract Class"lar icin Child Class olmalidir, cunku Child Class'lar
            // abstract parent class'daki abstract method'lari kullanirlar.
    //Bu yuzden, Java "Abstract Class" larin "final" olmasina musaade etmez.

    //"abstract method"lar "private" olamazlar, cunku Child Class'lar abstract method'lari kullanirlar.
     // private yapinca kullanima kapali olur. Bu celiskidir, bu yuzden Java abstract method'larin "private" olmasina musaade etmez.

    //"bastract method"lar "static" olamazlar, cunku "static method"lar override edilemez,
        // halbuki abstract method'lar override edilmek icin olusturulmustur.


}// class
