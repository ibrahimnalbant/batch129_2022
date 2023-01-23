package replitquestions;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindDuplicates02 {
    /*
    In this version, instead of using HashSet I used ArrayList,
    Scanner is used to get the input String,
    and Arrays.toString(duplicates.toArray()) is used to print the list of duplicate characters.
    This way you can use the List interface and the power of ArrayList with the user-friendliness of Scanner.
     */
    public static List<Character> duplicateChars(String str) {
        ArrayList<Character> set = new ArrayList<>();
        ArrayList<Character> duplicate = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (set.contains(ch)) {
                duplicate.add(ch);
            } else {
                set.add(ch);
            }
        }
        return duplicate;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = scanner.nextLine();
        List<Character> duplicates = duplicateChars(str);
        System.out.println("Duplicate characters in the given string: " + Arrays.toString(duplicates.toArray()));
    }
}
