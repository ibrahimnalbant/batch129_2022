package sorubankasi;

import java.util.Scanner;

public class StaticKeyword {
        /*
    static int a = 10;

    public static void main(String[] args) {

        StaticKeyword t1 = new StaticKeyword();
        StaticKeyword t2 = new StaticKeyword();

        t1.a = a+2;
        t2.a = a+3;

        System.out.println(t1.a);//15
        System.out.println(t2.a);//15
    }
    A) Static variable'lara sadece classin ismi kullanılarak da ulaşılabilir.
    B) Static olmayan variable'lara ulaşabilmek için object oluşturmak zorundayız.
    C) Static variable'larin diğer adi class variable'dir. Instance variable'larin diğer adi object
    variable'dir.
    D) Static variable'lar object'lerin ortak kullanımına açıktır fakat instance variable'lar değildir.

        int a = 10;

        public static void main(String[] args) {

            StaticKeyword t1 = new StaticKeyword();
            StaticKeyword t2 = new StaticKeyword();

            t1.a = 12;
            t2.a = 13;

            System.out.println(t1.a);//12
            System.out.println(t2.a);//13
        }

    public static void main(String[] args) {
       m1(33);
    }
    public static void m1(float x){
        System.out.println("Method 1");
    }
    public static void m1(int x, double y){
        System.out.println("Method 2");
    }

    String name;
    static String college="UNF";

    StaticKeyword(String n,String college){
        this.name=n;
        this.college=college;
    }

    public static void main(String[] args) {
        StaticKeyword s1= new StaticKeyword("Mark", "UCF");
        StaticKeyword s2 = new StaticKeyword("Kevin", "FIU");

        System.out.println(s1.name);//Mark
        System.out.println(s2.name);//Kevin

        System.out.println(s1.college);//FIU
        System.out.println(s2.college);//FIU
    }


    int count=0;
    StaticKeyword(){
        count+=2;
        System.out.println(count);  //2
                                    //2
                                    //2
    }
    public static void main(String[] args) {
        StaticKeyword c1= new StaticKeyword();
        StaticKeyword c2= new StaticKeyword();
        StaticKeyword c3= new StaticKeyword();

    }

    int y = 5;
    static int x = 7;

    public static void main(String[] args) {
        StaticKeyword t1=new StaticKeyword();
        StaticKeyword t2=new StaticKeyword();
        t1.x=17;
        t1.y=15;
        System.out.print(t1.x+" "); // 17 17
        System.out.println(t2.x);

        System.out.print(t1.y+" "); // 15 5
        System.out.println(t2.y);
    }

    int num1=5;
    static int num2=7;

    public static void main(String[] args) {
        StaticKeyword s1=new StaticKeyword();
        StaticKeyword s2=new StaticKeyword();

        s1.num1=13;
        s1.num2=23;
        s2.num1=33;
        s2.num2=43;
        System.out.println(s1.num1+" "+s1.num2+" "+s2.num1+" "+s2.num2 );//13 43 33 43
        System.out.println(s1.num1+" "+num2+" "+s2.num1+" "+num2 );      //13 43 33 43
    }
    static int counter=0;
    int age=0;

    public StaticKeyword(){
        counter++;
        age++;
    }

    public static void main(String[] args) {
        StaticKeyword obj1=new StaticKeyword();
        StaticKeyword obj2=new StaticKeyword();
        StaticKeyword obj3=new StaticKeyword();

        System.out.println(obj1.counter);//3
        System.out.println(obj2.counter);//3
        System.out.println(obj3.counter);//3
        System.out.print("-");         //-
        System.out.println(obj1.age);    //1
        System.out.println(obj2.age);    //1
        System.out.println(obj3.age);    //1
    }


         */
         String studentName;
         String year="2020";
         static int counter=1000;
         String studentId;
         public StaticKeyword(){
             Scanner scan=new Scanner(System.in);
             System.out.println("Enter your name");
             studentName=scan.next();
             setStudentId();
         }

    public static void main(String[] args) {
        StaticKeyword student1=new StaticKeyword();
        System.out.println(student1.studentName+student1.studentId);//Ali20201001

        StaticKeyword student2=new StaticKeyword();
        System.out.println(student2.studentName+student2.studentId);//Veli20201002
    }
    public void setStudentId(){
             counter++;
             this.studentId=year+""+counter;
    }


}//class

