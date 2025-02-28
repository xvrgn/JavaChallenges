package challenges;

public class NumberReversal {
    private int number;
    private int reversedNumber;

    // constructor
    NumberReversal(int number) {
        this.number = number;
    }

    // set input number
    public void setNumber(int number) {
        this.number = number;
    }

    // get reversed number
    public int getReversedNumber() {
        return reversedNumber;
    }

    // method to reverse an integer
    public int reverseNumber(){
        char ch;
        String temp = "";
        String numStr = String.valueOf(number);
        for (int i = 0; i <= numStr.length() - 1; i++) {
            ch = numStr.charAt(i);
            temp = ch + temp;
        }
        reversedNumber = Integer.parseInt(temp);
        return reversedNumber;
    }
}