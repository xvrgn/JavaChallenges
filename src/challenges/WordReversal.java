package challenges;

public class WordReversal {

    /**
     * Initialize a variable: Create an empty string {@code output} to hold the reversed keyword;
     * Loop through input String: for each character of input word;
     * Reverse the string: concatenate each character {@code ch} in the beginning of {@code output} String;
     * Return the reversed word: after the loop finishes, the {@code output} contains the reversed word of the {@code input} String
     */

    public static String reverseWord(String input) {
        char ch;
        String output = "";
        for (int i = 0; i < input.length(); i++) {
            ch = input.charAt(i);
            output = ch + output;
        }
        return output;
    }
}
