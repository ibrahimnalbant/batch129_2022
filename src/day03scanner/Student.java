package day03scanner;

public class Student {

    public String name = "Tom Hanks";   // Pasif Ozellik , Variable
    public byte grade = 8;    // Pasif Ozellik , Variable
    public String address = "Miami";      // Pasif Ozellik , Variable

    public void study(){   // her method da aksiyon vardır. void yeni data üretmiyordur.
        System.out.println("Gunu gunune ders calisir...");  // Aktif ozellik ,  Method
    }

    public void feed(){
        System.out.println("Saglikli beslenir...");   // Aktif ozellik , Method
    }

}
