import java.util.Scanner;

public class Switch {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        // let's now take a look at 2D arrays - it's kind of matrix. now lets take a look how its get defined.
        int[][] arr2D = new int[3][];
        // we have to specify the number of rows first its mandatory.
        // You can imagine it as array within the array 

        // Input 

        for (int i = 0; i < arr2D.length; i++) {
            // for each column in every row

            for (j = 0; i < arr2D[i].length; i++ ) {
                arr[i][j] = int.nextInt();
            }
        }

        for (int i = 0; i < arr2D.length; i++) {
            // for each column in every row

            for (j = 0; i < arr2D[i].length; i++ ) {
                System.out.println(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}