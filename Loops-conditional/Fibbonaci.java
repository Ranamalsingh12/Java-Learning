import java.util.Scanner;


public class Fibbonaci {
    public static void main (String[] args) {
        // Q - write code for finding the nth fibbonacci number 

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;
        while(count<=n){
            int temp = b;
            b = b + a;
            a = temp;
            count++;
        }

        System.out.println(b);
    }
}