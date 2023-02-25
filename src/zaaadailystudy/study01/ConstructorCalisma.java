package zaaadailystudy.study01;

public class ConstructorCalisma {

     /*
        String name="Emily";
        int age = 20;

        ConstructorCalisma(String name, int age){
                this.name=name;
                this.age=22;
        }

        public static void main(String[] args) {

                ConstructorCalisma st = new ConstructorCalisma("Oliver", 21);
                System.out.print(st.name);
                System.out.print(", " + st.age);

        }
       */
       String name;
       int age;
       String phone;

        ConstructorCalisma (){
        }//constructor parametresiz

//        ConstructorCalisma (String name, int age, String phone){
//                this.phone = phone;
//                this.name = name;
//        }//constructor parametreli


        public ConstructorCalisma(String name, int age, String phone) {
                this.name = name;
                this.age = age;
        }

        public static void main(String[] args) {

            ConstructorCalisma s1 = new ConstructorCalisma();

            ConstructorCalisma s2 = new ConstructorCalisma("John",25,"029-998877");

                System.out.println(s2.name +", "+ s2.age+", "+s2.phone);
        }//main





}//class
