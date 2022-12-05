import java.util.Scanner;

public class OrderAgnosticBS {
    public static void main (String[] args) {
        // Scanner input = new Scanner(System.in);
        // int n = input.nextInt();

        int[] arr = {100,65,54,40,36,19,13,0,-4-14};
        int target = 65;

        int ans = orderAgBS(arr, target);
        System.out.println(ans);
        
        
    }

    static int orderAgBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        boolean isAsc = arr[start] < arr[end] ;

        while (start <= end) {
            
            int mid = start + (end - start)/2;

            if(arr[mid] == target ) {
                return mid;
            }
            if(isAsc) {
                if( target < arr[mid] ) {
                    end = mid - 1;
                } else if ( target > arr[mid] ) {
                    start = mid + 1;
                } else {
                    return mid;
                }
            } else {
                if( target > arr[mid] ) {
                    end = mid - 1;
                } else if ( target < arr[mid] ) {
                    start = mid + 1;
                } else {
                    return mid;
                }
            }
            
        }

        return -1;
    }
}