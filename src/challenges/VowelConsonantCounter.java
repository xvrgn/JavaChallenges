package challenges;
import java.util.Arrays;
import java.util.List;

public class VowelConsonantCounter {
    private String phrase;
    private int vowelCount;
    private int consonantCount;

    // list of vowels
    List<Character> vowel = Arrays.asList('a', 'e', 'i', 'o', 'u');

    // Constructor
    VowelConsonantCounter(String phrase) {
        this.phrase = phrase.toLowerCase();
        this.vowelCount = 0;
        this.consonantCount = 0;
    }

    // method to reset counter
    public void resetCounter() {
        vowelCount = 0;
        consonantCount = 0;
    }

    // setter
    public void setPhrase(String phrase){
        this.phrase = phrase;
    }

    // getter
    public int getVowelCount(){
        return vowelCount;
    }

    // getter
    public int getConsonantCount() {
        return consonantCount;
    }

    // method to count vowels
    public void vowelCounter(){
        char ch;
        for (int i = 0; i <= phrase.length() - 1; i++) {
            ch = phrase.charAt(i);
            if (vowel.contains(ch)) {
                vowelCount++;
            }
        }
    }

    // method to count consonant
    public void consonantCounter() {
        char ch;
        for (int i = 0; i <= phrase.length() - 1; i++) {
            ch = phrase.charAt(i);
            if (ch >= 'a' && ch <= 'z' && !vowel.contains(ch)) {
                consonantCount++;
            }
        }
    }

    // display Counters
    public void displayCounter() {
        System.out.println("Phrase: " +phrase);
        System.out.println("Vowel: " +vowelCount);
        System.out.println("Consonant: " +consonantCount);
    }

}

