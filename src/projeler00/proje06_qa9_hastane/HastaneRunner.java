package projeler00.proje06_qa9_hastane;

import static projeler00.proje06_qa9_hastane.QA9_Hastanesiislemler.hastaneMenusu;

public class HastaneRunner {


    public static void main(String[] args) throws InterruptedException  {

        DoktorIslemleri.doktorListesi();
        HastaIslemleri.hastaListesi();
        hastaneMenusu();

    }//main
}//class

