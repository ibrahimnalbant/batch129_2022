package advanced_practice.practice12;
/*
public static double calculatePower(double base, int exponent) {
        if (exponent == 0) {
            return 1;
        } else if (exponent > 0) {
            return base * calculatePower(base, exponent - 1);
        } else {
            return 1 / base * calculatePower(base, exponent + 1);
        }
    }
    Bu metod, rekürsif olarak bir sayının istenen kuvvetini hesaplamaktadır.
    Eğer üs (exponent) 0 ise 1 döndürür. Eğer üs pozitif ise, temel (base) sayısı üs azaltılarak
    tekrar fonksiyona gönderilir ve sonuç geri döndürülür.
    Eğer üs negatif ise, 1/base* calculatePower(base, exponent + 1) ile geri döndürülür.
 */

public class Q03_ForLoop_UsAlma {

    //Bir sayının istenen kuvvetini hesaplayan bir method yazınız.
    public static void main(String[] args) {
        System.out.println(kuvvetiniAl(5,2));//25.0
        System.out.println(kuvvetiniAl(5,-2));//0.04
        System.out.println(kuvvetiniAl(-5,3));//-125.0
        System.out.println(kuvvetiniAl(-5,-3));//-0.008
        System.out.println(kuvvetiniAl(0,-5));//Infinity
        System.out.println(Math.pow(0,-5));//Infinity
        System.out.println(Math.pow(5,2));//25.0
        System.out.println(kuvvetiniAl(5,0));//1.0
    }

    public static double kuvvetiniAl(double taban, int us) {
        double sonuc = 1;

        if(taban==0 && us==0){
            throw new ArithmeticException("Taaban ve us ayni anda 0 olamaz");
        }

        if (us >= 0) {

            for (int i = 0; i < us; i++) {
                sonuc *= taban;
            }
            return sonuc;
        }else{
            for (int i = 0; i < Math.abs(us); i++) {
                sonuc *= taban;
            }
            return 1/sonuc;

        }
    }

}//class
