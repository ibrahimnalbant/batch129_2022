package practice_DTNT.practice08;

public class Browser {

    public static void main(String[] args) {
        String adresCubugu="Her Browser'da adresCubugu vardir";

        Edge edge = new Edge();
        edge.search();
        edge.sifreKaydetme();
        edge.get();

        Edge edge2 = new Edge(adresCubugu);
        System.out.println(edge2.adresCubugu);
    }

    public void get(){
        System.out.println("Browser'lar web sayfasina gider");
    }

    public void search(){
        System.out.println("Browser'lar web sayfasinda arastirma yapar");
    }

    public void sifreKaydetme(){
        System.out.println("Browser'lar istenildiginde sifre jaydeder");
    }
}
