package practice_DTNT.practice10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;

public class SE01 {

    public static void main(String[] args) throws FileNotFoundException, InputMismatchException {

        FileInputStream fis = new FileInputStream("C:\\Users\\lenovo\\IdeaProjects\\batch129\\src\\sulelessons\\main\\java\\day29exceptions\\FileInputStream");

        int i;
        try {
            while ((i = fis.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        System.out.println("Durmak Yok Yola devam");
    }//main

   //Ogrenci notlari girisi yapan ve notu console'a yazdiran bir method olusturunuz
    public static void getMark(double d) {
        if (d < 0) {
            throw new IllegalArgumentException("Marks cannot be less than zero");
        } else if (d > 100) {
            throw new IllegalArgumentException("Marks cannot be greater than hundred");
        } else {
            System.out.println(d);
        }
    }
}//class
