package aaadailystudy;

public class Sokrative0122_01 {
    public static void main(String[] args) {

        try {

            run();

        } catch (Exception e) {

            System.out.println(e.getMessage());

        }

    }

    private static void run() {

        throw new RuntimeException("Run more");

    }
}
