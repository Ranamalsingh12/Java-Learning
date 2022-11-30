import java.util.Scanner;

public class Array {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        // Now Question is if we want to store collection of data type together? we can do this by using arrays. let's take a look into it. we can declare array with these two syntax
        // int[] arr = new int[5];
        // // or 
        // int[] arr1 = {324,432,43,23};
        // index start from 0.

        // now look at how it takes input

        // int[] arr = new int[5];
        // arr[0] = 23;
        // arr[1] = 40;
        // arr[2] = 432;
        // arr[3] = 65;
        // arr[4] = 124;

        // what if you have something like 1000 inputs 

        // for(int i = 0; i< arr.length; i++){
        //     arr[i] = input.nextInt();
        // }

        // or you can write foreach loop 
        // for (int num : arr) { //for every element 
        //     System.out.print(num);
        // }

        // System.out.println(arr[3]);

        // Array of objects 
        String[] str_array = new String[4];
        for (int i = 0; i < str_array.length; i++) {
            str_array[i] = input.next();
        }

        System.out.println(str_array[2]);

    }
}