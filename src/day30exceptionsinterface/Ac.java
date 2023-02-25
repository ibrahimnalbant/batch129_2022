package day30exceptionsinterface;

public interface Ac {

    //interface'lerin icine "concrete" method koyulamaz, cunku "concrete" method'larda
    //body vardir ve body o method'un isi nasil yapilacagini belirtir. Isin nasil yapilacagi
    //bir cok detay icerir ve bu Child Class'larda kafa karisikligina sebep olur.
    //Halbuki sadece yapilmasi gereken isi soyleyip nasil yapilacagini Child'a birakirsaniz
    //Child Class'in kafa karisikligini engellemis olursunuz.

    //interface'ler "concrete" method iceremezler, dolayisiyla interface'in icindeki hicbirsey istege bagli degildir,
    // hersey Child Class'lar icin mecburidir. Bu yuzden interface'lere "to-do list" de denir.

    // Interface'lerdeki tum method'lar otomatik olarak "public"tir, "abstract"dir, "static" degildir.

    //interface'lerdeki variabler otomatik olarak "public" dir, "static" dir, "final" dir

    void cool();  // abstract method olmasina ragmen "abstract" yazmadik. ama Java kizmiyor. cunku Java Abstract oldugunu biliyor.
                    //     public de silinebilir.cunku java biliyor
    void run();

    public static final int price = 2000;
    String model = "Mitsubishi";





}//class

