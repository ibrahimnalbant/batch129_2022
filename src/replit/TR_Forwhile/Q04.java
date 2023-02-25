package TR_Forwhile;

import java.util.Scanner;

public class Q04 {
    /*
Girdi olarak bir tamsayı kabul eden ve faktöriyel hesaplayan programi yazıniz.
Input : 6
Output: 6!=6*5*4*3*2*1=720
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
        int n = input.nextInt();
        int faktoriyel = 1;

        for (int i = 1; i <n+1 ; i++) {
            faktoriyel *=i;
        }
        System.out.println("faktoriyel = " + faktoriyel);


    }

}
