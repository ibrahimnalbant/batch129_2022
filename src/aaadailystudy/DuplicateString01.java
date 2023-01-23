package aaadailystudy;

/*
This code creates an array "count" with a length of 256 (the number of possible characters in the ASCII character set)
 and then uses a loop to iterate through each character in the input string.
  For each character, it increases the count of that character in the "count" array.
  Then, another loop iterates through the input string again and checks if the count of each character
  in the "count" array is greater than 1. If it is, it prints the character and sets the count of that character
   in the "count" array to 0 so that it won't be printed again.
 */
public class DuplicateString01 {
    public static void main(String[] args) {
        String input = "Javaisalsoeasy";
        int[] count = new int[256];
        for (int i = 0; i < input.length(); i++) {
            count[input.charAt(i)]++;
        }
        for (int i = 0; i < input.length(); i++) {
            if (count[input.charAt(i)] > 1) {
                System.out.print(input.charAt(i) + " ");
                count[input.charAt(i)] = 0;
            }
        }
    }
}
