package practice_DTNT.practice09;

import static practice_DTNT.practice09.MyExceptions.str;

public class RunnerExceptions {
    public static void main(String[] args) {

        MyExceptions my = new MyExceptions(str);


        try {
            int x = 100, y=5;
            float ortalama = (float) x/ (float) y;
            if (ortalama < 50) {
                throw new IllegalArgumentException("ortalama cok dusuk");
            }
        } catch (Exception e) {
            System.out.println("sorunun kaynagi ne==> "+e.getMessage());
           // e.printStackTrace();
        } finally {
            System.out.println(str);
        }




    }
}//class
