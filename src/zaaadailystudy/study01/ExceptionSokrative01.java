package zaaadailystudy.study01;

public class ExceptionSokrative01 {
    public static void main(String[] args) {

        try {

            run();

        } catch (Exception e) {

            System.out.println(e.getMessage());
            System.out.println(e);
            System.out.println(e.fillInStackTrace());
             e.printStackTrace();

        }

    }

    private static void run() {

        throw new RuntimeException("Run more");

    }
}
