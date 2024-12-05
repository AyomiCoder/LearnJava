package learnJava;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.println("Enter a number:");
//		int number = scanner.nextInt();
//		
//		if (number > 0) {
//			System.out.println("Number is Positive");
//		} else if (number < 0) {
//			System.out.println("Number is negative");
//		} else {
//			System.out.println("Number is zero");
//		}
//		
//		scanner.close();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a dayNumber:");
		int day = scanner.nextInt();
		
		
		switch (day) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
		}
	
	}
}
		

		
		
		
