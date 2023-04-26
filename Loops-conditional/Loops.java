import java.util.Scanner;

public class Loops {
    public static void main (String[] args){
        /* Now what are loops and why we use loops?
         So we use loops in case we want to repeat some code for some particular condition for particular amount of time */
        // Q Print Hello world 10 times;

        for (int n = 1; n<=10 ; n += 1){
            System.out.println("Hello world");
        }
        // Printing the numbers according to the user input from 1 to n (n = user input);
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for (int i = 1; i <= n ; i++){
            System.out.println(i);
        }


        // While Loop :- Sytax
        while (n < 10){
            System.out.println("This is because of while loop");
            n += 1;
        }
        // It will work same as for loop but now you might be wondering which one to use and when and thats really a common question a person ask the answer to that is that you can use whichever one you want. But one thing is recommended that if you know how many times you want to run the loop use for loop otherwise use while loop.

        /* Do-while loop - What this loop does is that => sytax
        do {
             this works;
         }while (condtion){

        } */

        int dowhile = 1;
        // do {
        //     System.out.println(dowhile);
        //     dowhile++;
        // }while (dowhile < 5){
        //     System.out.println("This is because of do-while loop");
        //     dowhile++ ; 
        // }

        // We use do-while loop if we want to run the code atleast once 
    }
}