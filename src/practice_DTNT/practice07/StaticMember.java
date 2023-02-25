package practice_DTNT.practice07;

public class StaticMember { //StaticUyeler

        //Ekran Ciktisi Nedir?
        static int x;
        int y;
        StaticMember(){//constructor
            x+=10;
            y++;
        }//const
        public static int karesiniAl(){
            return x*x;
        }

        public static void main(String[] args) {

            StaticMember sm1 = new StaticMember();
            StaticMember sm2 = new StaticMember();
            int z=sm1.karesiniAl();
            System.out.println("-x "+z+" -y"+sm2.y);  // -x 400 -y1
            System.out.println("-x "+x+" -y"+sm2.y); // -x 20 -y1
            System.out.println("-x "+sm1.x+" , "+sm2.x+" -y"+sm2.y);  // -x 20 , 20 -y1

        }//main


    }//class



