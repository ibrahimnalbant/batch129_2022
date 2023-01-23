package practice_DTNT.practice09;


    public class C01_Exceptions {
        //verilen 2 String'in uzunluk açısından  birbirinin kaç katı olduğunu veren kodu yazınız.
        public static void main(String[] args) {


           double r1= karakterSayisiniKarsilastir("Java","xy");
            System.out.println(r1);
            double r2= karakterSayisiniKarsilastir("tester","");
            System.out.println(r2);
            double r3= karakterSayisiniKarsilastir(null,"MehmetG");
            System.out.println(r3);

        }//Main

        private static double karakterSayisiniKarsilastir(String str1, String str2) {
            double  result=0;

            try {
                result=str1.length()/str2.length(); // length method'u int dondurur.
               // System.out.println("sonuc: "+result);
            } catch (ArithmeticException e) {
                System.err.println("PAYDA SIFIR OLAMAZ ==>" + e.getMessage());
                // e.printStackTrace();
            } catch (NullPointerException e) {
                System.err.println("length methodu null ile hata verir ==>"+e.getMessage());
            } finally {
                System.out.println("Database ile bağlantı kesilsin");
            }

            return result;
        }//Method
    }//Class