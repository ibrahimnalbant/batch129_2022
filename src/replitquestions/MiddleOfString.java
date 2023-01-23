package replitquestions;

public class MiddleOfString {
                /*
                Create 2 words : name1 and name2
            if the name1 has even numbers of characters,
            then insert the second word in the middle of the first name
            if the first word has odd numbers
            Then print the “Name2 cannot be inserted in the name1”
                 */
    public static void main(String[] args) {
        String name1 = "mehmet";
        String name2 = "ahmet";

        if (name1.length() % 2 == 0) {
            int mid = name1.length() / 2;
            String newName = name1.substring(0, mid) + name2 + name1.substring(mid);
            System.out.println(newName);
        } else {
            System.out.println("Name2 cannot be inserted in the name1");
        }
    }
}
