import java.util.Scanner;

public class Switch {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        String color = input.next();
        // We will use switch case because the if else pattern is a little repetetive so we are using the switch case statement
        /* The syntax is :
        switch (expression) {
            case one :{
                do some work
                break;
            }
            default :{
                do some work
            }
        } 
        When the case matches the code inside the case will run and break will stop the entire switch case statement when we found the case and we do the work after it break stop the program.
        */

        switch (color) {
            case "Red":
                System.out.println("Danger color");
                break;
            case "Green":
                System.out.println("Success mission color");
                break;
            case "Black":
                System.out.println("Everyone's fav color");
                break;
            default : 
                System.out.println("Please enter a good color");
        }


    }
}