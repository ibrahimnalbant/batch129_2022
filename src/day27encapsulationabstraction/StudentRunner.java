package day27encapsulationabstraction;

public class StudentRunner {

    public static void main(String[] args) {


        Student myStd = new Student();

        //Student 1
        String stdId = myStd.getStdId();
        System.out.println(stdId); //AC123
        System.out.println(myStd.isPoor()); //true

        //Student 2
        myStd.setStdId("TH123");
        myStd.setGpa(4.0);
        myStd.setPoor(false);

        System.out.println(myStd.getStdId()); //TH123
        System.out.println(myStd.getGpa()); //4.0
        System.out.println(myStd.isPoor()); //false

        /*
        System.out.println(myStd.getGpa());//4.0

        Student yourStd = new Student();
        System.out.println(yourStd.getGpa());//3.99

         */



    }//main
}//class

