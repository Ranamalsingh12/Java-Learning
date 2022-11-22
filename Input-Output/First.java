// everything you write in java will be in class
import java.util.Scanner;

public class First {

    //static is over here because we dont want to make object of the First class before
    // running the main function because its the first thing to run in java code
    //string and args are arguments and they are command line arguement
    public static void main (String[] args) {
        System.out.println("Hello world !");

        Scanner input = new Scanner(System.in);
        System.out.println(input.nextInt());

    }
}