package DSA;

public class bubbleSort {

    private int[] arr;

    bubbleSort(int[] arr) {
        this.arr = arr;
    }

    public void setArr(int[] arr){
        this.arr = arr;
    }

    public int[] getArr(){
        return arr;
    }

    private boolean swapped(){
        int i = 0;
        boolean swapped = false;
        while (i < arr.length - 1) {
            if (arr[i] > arr[i+1]){

                arr[i] = arr[i]^arr[i+1];
                arr[i+1] = arr[i]^arr[i+1];
                arr[i] = arr[i]^arr[i+1];

                swapped = true;
            }
            i++;
        }
        return swapped;
    }


    public void sort(){
        boolean sorted;
        do {
            sorted = swapped();
        } while (sorted);
    }

    public void display(){
        for (int num: arr) {
            System.out.print(num +" ");
        }
    }

    public static void main(String[] args) {
        int[] numArr = {5,8,3,7,9,1,4,2};
        bubbleSort arr = new bubbleSort(numArr);

        arr.sort();
        arr.display();

    }

}
