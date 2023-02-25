package zaaadailystudy.ay01_ocak;

import practice_DTNT.practice08.BagetEkmek;
import practice_DTNT.practice08.DiyetEkmek;

public abstract class TSE {


    public static void main(String[] args) {

        zaaadailystudy.ay01_ocak.BagetEkmek baget = new zaaadailystudy.ay01_ocak.BagetEkmek();
        baget.gramaj500();
        baget.hijyenikOlma();
        baget.odunAtesindePiser();
        baget.undanYapilir();

        System.out.println("******************");

        practice_DTNT.practice08.DiyetEkmek diyet = new DiyetEkmek();
        diyet.gramaj500();
        diyet.hijyenikOlma();
        diyet.odunAtesindePiser();
        diyet.undanYapilir();



    }



    abstract void gramaj500(); // abstract method'da body yok, child'lar buna uymak zorunda
    abstract void hijyenikOlma();

    void odunAtesindePiser(){
        System.out.println("TSE odun atesinde piser");
    }
    void undanYapilir(){
        System.out.println("TSE un'dan Yapilir");
    }

}
