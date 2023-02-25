package sorubankasi.Inheritance;

public class Dog extends Mammal{

    private boolean bark=true;

    public static void main(String[] args) {

        Dog dog=new Dog();

        System.out.println(dog.bark);
        System.out.println(dog.feed);
        System.out.println(dog.weigth);

        Dog obj1=new Dog();
        obj1.m1();
        obj1.m2();
        obj1.m3();
        obj1.m4();
        obj1.m5();
    }

    public void m4(){}
    public void m5(){}
}
