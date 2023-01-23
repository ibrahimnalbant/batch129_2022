package practice_DTNT.practice09;

public class Test2 {
    String str = "a";
    void a () {
        try {
            str = str + "b";
            b ();
        } catch (Exception e) {
            str = str + "c";
        }
    }
    void b () throws Exception {
        try {
            str = str + "d";
            c ();
        } catch (Exception e) {
            str = str + "e";
        } finally {
            str = str + "f";
        }
        str = str + "g";
    }
    void c () throws Exception {
        System.out.println(12/0);
    }
    void display() {
        System.out.println(str);
    }
    public static void main(String[] args) {
        Test2 object = new Test2();
        object.a ();
        object.display();//abdefg
    }
}
/*
11) Final kelimesini "Variable"larda kullanabilirsiniz.
            ->final variable ise
            i) mutlaka değer atanmalıdır

12)Final kelimesini "Method" larda kullanabilirsiniz.
             ->method final ise;
              i)methodun body'si değiştirilemez
              ii)method body'si değiştirilemeyince override yapmak mümkün olmaz

13)Final kelimesini "Class"larda kullanabilirsiniz.
               ->class final ise;
               i)o class'ın child'ı olamaz
14) "final" method'lar ve "static" method'lar "override"  edilemezler.
 */
