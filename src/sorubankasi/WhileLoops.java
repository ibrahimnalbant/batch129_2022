package sorubankasi;

public class WhileLoops {
    public static void main(String[] args) {
        /*
        int num = 1;
        while(num<3){
            System.out.print(num +" "); // 1 2
            num++;
        }

        int num = 1;
        while(num<1){
            System.out.print(num + " ");
            num++;
        }               // program calisir ama console'a bisey yazmaz

        int num = 1;
        while(num<=1){
            System.out.print(num + " ");
            num--;          //1 0 -1 -2...seklinde negative sonsuza kadar yazar

            int num = 1;
            while(num=1){   // program calismaz Required type: boolean Provided: int Replace "=" with "=="
                System.out.print(num + " ");
                num++;
            }

            char ch = 'a';
            while(ch<'d'){
                System.out.print(ch+" ");  // a b c
                ch++;
            }
                System.out.print('a'+'b'+'c'); // 294 ASCII degerlerinin toplamini veriyor

        for (int i = 1; i < 10 ; i=i+1) {
            if(i%3==0){
                System.out.print(i+" ");// 3 6 9
            }
        }

            int sum = 0;
            int num = 1;
            while (num<5){
                sum=sum+num;
                num++;
            }
        System.out.println(sum); // 10  //int sum = 5;  olursa cevap // 15

         */
            int product=1;
            int num=1;
            while(num<5){
                product=product*num;
                num++;
            }
        System.out.println(product);
    }//main
}//class
