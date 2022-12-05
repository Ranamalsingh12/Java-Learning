import java.util.Scanner;

public class BinarySearch {
    public static void main (String[] args) {
        // Scanner input = new Scanner(System.in);
        // int n = input.nextInt();

        int[] arr = {-14,-4,0,13,19,36,40,54,65,100};
        int target = 65;

        int ans = binarySearch(arr, target);
        System.out.println(ans);
        
    }

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            // int mid = (start+end)/2; it will cause error if we have so big start and end value

            int mid = start + (end - start)/2;

            if( target < arr[mid] ) {
                end = mid - 1;
            } else if ( target > arr[mid] ) {
                start = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }
}