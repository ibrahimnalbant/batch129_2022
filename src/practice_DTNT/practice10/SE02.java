package practice_DTNT.practice10;

public class SE02 {
//2)
        public static void main(String[] args) throws IllegalArgumentException, ArithmeticException{

            try {
                printAge(-8);
            }catch(Exception e){
                System.out.println(e.getMessage());
            }

            System.out.println("Durmak yok yola devam");
    }//main
    public static void printAge(int age){
        if(age<0) {
            throw new IllegalArgumentException("Age cannot be negative");//kural disi Exception
        }else{
            System.out.println(age);
        }
    }
}//class
