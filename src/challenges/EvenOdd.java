package challenges;

public class EvenOdd {

    // check if the number is Even
    public static Boolean isEven(int n) {
        return (n % 2 == 0) ? true: false;
    }

    // check if the number is Odd
    public static boolean isOdd(int n) {
        return (n % 2 == 1) ? true : false;
    }

    // check if it is even or odd
    public static void checkEvenOdd(int n) {
        if (n % 2 == 1) {
            System.out.println("Odd");
        } else if (n % 2 == 0) {
            System.out.println("Even");
        }
    }
}
