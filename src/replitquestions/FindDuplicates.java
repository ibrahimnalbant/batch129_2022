package replitquestions;
import java.util.HashSet;
import java.util.Set;
/*
a method duplicateChars takes a string as input and uses two sets,
one to store the characters that have been encountered so far and the other to store the duplicate characters.
Then the program iterates through each character in the string and checks if it is already present in the first set.
If it is, it is added to the set of duplicates.
Finally, it converts the set of duplicate characters to an array of characters and returns it.
The main method calls the duplicateChars method and prints the duplicate characters.
 */
public class FindDuplicates {
    public static char[] duplicateChars(String str) {
        Set<Character> set = new HashSet<>();
        Set<Character> duplicate = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (set.contains(ch)) {
                duplicate.add(ch);
            } else {
                set.add(ch);
            }
        }
        char[] dup = new char[duplicate.size()];
        int i = 0;
        for (Character ch : duplicate) {
            dup[i++] = ch;
        }
        return dup;
    }

    public static void main(String[] args) {
        String str = "Javaisalsoeasy";
        char[] duplicates = duplicateChars(str);
        System.out.println("Duplicate characters in the given string: ");
        for (char ch : duplicates) {
            System.out.print(ch + " ");
        }
    }
}
