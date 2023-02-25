package zaaadailystudy.study01;
/*
This code uses nested for loops to compare each character in the input string to every other character in the string,
 starting with the next character.
 If a duplicate character is found, it is printed and the inner loop breaks,
 so that the duplicate character is not printed again.
 */
public class DuplicateString02 {
    public static void main(String[] args) {
        String input = "Javaisalsoeasy";
        for (int i = 0; i < input.length(); i++) {
            for (int j = i + 1; j < input.length(); j++) {
                if (input.charAt(i) == input.charAt(j)) {
                    System.out.print(input.charAt(i) + " ");
                    break;
                }
            }
        }
    }
}
