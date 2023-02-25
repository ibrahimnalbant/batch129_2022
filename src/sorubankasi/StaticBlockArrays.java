package sorubankasi;

import java.util.Arrays;

public class StaticBlockArrays {
    /*
    Note: Array oluşturmanın 2 yolu vardır;
        1) int arr[] = new int[4];

         arr[0]=11;
         arr[1]=12;
         arr[2]=13;
         arr[3]=14;

         2) int arr[] = {11, 12, 13, 14};

     */

    public static void main(String[] args) {
        /*

        int arr[] = {11, 12, 13, 14};

        System.out.println(Arrays.toString(arr));//[11, 12, 13, 14]

        System.out.println(arr[arr.length-2]);//13

        System.out.println(arr[1]);//12

        for(int i=0; i<4; i++) {
            System.out.print(arr[i] + " ");//11 12 13 14
        }
        int arr[]={2,11,0,23,7};
        Arrays.sort(arr);
        System.out.print(arr[arr.length-1]);//23

        char arrCh[] = {'a', 'C', 'c', 'A', 'b'};
        Arrays.sort(arrCh);
        System.out.println(Arrays.toString(arrCh));//[A, C, a, b, c]

        int arr[] = {2, 11, 0, 23, 7};
        Arrays.sort(arr);
        for(int i=4; i>=0; i--) {
            System.out.print(arr[i] + " ");//23 11 7 2 0
        }

        static int a=11;

    public static void main(String[] args) {
        int b=12;
        System.out.println(b); //12
    }
    static {
        a = 13;
        System.out.println(a); //13
    }
    //static block her zaman main'den once calisir.

        String arr[]={"Ali","Veli","Deli"};
        System.out.println(Arrays.toString(arr));//[Ali, Veli, Deli]

        char arr[] = new char[4];
        arr[0] = 'A';
        arr[2] = 'E';
        arr[3] = 'M';
        System.out.println(Arrays.toString(arr));//[A, NULL , E, M]

        int arr[] = {3, 2, 3, 4, 4, 5};
        int count = 0;
        for(int i=0; i<arr.length; i++) {
            if(arr[i]==3) {
                count++;
            }
        }
        System.out.println(count);//2

         */
        int x[] = { 3, 5, 7 };
        int a = 0;
        int b = 0;
        while (a < x.length) {
            b = b + x[a];
            a++;
        }
        System.out.println(b);//15

    }//main


}//class
