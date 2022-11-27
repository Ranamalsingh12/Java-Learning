import java.util.Scanner;

public class PassValue {
    public static void main (String[] args) {
        int a = 10;
        int b = 50;

        SwapNumber(a,b);

        System.out.println(a + " " + b);
        // The value will not get swapped because we have to understand how pass by value works
        // lets take an example where the value will change 

        int[] arr = {1,2,3,4,5};
        System.out.println(Arrays.toString(arr));
    }

    static void change(int[ num]) {
        num[0] = 99;

    }


    static void SwapNumber (int a , int b) {
        int temp = a;
        a = b;
        b = templ
    }
}