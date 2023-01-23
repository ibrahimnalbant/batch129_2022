package practice_DTNT.practice09;

public class MyExceptions extends Exceptions {

    static final String str="Sen Degerlisin";

    public MyExceptions(String str){
        super(str);
        System.out.println("oyun oynadi ");
    }

    public MyExceptions() {
        super(str);
    }
}//class
