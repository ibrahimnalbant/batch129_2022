package sorubankasi;

public class StringMethodsForLoop {

    public static void main(String[] args) {




        /*
        String str= "Canan Can";

        System.out.println(str.startsWith("c")); // false
        System.out.println(str.endsWith("n"));  // true
        System.out.println(str.startsWith("a",3)); // true
        System.out.println(str.endsWith("Can")); // true


        String str = "Java code yaz";

        System.out.println(str.substring(5)); //code yaz
        System.out.println(str.substring(12)); // z
        System.out.println(str.substring(5, 9)); // code
        System.out.println(str.substring(8, 8)); //

        String text = "Can,Cananlara gitmek icin can atiyor";
        System.out.println(text.replace("Can","Turk"));  //Turk,Turkanlara gitmek icin can atiyor

        String str = "Ayhan BEYHAN";
        str.replace("Ayhan","AYHAN");
        str.replace("BEYHAN", "beyhan");
        System.out.println(str);

        str = "Ayhan BEYHAN";
        str.substring(0,5).toUpperCase();
        str.substring(6).toLowerCase();
        System.out.println(str);

        str = "Ayhan BEYHAN";
        str.replace(str.substring(0),"AYHAN beyhan");
        System.out.println(str);

        for(int i=1; i<6; i++) {
            System.out.print(i + "-");  //1-2-3-4-5-
        }

        for(int i=1; i<10; i+=2){
            System.out.println(i);//13579 ln oldugu icin asagiya dogru
        }
        for(int i=1; i<10; i=i+2){
            System.out.println(i);//13579 ln oldugu icin asagiya dogru
        }
        for(int i=9; i>=1; i-=2){
            System.out.println(i);//97531 ln oldugu icin asagiya dogru
        }
        for(int i=1; i<=9; i++){
            System.out.println(i);//13579 ln oldugu icin asagiya dogru
            i++;
        }

        String str = "Java";
        System.out.println(str.replace("", "/")); //  /J/a/v/a/

        str = "Java";
        System.out.println(str.replace("", "/")); //   /J/a/v/a/

        str = "Java";
        System.out.println(str.replace("", "/"));//    /J/a/v/a/

        str = "Java";
        System.out.println(str.replace("", "/"));//    /J/a/v/a/

        String s = "Java is Java";

        System.out.println(s.indexOf('a'));//1
        System.out.println(s.indexOf("Java"));//0
        System.out.println(s.indexOf('a',4));//9
        System.out.println(s.indexOf("va",2));//2

        String s = "Java is Java"; // index 11, length 12

        System.out.println(s.lastIndexOf('v'));//10
        System.out.println(s.lastIndexOf("va"));//10
        System.out.println(s.toUpperCase().lastIndexOf("V"));//10
        System.out.println(s.toLowerCase().lastIndexOf("j"));//8

         */
        String s = "Learn";
        String t = "Java";

        System.out.println((s.concat(t)).length()); //9
        System.out.println(""+s.length()+t.length()); //54
        System.out.println(s.concat("")+t.length()); // Learn4
        System.out.println(s.length()>s.charAt(2)); // false
        System.out.println(s.length()<s.charAt(2)); // true
        System.out.println(s.charAt(2)); // a



    }//main
}// class
