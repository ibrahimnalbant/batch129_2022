package zaaadailystudy.ay01_ocak;

public class KumandaRunner {
    public static void main(String[] args) {
        Kumanda tv = new Kumanda(11.5,7,9.8);
        tv.gucDugmesi();
        System.out.println(tv.kanalDegistirme(3));//
        System.out.println(tv.sesAzaltma());//9
        System.out.println(tv.sesArtirma());//10


    }//main
}
