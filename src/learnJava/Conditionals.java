package learnJava;
import java.util.Scanner;

public class Conditionals {

    public static void main(String args[]) {
        // Create a Scanner object to read input
        Scanner in = new Scanner(System.in);

        // Read the next integer
        int n = in.nextInt(); 

        // Compute and print the square of n
        System.out.println("Square of n: " + (n * n));

        // Compute and print the cube of n
        System.out.println("Cube of n: " + (n * n * n));

        // Compute and print the fourth power of n
        System.out.println("Fourth power of n: " + (n * n * n * n));
        
        in.close(); // Close the scanner
    }
}
