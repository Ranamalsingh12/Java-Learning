import java.util.Scanner;

public class Function {
    public static void main (String[] args) {
        // Scanner input = new Scanner(System.in);
        // int n = input.nextInt();

        /* Now lets take a look at why we use function 
        so lets take an example lets say you want to add two numbers you write the simple code for it. Now what if i tell you to do this 20 times. ANd you just copy paste the whole code 20 times your problem is solved but is it right way to just copy paste the code 
        And what if i tell you to run the code 100 times what will you do then? your code will be very much disgusting. For to create such a bundle and use it to the same code again and again can be done via functions.
        
        */
    
        sumTwoNum();
    }

    // The usage of static here means that anything you want to use in static has to be static itself
    // What is return type means - when you call the function what is the value of this particular call going to be. the function call have some value and the value is going to be whatever you return in the function


    static void sumTwoNum () {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the First no : ");
        int n1 = input.nextInt();
        System.out.print("Enter the second no : ");
        int n2 = input.nextInt();
        
        int sum = n1 + n2;
        System.out.println("The sum is : " + sum);
    }
}