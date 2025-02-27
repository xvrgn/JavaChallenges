package challenges;

import java.util.Arrays;

public class Anagram {
    private String firstWord;
    private String secondWord;

    // Constructor
    Anagram(String firstWord, String secondWord) {
        this.firstWord = firstWord;
        this.secondWord = secondWord;
    }

    // returns the first word
    public String getFirstWord() {
        return firstWord;
    }

    // returns the last word
    public String getSecondWord() {
        return secondWord;
    }

    // set the first word
    public void setFirstWord(String firstWord) {
        this.firstWord = firstWord;
    }

    public void setSecondWord(String secondWord) {
        this.secondWord = secondWord;
    }

    public boolean checkAnagram() {
        if (!checkLength()){
            return false;
        }
        char[] word1 = firstWord.toCharArray();
        char[] word2 = secondWord.toCharArray();

        Arrays.sort(word1);
        Arrays.sort(word2);

        return Arrays.equals(word1, word2);

    }

    private boolean checkLength() {
        return firstWord.length() == secondWord.length();
    }

}
