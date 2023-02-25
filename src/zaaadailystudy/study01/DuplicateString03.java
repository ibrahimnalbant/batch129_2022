package zaaadailystudy.study01;
/*
First for loop is iterating through the characters of the input string
Inside that, inner for loop is iterating through the characters before the current character of the outer loop.
It checks if the current character of the outer loop is equal to any of the previous characters.
If the current character is found to be equal to any of the previous characters, the boolean variable "seen" is set to true and the inner loop is broken.
If the current character is not seen before, the third for loop is iterating through the characters after the current character of the outer loop.
It checks if the current character of the outer loop is equal to any of the characters after it.
If the current character is found to be equal to any of the characters after it, it prints the character and inner loop is broken.
After inner loop, the variable "seen" is set back to false for next iteration of the outer loop.
This way it will only print the duplicate characters once and will give the output in the format "a, s"
 */
public class DuplicateString03 {
    public static void main(String[] args) {
        String input = "Javaisalsoeasy";
        boolean seen = false;
        for (int i = 0; i < input.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (input.charAt(i) == input.charAt(j)) {
                    seen = true;
                    break;
                }
            }
            if (!seen) {
                for (int k = i + 1; k < input.length(); k++) {
                    if (input.charAt(i) == input.charAt(k)) {
                        System.out.print(input.charAt(i) + ", ");
                        break;
                    }
                }
            }
            seen = false;
        }
    }
}
