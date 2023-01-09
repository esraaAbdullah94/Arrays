package arraypackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		int number[] = { 1, 2, 22, 2 };
		int largest = 0;
		for (int i = 0; i < number.length; i++) {
			if (number[i] > largest) {
				largest = number[i];
			}
		}
		System.out.println("Qustion 1");
		System.out.println("Finding largest number using 1 for loop");

		System.out.println("Largest number: " + largest);
		
		System.out.println("**********************");
		System.out.println("Qustion 2");
		///////////

		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.print("Enter a  first number : ");
			int num = scanner.nextInt();
			System.out.print("Enter a second number : ");
			int num2 = scanner.nextInt();

			if (num >= 0 && num <= 100 && num2 >= 0 && num2 <= 100) {
				// the number is within the range, so we can break out of the loop
				break;
			}

			else {
				System.out.println("The number is out of range. Please try again.");
			}
		}
		
		System.out.println("**********************");
		System.out.println("Qustion 3");
		
		int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5 };
		System.out.println("Enter number: ");
		int num = scanner.nextInt();
		int count = 0;
		for (int n : numbers) {
			if (n == num) {
				count++;
			}
		}
		System.out.println(num + " appears " + count + " times in the array");
		
		
		scanner.close();
		
	}

}
