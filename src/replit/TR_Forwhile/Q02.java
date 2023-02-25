package replit.TR_Forwhile;

import java.util.Scanner;

public class Q02 {
    /*
    Kullanıcıdan 2 tamsayı girmesini ve ardından GCD (En Büyük Ortak Bölen) ve LCM'yi (En Küçük Ortak Kat) bulmasını isteyin.
Input :
30
40
	Beklenen Cikti:
30 ve 40 icin GCD = 10
30 ve 40 icin LCM = 120
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Sırasıyla iki sayı giriniz");
        int a = input.nextInt();
        int b = input.nextInt();

        int min = Math.min(a,b);
        int ebob = 1;

        for (int i=1;i<=min;i++){
            if(a%i == 0 && b%i==0){
                ebob = i;
            }
        }
        System.out.println(a+" ve "+b+" icin GCD = "+ebob);

        int ekok = a>b ? a : b;
        do{
            if(ekok % a == 0 && ekok % b ==0){
                break;
            }else{
                ekok++;
            }
        }while(true);

        System.out.println(a+" ve "+b+" icin LCM = "+ekok);

    }
}
