package TR_Forwhile;

public class Q03 {
    /*
    Bir String icerisinde yinelenen karakterleri döndüren bir kod yazıniz.(mülakat Sorusu)
Input :
String str=“Javaisalsoeasy”
Output: a s
     */
    public static void main(String[] args) {
        String alfabe = "abcdefghijklmnopqrstuvwxyz";
        String str = "Javaisalsoeasy";
        String newStr = "";

        for (int i = 0; i < alfabe.length(); i++) {
            int counter = 0;
            for (int j = 0; j < str.length(); j++) {

                if (alfabe.charAt(i)==str.charAt(j)){
                    counter++;
                }

            }if (counter>1){
                newStr = newStr + alfabe.charAt(i)+ " ";
            }

        }
        System.out.println(newStr);
    }
}
