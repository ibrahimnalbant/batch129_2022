package sorubankasi;

public class InstanceLocalVariablesMethodCall {
    //Not: Eğer aynı isimli farklı parametreli method'lar oluşturursanız buna method overloading denir.

    // method overloading yapmak için
        // Parametrelerin sayısını değiştirmek,
        // Parametrelerin data type'ini değiştirmek,
        // Parametrelerin data type'lari farklı ise yerlerini değiştirmek.

        /*
    public static void multiply(int num1, int num2) {
        System.out.println(num1* num2);
    }
    public static void multiply(int num1) {
        System.out.println(num1*num1);
    }
    public static void multiply(double num1, double num2) {
        System.out.println(num1* num2);
    }

         */
    /*
        public static void add(int num1, int num2) {
            System.out.println(2 + num1 + num2);
        }
        public static void add(double num1, double num2) {
            System.out.println(3 + num1 + num2);
        }
     */
        /*
        public static void updateWord(String s, String t) {
            s = s.substring(0,1).toUpperCase() + t.substring(2);
            System.out.println(s);
        }
        */
    /*
        private static void getData() {
            System.out.println("Method 1");
        }
        private static void getData() {     //  CTE verir.
            System.out.println("Method 2");
        } */
    /*
        public static void add(double n1, double n2) {
            System.out.println(n1 + n2);
        }
        public static void add(int n1, double n2) {
            System.out.println(n1 + n2);
        }
        public static void add(int n1, int n2) {
            System.out.println(n1 + n2);
        }*/
        /*
        public static void function(float i, int j){
            System.out.println("Good");
        }
        public static void function(double i, double j){
            System.out.println("Bad");
        }*/



        public static void main(String[] args) {


//        function(1.2F, 3); // Good
//            function(1.2, 3);   // Bad
//            function(2, 3); // Good
//            function(2.1F, 3.2); // Bad

//        add(3.2, 4.8); //Output 8.0
//        add(5, 7.3); //Output B 12.3
//        add(5, 7); //Output C 12
//        add(5.3, 7); //Output D  12.3


       // getData();

      //  updateWord("john", "black");

            /*
       // multiply(3, 5);  // 15

       // multiply(5);  // 25

       // multiply(2.5); // java: incompatible types: possible lossy conversion from double to int (CTE)

        // multiply(2.5, 2.5); // 6.25
            */
            /*
        //add(3, 5);  // 10
        //add(3.1, 5.2); // 11.3
        //add(3.1, 5); // 11.1

             */





    }//main


}//class
