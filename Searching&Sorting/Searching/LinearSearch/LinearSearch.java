import java.util.Scanner;

public class LinearSearch {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        // int n = input.nextInt();
        
        //Linear search - It is a searching method typically as the name suggested this method is used to search an item or whatever you want to search like int, char or string in array or any other data structure linearly means it will start from the first index and will go to last until the "thing" you want to search is found.

        int[] elements = {32,1,4,56,53,23};

        int target = 23;

        int ans = linearSearch(elements,target);

        System.out.println(ans);


    }

    // Search in the array
    static int linearSearch(int[] arr, int target) {
        if(arr.length == 0 ){
            return -1;
        }

        // running a loop for checking the target
        for (int i = 0; i < arr.length ; i++ ) {
            //Now here you write the code for checking if the target is present or not

            int ele = arr[i];
            if( ele == target ) {
                return i;
            }
        }

        return -1;
    }
}