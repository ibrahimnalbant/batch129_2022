package sorubankasi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ForEachLoop {
    public static void main(String[] args) {

        System.out.println("\n****Soru1");
        int arr1[]={1,3,5};
        int x=0;
        for (int w:
             arr1) {
            x=x+w*w;
        }
        System.out.println(x); //35

        System.out.println("\n****Soru2");
        int arr2[]={1,3,5,7,9};
        for(int w : arr2){
            if(w<4){
                continue;
            }
            System.out.print(w+" "); //5 7 9
        }
        System.out.println("\n****Soru3");
        int arr3[]={1,3,5,7,9,};
        for(int w : arr3){
            System.out.print(w+" ");//1 3 5
            if(w>4){
              break;
            }
        }
        System.out.println("\n****Soru4");
        int arr4[][] = { { 1, 2 }, { 3 }, { 4, 5, 6 } };
        for (int[] w : arr4) {
            for (int z : w) {
                System.out.print(z + " "); //1 2 3 4 5 6
            }
        }
        System.out.println("\n****Soru5");
        int arr5[][]={{1,2},{3},{4,5,6}};
        int k=0;
        for (int[] w:arr5) {
            for(int z:w){
                k=k+z;
            }
        }
        System.out.println(k);//21

        System.out.println("\n****Soru6");

        List<Integer> list6=new ArrayList<>();
        list6.add(21);
        list6.add(22);
        list6.add(23);
        list6.add(24);

        for(int w: list6){
            if(w%2==0){
                continue;
            }
            System.out.print(w+" ");//21 23
        }

        System.out.println("\n****Soru7");
        int arr7[]={3,4,5,6};
        List<Integer> list7 = new ArrayList<>();

        for (int w: arr7) {
            list7.add(w);
        }
        System.out.println(arr7);//[I@4e04a765
        System.out.println(list7);//[3, 4, 5, 6]
        System.out.println(list7.get(2));//5

        System.out.println("\n****Soru8");
        int arr8[]={3,4,5,6};
        List<Integer> list8 = new ArrayList<>();
        for(int w : arr8){
            list8.add(w);
        }
        System.out.println(list8); // [3, 4, 5, 6]

        int arr82[]={3,4,5,6};
        List<int[]> list82= Arrays.asList(arr82);
        System.out.println(list82);                //[[I@783e6358]

        Integer arr83[]={3,4,5,6};
        List<Integer> list83 = Arrays.asList(arr83);
        System.out.println(list83);                 //[3, 4, 5, 6]


        System.out.println("\n****Soru9");
        List<Integer> list9 = new ArrayList<>();
        list9.add(21);
        list9.add(22);
        list9.add(23);

        int count1 = 0;
        for(int w : list9) {
            System.out.print(w + " ");  //21 22
            count1++;
            if(count1==2) {
                break;
            }

        }

        System.out.println();
        int count2 = 0;
        for(int w : list9) {
            count2++;
            if(count2==2) {
                continue;
            }
            System.out.print(w + " ");  //21 23
        }

        System.out.println();
        int count3=0;
        for(int w : list9) {
            count3++;
            if(count3<3) {
                System.out.print(w + " ");  //21 22
            }
        }

        System.out.println("\n****Soru10");
        int p=1000;

        Scanner scan=new Scanner(System.in);
        List<String> products = new ArrayList<>();
        int i=0;
        do{
            System.out.println("Enter"+(i+1)+".product name");
            products.add(scan.nextLine());
            i++;
        }while (i<3);
        System.out.println(products);   //[Toy, Lego, Shoes]

        List<String> productId = new ArrayList<>();
        for (String w: products) {
            productId.add(""+w.charAt(0)+w.charAt(1)+p);
            p++;
        }
        System.out.println(productId);  //[To1000, Le1001, Sh1002]
        scan.close();


    }//main
}//class
