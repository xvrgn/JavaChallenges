package DSA;

public class InsertionSort {

    private int[] arr;

    InsertionSort(int[] arr) {
        this.arr = arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    public int[] getArr(){
        return arr;
    }

    public void sort(){
        for (int i = 1; i < arr.length; i++){
            int temp = arr[i];          // store current value to temporary variable
            int j = i - 1;
            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];    // shifts element to the right
                j--;
            }
            arr[j + 1] = temp;
        }
    }

    public void display(){
        for (int num: arr){
            System.out.print(num +" ");
        }
    }

}
