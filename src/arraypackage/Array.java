package arraypackage;

//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;

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
		
	}

}
