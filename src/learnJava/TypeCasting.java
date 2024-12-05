package learnJava;
import java.util.Scanner;

public class TypeCasting {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        // Read the number as a double.
	        // TODO: Write your code here to read a double from the console
	        double number = scanner.nextDouble();

	        // Convert and print the number to an integer.
	        // TODO: Write your code here to convert the double to an integer and print it out to the console
	        int integerNumber = (int) number;
	        System.out.println("The integer value is: " + integerNumber);
	        scanner.close();
	}

}
