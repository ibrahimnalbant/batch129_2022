package advanced_practice.practice09;

public class Isci extends Banka {

    @Override
    public double faizHesapla(double alinanakKredi) {
        return alinanakKredi * 15 / 100;
    }
}
