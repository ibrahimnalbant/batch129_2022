package practice_DTNT.practice07;

public class StringBuilderKiyas {

        /*
         * For loop ile 1000 defa bir islem yapalim. Oncesinde ve sonrasinda zamani
         * kontrol edip StringBuilder ve String class'larinin performanslarini
         * karsilastiralim.
         * Ipucu: long TimeSb = System.nanoTime(); kullanalim
         */

    public static void main(String[] args) {

        String str ="Merhaba";

        long time1 =System.nanoTime();
        for (int i = 0; i <1000 ; i++) {
            str+=" ";
        }
        long time2 = System.nanoTime();
        long stringSure = time2-time1;
        System.out.println("stringSure = " + stringSure);


        ////////////////// ************************* \\\\\\\\\\\\\\\\\\\\\\
        StringBuilder sb = new StringBuilder("Merhaba");
        long time3 =System.nanoTime();
        for (int i = 0; i <1000 ; i++) {
            sb=sb.append(" ");
        }
        long time4 =System.nanoTime();
        long stringBuilderSure = time4-time3;
        System.out.println("stringBuilderSure = " + stringBuilderSure);

        if(stringBuilderSure>stringSure){
            System.out.println("String Builder daha yavas calisti");
        }else if(stringBuilderSure<stringSure){
            System.out.println("String daha yavas calisti");
        }else
            System.out.println("Her ikiside esit surede calisti");
    }
}
  /*
    String = daha yavas ,Immutable==> degismez,
                StringBuffer =mutable==>degisebilir,less efficient/ daha yavas ,
                StringBuffer synchronized,thread safe.
                StringBuilders = mutable==>degisebilir ,
                not senkronized/not thread safe,fakat more efficient(daha etkili,ve hizli )
                1) String Class'i immutable(Degistirilemez)dir.
                Java mutable degisebilir Stringler uretebilmemiz icin
                StringBuilder  class'i uretmistir.
                2) Java'da StringBuilder ile hemen hemen ayni isi yapan birde
                StringBuffer classida vardir. "StringBuffer" Class'i StringBuilder
                Class'indan daha once uretilmistir.
                "StringBuffer" yavas calisan bir class'dir, "StringBuilder" ise hizli
                calisir. "StringBuffer"  "synchronize" islemlerini yapabilir,
                ama "StringBuilder" yapamaz.
                3) Ayni anda bir cok isin yapilmasina "multi threading" denir. "multi" = Cok,
                "thread"= Yapilan islerin herbiri
                multi threading varsa, bu islerin siraya konulmasi lazim.
                Islerin siraya konulmasina "synchronization" denir.
                String'lerde method kullanarak String'i degistirmek atama yapmadan mumkun degildir.
                Bunun iki sebebi vardir:
                1) Java pass-by-value kullanir   2) String Class'i immutable Class'dir.
   */