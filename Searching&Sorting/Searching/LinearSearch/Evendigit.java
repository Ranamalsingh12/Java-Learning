import java.util.Scanner;

// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/ 

public class Evendigit {
    public static void main (String[] args) {
        int[] nums = {12,345,2,6,7896};

        System.out.println(findNumbers(nums));
    }

    static int findNumbers ( int[] nums ) {
        int count = 0;

        for (int num : nums) {
            if (even(num)) {
                count++;
            }
        }
        return count;
    }
    
    // checking the number is even or not

    static boolean even( int num ) {
        int numberofDigits = countDigits(num);

        /* 

        if(numberofDigits % 2 == 0) {
            return true;
        }
         return false;

        or 
        */ 

        return numberofDigits % 2 == 0;
    }

    // count number of digits in a number
    static int countDigits(int num) {
        if( num < 0) {
            num = num * -1;
        }

        if ( num == 0) {
            return 1;
        }
        int count = 0;

        while ( num > 0 ) {
            count++;
            num = num / 10;
        }

        return count;
    }

    // or the optimized way is 

    static int countDigits(int num) {
        if (num < 0) {
            num = num * -1;
        }
        return (int) (Math.log10(num)) +1;
    }
}