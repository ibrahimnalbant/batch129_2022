package replitquestions;
import java.util.Scanner;
public class CharacterCount {

    /*
    the user is prompted to enter a name, which is then stored in the "name" variable.
    The user is then prompted to enter a character, which is stored in the "ch" variable.
    A loop iterates through each character of the name and checks if it is equal to the character entered by the user.
    If it is, the count variable is incremented.
    After the loop, the count variable is printed, showing how many times the character was repeated in the name.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a name: ");
        String name = scanner.nextLine();
        System.out.println("Enter a character: ");
        char ch = scanner.next().charAt(0);

        int count = 0;
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == ch) {
                count++;
            }
        }
        System.out.println("Number of " + ch + " = " + count);
    }
}
