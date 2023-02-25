package sorubankasi;

public class Exceptions1 {


    public static void main(String[] args) {

        System.out.println("\n ****Soru5");
        int x = 5;
        int y = 1;
        System.out.println("Good");
        System.out.println(x / y);

        System.out.println("\n ****Soru6a");

        int arr[] = {9, 8, 7, 6};
            try{
                System.out.print("Good");
                System.out.print(arr[4]);
            }catch (IndexOutOfBoundsException e){

                System.out.print("Better");
            }
        System.out.println("\n ****Soru6b");
        String s2 = null;

        try{
            System.out.println(s2.length());
            System.out.print("Good");
        }catch(NullPointerException e) {
            System.out.print("Better");
        }

        System.out.println("\n ****Soru6c");
        String s = "123";
        System.out.println(s + 1); // A
        int num = Integer.parseInt(s);
        System.out.println(num + 1); // B

        System.out.println("\n ****Soru6d");
        String s3 = "abc";
        try{
            System.out.println(Integer.parseInt(s3));
        }catch(NullPointerException e) {
            System.out.print("Better");
        }catch(NumberFormatException e) {
            System.out.print("The Best");
        }

        System.out.println("\n ****Soru9a");
        try {
            int a[]= {7, 8, 9};
            for (int i = 1; i <= 3; i++){
                System.out.println(a[i]);
            }
        }catch(Exception e) {
            System.out.println ("Exception");
        //}catch(ArrayIndexOutOfBoundsException e) {
        //    System.out.println ("Out of index");
        }finally {
            System.out.println("Done!");
        }

        System.out.println("\n ****Soru9b");
        try {
            int b[]= {7, 8, 9};
            for (int i = 1; i <= 2; i++){
                System.out.println(b[i]);
            }
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println ("Out of index");
        }finally {
            System.out.println("Done!");
        }

        System.out.println("\n ****Soru9c");
        try {
            int c[]= {7, 8, 9};
            for (int i = 1; i <= 7; i++){
                System.out.println(c[i]);
            }
        } catch(Exception e) {
            System.out.println ("Exception");
        }finally {
            System.out.println("Done!");
        }

        System.out.println("\n ****Soru10");



            Exceptions1 object = new Exceptions1();
            object.aMethod();
            object.display();


    }//main

    //Soru10
    String str = "a";
    void aMethod() {
        try {
            str = str + "b";
            bMethod();
        } catch (Exception e) {
            str = str + "c";
        }
    }
    void bMethod() throws Exception {
        try {
            str = str + "d";
            cMethod();
        } catch (Exception e) {
            str = str + "e";
        } finally {
            str = str + "f";
        }
        str = str + "g";
    }
    void cMethod() throws Exception {
        System.out.println(12/0);
    }
    void display() {
        System.out.println(str);
    }



}//class
