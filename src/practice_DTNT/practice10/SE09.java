package practice_DTNT.practice10;

public class SE09 {

    public static void main(String[] args) {
        int num1 = 0;         //   int num1 = 22;        // int num1 = 22;
        int num2 = 22;        //  int num2 = 0;          // int num2 = 2;
        try {
            System.out.println(num1/num2);
        }catch(ArithmeticException e) {
            System.out.println("Do not divide by 0");
        }finally {
            System.out.println("Done");
        }
    }
}
