// everything you write in java will be in class
import java.util.Scanner;

public class First {

    //static is over here because we dont want to make object of the First class before
    // running the main function because its the first thing to run in java code
    //string and args are arguments and they are command line arguement

    //String is a primitive data type because we can break it into further data
    public static void main (String[] args) {
        System.out.println("Hello world !");

        Scanner input = new Scanner(System.in);
        System.out.println(input.nextInt());
        System.out.println(input.nextFloat()); //For float

        // There is an interesting concept of type conversion in java - It happens when we change the type of data from higher to lower like float to int ( because they can be changed ) but we cant change char or string to number 

        // But now you might be wondering that how can we convert int to float that problem is solved by the method called typecasting for eg :
        // compressing the bigger number in a smaller type explicitly 
        int num = (int)(67.532f);
        System.out.println(num);

        // Now lets talk about automatic type promotion in expressions now this is very intersting lets consider that you want to store the value 257 int to byte (256 memory) what will be the output. lets see

        int a = 260;
        byte b = (byte)(a);

        System.out.println(b);  // This will give us 4 because as we know that the byte is of 256 memory and we are storing 4 more than the memory so its basically gives us the reminder

    }
}