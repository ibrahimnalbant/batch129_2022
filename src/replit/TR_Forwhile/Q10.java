package TR_Forwhile;

public class Q10 {
    /*
1'den 100'e kadar olan doğal sayıların toplamını bulan programı yazınız.
OutPut: Sayilarin Toplami : 5050
     */
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <101 ; i++) {
            sum += i;
        }
        System.out.println("Sayıların Toplamı: "+sum);
    }

}
