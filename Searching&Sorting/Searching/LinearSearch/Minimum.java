import java.util.Scanner;

public class Minimum {
    public static void main (String[] args) {
        // Scanner input = new Scanner(System.in);
        // int n = input.nextInt();

        int[] arr = {12,324,43,5,2,543,66};
        System.out.println(min(arr));
        
    }

    static int min(int[] arr) {
        int ans = arr[0];

        for (int i = 1; i < arr.length; i++ ) {
            if ( arr[i] < ans) {
                ans = arr[i];
            }
        }

        return ans;
    }
}