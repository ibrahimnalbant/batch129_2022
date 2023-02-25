package sorubankasi;

import java.util.Arrays;

public class Arrays01 {

    public static void main(String[] args) {

        int arr[] = {11,12,13,14};

        System.out.println("\n****Soru1");
        System.out.println(Arrays.toString(arr));

        System.out.println(arr[arr.length-2]);

        System.out.println(arr[1]);

        for (int i = 0; i < 4; i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println("\n****Soru2");
        int arr2[]={2,11,0,23,7};

        Arrays.sort(arr2);
        System.out.println(arr2[arr2.length-1]);

        System.out.println("\n****Soru3");

        char arrCh[]={'a','C','c','A','b'};
        Arrays.sort(arrCh);
        System.out.println(Arrays.toString(arrCh));

        System.out.println("\n****Soru4");
        int arr3[]={2,11,0,23,7};
        Arrays.sort(arr3);
        for (int i = 4; i >=0 ; i--) {
            System.out.print(arr3[i]+" ");
        }
        System.out.println("\n****Soru5");

        int arr4[] = {1, 2, 3};
        int arr5[] = {1, 2, 3};
        System.out.println(arr4==arr5);
        System.out.println(arr4==arr4);
        System.out.println(Arrays.equals(arr4,arr5));
        System.out.println(arr4.equals(arr5));

        System.out.println("\n****Soru6");
        int arr6[] = {1, 23, 12, 2, 3};

        System.out.println(Arrays.binarySearch(arr6,12));

        Arrays.sort(arr6); // [1, 2, 3, 12, 23]
        System.out.println(Arrays.binarySearch(arr6,12));

        System.out.println("\n****Soru7");
        int arr7[] = {12, 23, 12, 2, 3};
        Arrays.sort(arr7);
        System.out.println(Arrays.toString(arr7));
        System.out.println(Arrays.binarySearch(arr7, 12));

        System.out.println("\n****Soru8");
        int arr8[] = {12, 23, 12, 2, 3};
        Arrays.sort(arr8);
        System.out.println(Arrays.binarySearch(arr8, 5));

        System.out.println("\n****Soru9");
        int arr9[] = {3, 2, 3, 4, 4, 5};
        int count = 0;
        for(int i=0; i<arr9.length; i++) {
            if(arr9[i]==3) {
                count++;
            }
        }
        System.out.println(count);

        System.out.println("\n****Soru10");
        char arr10[]=new char[4];
        arr10[0]='A';
        arr10[2]='E';
        arr10[3]='M';
        System.out.println(Arrays.toString(arr10));

        System.out.println("\n****Soru11");

            String str = "Cok calis, mutevazi ol";
            String strArray[] = str.split(",");
            System.out.println(Arrays.toString(strArray)); //[Cok calis,  mutevazi ol]

        String str1 = "Cok calis, mutevazi ol";
        String strArray1[] = str1.split(" "); // cift tirnak içinde space var
        System.out.println(Arrays.toString(strArray1)); //[Cok, calis,, mutevazi, ol]

        String str2 = "Cok calis, mutevazi ol";
        String strArray2[] = str2.split("X");
        System.out.println(Arrays.toString(strArray2)); //[Cok calis, mutevazi ol]









    }//main

}//class
