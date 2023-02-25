package sorubankasi;

import java.util.Arrays;

public class MultiDimensionalArrays {
    public static void main(String[] args) {
        System.out.println("\n****Soru1");
        int[][]x = {{2,1},{1,7,1}};
        System.out.println(m(x[1]));

        System.out.println("\n****Soru2");
        int[][] y={{1,2},{3,4,5}};
        System.out.println(m2(y));

        System.out.println("\n****Soru3");
        System.out.println(mul(mulArr));

        System.out.println("\n****Soru4");
        int arr4[][] = { {3,2,1},{1,2,3} };
        for(int i = 1; i < arr4.length; i++){
            for (int k = 1; k < arr4[0].length; k++) {
                if (arr4[i][k] % 2 == 1) {
                    arr4[i][k] = arr4[i][k] + 1;
                }
                if (arr4[i][k] % 2 == 0) {
                    arr4[i][k] = arr4[i][k] * 2;
                }
            }
        }
        System.out.println(Arrays.deepToString(arr4));

        System.out.println("\n****Soru5");
        int arr[][] ={{5,12},{3,8,4},{6,3}};
        System.out.println(m(arr));




    }//main

    //soru1
    public static int m(int[] a) {
        int result=0;
        for (int i = 0; i < a.length; i++) {
            result+=a[i];

        }
        return result;
    }

    //soru2
    public static int m2(int[][] b){
        int result2=3;
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                result2 +=b[i][j];
            }
        }
        return result2;
    }

    //soru3
    static int[][] mulArr={{2,1},{5,7,6}};
    public static int mul(int[][] mulArr) {
        int resultMa = mulArr[0][1];
        for (int i = 0; i < mulArr.length; i++) {
            for (int j = 0; j < mulArr[i].length; j++) {
                if (resultMa < mulArr[i][j]) {
                    resultMa = mulArr[i][j];
                }

            }
        }
        return resultMa;
    }

    //Soru5
    public static int m(int[][] arr){
        int r,c;
        int i,k=0;

        for ( r = 0; r < arr.length; r++) {
            for ( c = 0; c < arr[0].length; c++) {
                i=arr[r][c];
                if(i>k){
                    k=i;
                }
            }
        }
        return k;
    }





}//class
