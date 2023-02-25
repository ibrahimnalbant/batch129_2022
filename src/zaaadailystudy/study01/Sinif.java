package zaaadailystudy.study01;

public class Sinif extends Okul{

    public Sinif(int age){
        super();
        System.out.println("child class parametreli cons.");
    }
    public Sinif(){
        this(11);
        System.out.println("child class parametresiz cons.");
    }

    public static void main(String[] args) {
        Sinif sinif1 = new Sinif();
    }
}
