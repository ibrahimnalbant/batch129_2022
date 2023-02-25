package replit.TR_Forwhile;

import java.util.Scanner;

public class Q01 {
    /*
      Kullanıcıdan bir isim ve bir karakter girmesini isteyin, ardından döngüleri kullanarak karakterin isimde kaç kez tekrarlandığını kontrol edin.
        char ch1= 'a' ;
		String name =“John came late"
		Expected Output: Number of a = 2
     */
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Bİr cümle giriniz.");
        String state = input.nextLine();
        System.out.println("Bir harf giriniz.");
        char ch = input.next().charAt(0);

        int counter = 0;
        for (int i = 0; i < state.length(); i++) {
            if (state.charAt(i)==ch){
                counter++;
            }
        }
        System.out.println(ch+" harfi "+counter+" defa geçer.");
    }//main
}
