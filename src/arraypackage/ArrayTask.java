package arraypackage;

import java.util.Arrays;

import java.util.Comparator;


public class ArrayTask {

	public static void main(String[] args)

	{

		System.out.println("Finging the third highest number");
		System.out.println("*********************");

		int array[] = { 1, 5, 9, 3, 7, 8, 2, 4, 6 };
		Arrays.sort(array);

		System.out.println("The third highest number in the array is " + array[array.length - 3]);
		
		
		
		

	}
}
