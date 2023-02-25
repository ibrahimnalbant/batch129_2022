package calisma00;

public class KalpSekli {
    public static void main(String[] args) {
        /*
         ***    ***                3.4.5 || 10.11.12
         *    * *    *                2.7 || 9.14
         *      *      *               1 || 8 ||15
         *           *                 2 ||14
         *       *                    4||12
         *   *                       6 ||10
         *                           8
         */


        for (int satir = 1; satir <=7 ; satir++) {
            for (int s = 1; s <=15 ; s++) {
                if (satir == 1 && (s == 3 || s == 4 || s == 5 || s == 10 || s == 11 || s == 12) ||
                        satir == 2 && (s == 2 || s == 7 || s == 9 || s == 14) ||
                        satir == 3 && (s == 1 || s == 8 || s == 15) ||
                        satir == 4 && (s == 2 || s == 14) ||
                        satir == 5 && (s == 4 || s == 12) ||
                        satir == 6 && (s == 6 || s == 10) ||
                        satir == 7 && (s == 8)
                ) {
                    System.out.print("*");

                } else System.out.print(" ");
            } System.out.println();


        }

    }


}
