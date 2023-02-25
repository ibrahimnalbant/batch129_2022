package zaaadailystudy.ay02_subat;


public class SchoolRunner {

    public static void main(String[] args) {

        School obj=new School();
        System.out.println(obj.isActive);
        System.out.println(obj.yil);
        System.out.println(obj.okulIsmi);

        School.okulIsmiYazdir("Start okulu");
        School.YilYazdir(2023);

        System.out.println(obj.isActive(false));;

        Calculator.cikarma(12,6);
        Calculator.cikarma(19,6);
        Calculator.bolme(20,4);


    }
}
