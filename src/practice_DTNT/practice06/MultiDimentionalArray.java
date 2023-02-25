package practice_DTNT.practice06;

public class MultiDimentionalArray {
    //INTERWIEW SORUSU
    //Aşağıdaki multidimensional array'lerin iç array'lerinde
    // aynı indexe sahip elamanların toplamını yazdıran bir program yazın.
    // int arr1[][] = {{1, 2}, { 3, 4, 5},{6}};
    // int arr2[][] = {{7, 8,9}, {12}};

    public static void main(String[] args) {

        int sinir = 0;
        int toplam = 0;

        int arr1[][] = {{1, 2}, {3, 4, 5}, {6}};
        int arr2[][] = {{7, 8, 9}, {12}};

        if (arr1.length <= arr2.length) {

            for (int i = 0; i < arr1.length; i++) {  //  sinir olarak kisa olan kat alindi

                sinir = arr1[i].length;
                if (arr1[i].length > arr2[i].length) {
                    sinir = arr2[i].length;

                } // buraya kadar sinirlari buldum

                for (int j = 0; j < sinir; j++) {
                    toplam = arr1[i][j] + arr2[i][j];
                    System.out.println("[" + i + "," + j + "]" + " index'indeki elemanlarin toplami = " + toplam);

                }// ic for

            }// dis for


        }// if // else kismi eklenmeli, kod eksik
    }// main
}// Class