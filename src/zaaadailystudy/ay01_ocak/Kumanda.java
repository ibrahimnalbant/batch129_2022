package zaaadailystudy.ay01_ocak;
/*
    1)TV ekraninin genisligini, yuksekligini ve ekran buyuklugunu ayarlayabildiginiz
    2)kanal degistirebildiginiz;kapatip acabildiginiz;
    3)ses azaltip artirabildiginiz ve bu artirmanin bir max. degerinin oldugu bir TV kumandasinin kodunu yaziniz.
 */

public class Kumanda {

    private double genislik;
    private double yukseklik;
    private double ekranBuyuklugu;
    private int maxVolume= 100;
    private int ses = 10;
    private boolean guc;

    public Kumanda(double genislik, double yukseklik, double ekranBuyuklugu) {
        this.genislik = genislik;
        this.yukseklik = yukseklik;
        this.ekranBuyuklugu = ekranBuyuklugu;
    }//const

    // kanalDegistirme()

    public  double kanalDegistirme(int kanal){
        switch(kanal){
            case 1:
            return 30.56;//A kanali
             case 2:
             return 50.70;
             case 3:
             return 88.90;
        }
        return 0;
    }


    public void gucDugmesi(){
       this.guc =!guc;
    }

    public int sesAzaltma(){

        if(ses>0){
            ses--;
        }
        return ses;
    } //sesAzaltma()

    public int sesArtirma(){

        if(ses<maxVolume){
            ses ++;
        }
        return ses;
    }



}//class
