package arraypackage;

import java.util.Arrays;

public class ArrayTask {

	public static void main(String[] args)

	{
		System.out.println("**********************");
		System.out.println("Finging the third highest number");
		int array[] = { 1, 5, 9, 3, 7, 8, 2, 4, 6 };
		Arrays.sort(array);

		System.out.println("The third highest number in the array is " + array[array.length - 3]);

	}
}
