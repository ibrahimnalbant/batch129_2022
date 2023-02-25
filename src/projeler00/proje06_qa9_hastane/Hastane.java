package projeler00.proje06_qa9_hastane;

public class Hastane extends VeriBankasi {



    private Doktor doktor;
    private Hasta hasta;

    public Doktor getDoktor() {
        return doktor;
    }

    public void setDoktor(Doktor doktor) {
        this.doktor = doktor;
    }

    public Hasta getHasta() {
        return hasta;
    }

    public void setHasta(Hasta hasta) {
        this.hasta = hasta;
    }


    public Hastane() {
    }

    public Hastane(Doktor doktor, Hasta hasta) {
        this.doktor = doktor;
        this.hasta = hasta;
    }
}//class
