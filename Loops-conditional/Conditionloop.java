public class Conditionloop {

    public static void main (String[] args) {

        /*

        if else condtional statement 
        Now you might be wondering why we use if else condition it is used to run a particular code on the basis whether the condition you are applying is true or false.
        let's take an example and look at the syntax:

        */
        int number = 2400;

        /* if else condition starting point firstly we are checking if the number is > 2000 of that is true the code in the if statement will run and the other one will not
        */
        if (number > 2000) {
            number = number + 1000;
        }
        else {
            number = number + 500;
        }

        System.out.println(number);
    }
}