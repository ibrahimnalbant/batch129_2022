package zaaadailystudy.study01;

public class Sokrative0122_04 {
    public static void main(String[] args) {

        try {

           // m(12);
           // m(9);
           //  m(-12);
            m(5);


        }catch(IllegalArgumentException e) {

            System.out.println(e.getMessage());

        }

    }

    public static void m(int x) {

        if(x<0 || x>9) {

            throw new IllegalArgumentException("Good");

        }else {

            System.out.println(x);

        }

    }
}//class
