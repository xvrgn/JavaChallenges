package challenges;
// no branching
// no using of built-in methods


import java.util.Arrays;

public class BruteForce {

    private int a, b, c, d, e;
    private int maximumNumber;
    private int secondMaximumNumber;

    BruteForce(int[] arr) {
        this.a = arr[0];
        this.b = arr[1];
        this.c = arr[2];
        this.d = arr[3];
        this.e = arr[4];
    }

    public int findGreatestNumber(){
        maximumNumber = (a > b ? a : b);
        maximumNumber = (maximumNumber > c ? maximumNumber : c);
        maximumNumber = (maximumNumber > d ? maximumNumber : d);
        maximumNumber = (maximumNumber > e ? maximumNumber : e);
        return maximumNumber;
    }

    public int findSecondGreatestNumer(){
        maximumNumber = findGreatestNumber();

        secondMaximumNumber = (a < maximumNumber ? a : b);
        secondMaximumNumber = (b < maximumNumber && b > secondMaximumNumber ? b : secondMaximumNumber);
        secondMaximumNumber = (c < maximumNumber && c > secondMaximumNumber ? c : secondMaximumNumber);
        secondMaximumNumber = (d < maximumNumber && d > secondMaximumNumber ? d : secondMaximumNumber);
        secondMaximumNumber = (e < maximumNumber && e > secondMaximumNumber ? e : secondMaximumNumber);
        return secondMaximumNumber;
    }

    public void setIntegers(int[] arr) {
        this.a = arr[0];
        this.b = arr[1];
        this.c = arr[2];
        this.d = arr[3];
        this.e = arr[4];
    }

    public int getGreatestInteger(){
        return maximumNumber;
    }

    public int getSecondGreatestNumber(){
        return secondMaximumNumber;
    }

    public static void main(String[] args) {
        int[] arr = {23, 67, 16, 45, 73};
        BruteForce bb = new BruteForce(arr);

        System.out.print("Sorted Array: ");
        Arrays.sort(arr);
        for (int num: arr) {
            System.out.print(num +" ");
        }
        System.out.println();
        System.out.println("First Greatest Number: " +bb.findGreatestNumber());
        System.out.println("Second Greatest Number: " +bb.findSecondGreatestNumer());
    }

}
