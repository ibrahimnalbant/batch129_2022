package practice_DTNT.practice10;

public class SE06 {

    public static void main(String[] args) {

        try {
            m(12);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void m(int x) {
        if (x < 0 || x > 9) {
            throw new IllegalArgumentException("Good");
        } else {
            System.out.println(x);
        }
    }
    // Output Good
    //         5
}
