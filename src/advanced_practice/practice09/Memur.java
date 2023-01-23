package advanced_practice.practice09;

public class Memur extends Banka {

    @Override
    public double faizHesapla(double alinanakKredi) {
        return alinanakKredi * 0.1;
    }
}
