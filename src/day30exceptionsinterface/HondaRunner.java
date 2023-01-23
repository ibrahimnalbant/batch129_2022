package day30exceptionsinterface;

public class HondaRunner {
    public static void main(String[] args) {

        Civic myCivic = new Civic();
        myCivic.cool();

        System.out.println(Ac.price); // parent'larda ayni isimli variable'lar kullanabiliyorum. cunku static
        System.out.println(Engine.price);
        System.out.println(Security.price);

        // Ac.price = 7000;   // final variable'a deger atayamazsin

        System.out.println(Ac.model); // interface'in adiyla cagirmalisin. method

        Accord myAccord = new Accord();
        myAccord.cool();

    }//main

}//class
