package test;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test1 {

    public static void main(String[] args) {
        ProcessBuilder p = new ProcessBuilder();
        p.command("cmd.exe", "/c", "ping -n 3 google.com");

        try {
            Process process = p.start();
            BufferedReader cikti = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String satir;

            while ((satir = cikti.readLine()) != null) {
                System.out.println(satir);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
