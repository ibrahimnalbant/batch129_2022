package TR_Forwhile;

public class Q06 {
    /*
Konsolda Alfabeyi Yazdıran programi yaziniz.

OUTPUT  : a b c .. .. .. .. y z
     */
    public static void main(String[] args) {

        char ch = 'a';
        for (int i =0; i < 26 ; i++) {

            System.out.print(ch+" ");
            ch ++;
        }
    }
}

