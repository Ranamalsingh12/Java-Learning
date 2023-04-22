import java.util.Arrays;

public class BubblSort {
    public static void main(String[] args) {
        int[] arr = {7,4,6,3,2};
        bubblSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubblSort(int[] arr){

        boolean swapped;
        // run the step n-1 times
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            for(int j = 1; j < arr.length - i; j++) {
                if(arr[j] < arr[j-1]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }

            if(!swapped) {
                break;
            }
        }
    }
}