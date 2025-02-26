package challenges;

public class WordReversal {
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
