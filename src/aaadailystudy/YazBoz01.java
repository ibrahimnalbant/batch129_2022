package aaadailystudy;

public class YazBoz01 {

    public static void main(String args[]) {

        m1(10);

        m1(11, 12, 13, 14);
        //Example 5: Bir String'in space haric hicbir character icermedigini kontrol eden kodu yaziniz

        String t = "        ";

        //1.Yol:
        boolean result3 = t.replace(" ", "").length()==0;
        System.out.println("Sadece space mi var? " + result3);

        //Example 6: Bir String'de a, i, e character'lerinin ilk gorunumlerinin indexleri toplamini ekrana yazdiriniz
        //           "Java is easy to learn" ==> 1 + 5 + 8 = 14
        String r = "Java is easy to learn";

        int idxA = r.indexOf('a');
        System.out.println(idxA);// 1

        int idxI = r.indexOf('i');
        System.out.println(idxI);// 5

        int idxE = r.indexOf('e');
        System.out.println(idxE);//8

        System.out.println (idxA+idxI+idxE);// Index'ler toplami: 14

        //Example 8: Bir String'de a, i, e character'lerinin "son" gorunumlerinin indexleri toplamini ekrana yazdiriniz
        //           "Java is easy to learn" ==> 18 + 5 + 17 = 40

        String v = "Java is easy to learn";
        int idxLastA = v.lastIndexOf('a');
        System.out.println(idxLastA);  // 18

        int idxLastI = v.lastIndexOf('i');
        System.out.println(idxLastI);  // 5

        int idxLastE = v.lastIndexOf('e');
        System.out.println(idxLastE);  // 17

        System.out.println("a, e, i son index toplami = " + (idxLastA+idxLastI+idxLastE));


    }

    static void m1(int... a) {

        System.out.println("==> " + a.length);

        for (int i : a) {

            System.out.print(i + " ");

        }




    }
}

