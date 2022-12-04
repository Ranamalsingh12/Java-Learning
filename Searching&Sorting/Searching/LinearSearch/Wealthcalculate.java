import java.util.Scanner;

public class Wealthcalculate {
    public static void main (String[] args) {
        // https://leetcode.com/problems/richest-customer-wealth/


        
    }

    static int maximumWealth(int[][] accounts) {
        int ans = Integer.MIN_VALUE;
        for ( int person = 0; person < accounts.length; person++) {

            //when start a new col take a new sum for that row
            int sum = 0;
            for ( int account = 0; account < accounts[person].length; account++ ) {
                sum += accounts[person][account];
            }

            // check with overall max

            if(sum > ans) {
                ans = sum;
            }
        }

        return ans;
    }
    
}