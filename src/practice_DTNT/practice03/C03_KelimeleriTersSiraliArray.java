package practice_DTNT.practice03;

public class C03_KelimeleriTersSiraliArray {

    /*
        Her girdi satırı, tek boşluklarla ayrılmış bir veya birkaç sözcük içerir.
        Sözcükler değişmeden,her giriş satırındaki sözcüklerin sırasını
        tersine çevirmek için kod yazınız.
        Çıktınızın satırlarında sonunda veya başında boşluk olmamalıdır.
        Örnek; Kemal Can Kuzu, Kuzu Can Kemal'e dönüşecektir
    */

    public static void main(String[] args) {

        String str= " Kemal Can Kuzu ";
        String arr[] = str.split(" ");
        String tersStr = "";   // hiclik atadik

        for (int i = arr.length-1 ; i >= 0 ; i--) {
            tersStr += arr[i] + " ";

        }

        System.out.println(tersStr);

        System.out.println(tersStr.trim());  // basinda ve sonunda bosluk olmasin diye trim yaptik

    }
}
