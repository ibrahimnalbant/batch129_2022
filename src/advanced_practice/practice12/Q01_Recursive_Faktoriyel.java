package advanced_practice.practice12;

public class Q01_Recursive_Faktoriyel {
    //Faktoriyel hesaplayan bir method yazınız.(Loop kullanmayınız.)

    public static void main(String[] args) {


        System.out.println(factorial(4));//24

    }//main

    public static int factorial(int n) {
        if(n>=0) {
            if (n == 0) {
                return 1;
            } else {
                return n * factorial(n - 1);
            }
        }else{
            throw new ArithmeticException("Sayi sifirdan kucuk olamaz");
        }
    }
    /*
    Bu metod rekürsif olarak faktöriyel hesaplamaktadır.
    Eğer girdi değeri 0 ise 1 döndürür.
    Aksi halde, girdi değeri 1 azaltılarak tekrar faktöriyel fonksiyonuna gönderilir ve sonucu geri döndürür.
    Bu metod, girdi değeri 1 den küçük olamaz.
     */

}//class
