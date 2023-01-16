package arraypackage;

import java.util.Arrays;
<<<<<<< HEAD
import java.util.Comparator;
=======
>>>>>>> aedb2a7fb72b0c4baee3d97edd2f71fb5e8fbe53

public class ArrayTask {

	public static void main(String[] args)

	{
<<<<<<< HEAD
		/*System.out.println("Finging the third highest number");
		System.out.println("*********************");

		int array[] = { 1, 5, 9, 3, 7, 8, 2, 4, 6 };
		Arrays.sort(array);

		System.out.println("The third highest number in the array is " + array[array.length - 3]);*/
		
		System.out.println("Finds the maximum product");
		System.out.println("*********************");
	
		Integer[] numbers = { 1, 2, 3, 4, 5, 6 };
		
			Arrays.sort(numbers,Comparator.reverseOrder());
			int total=1;
			for (int i = 0; i<4; i++) {
				total *= numbers[i];
				
			}
			System.out.println(" maximum product " + total);
		
		
=======
		System.out.println("**********************");
		System.out.println("Finging the third highest number");
		int array[] = { 1, 5, 9, 3, 7, 8, 2, 4, 6 };
		Arrays.sort(array);

		System.out.println("The third highest number in the array is " + array[array.length - 3]);

>>>>>>> aedb2a7fb72b0c4baee3d97edd2f71fb5e8fbe53
	}
}
