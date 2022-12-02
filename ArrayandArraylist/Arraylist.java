import java.util.Scanner;

public class Arraylist {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        //For dynamically storing we can use array list 

        ArrayList<Integer> list = new ArrayList<>(10);

        // you can add in this list object 

        list.add(67);
        list.add(432);
        list.add(65);
        list.add(542);
        list.add(32);
        list.add(98);

        // you can update in this list object 

        list.set(0,99);

        // and also you can remove from it 

        list.remove(3);
        
    }
}