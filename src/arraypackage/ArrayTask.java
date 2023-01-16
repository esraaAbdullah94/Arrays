package arraypackage;

import java.util.Arrays;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;


public class ArrayTask {

	public static void main(String[] args)

	{

		System.out.println("Finging the third highest number");
		System.out.println("*********************");

		int array[] = { 1, 5, 9, 3, 7, 8, 2, 4, 6 };
		Arrays.sort(array);

		System.out.println("The third highest number in the array is " + array[array.length - 3]);
		
		System.out.println("*********************");
		System.out.println("Finds the maximum product");
		System.out.println("*********************");
	
		Integer[] numbers = { 1, 2, 3, 4, 5, 6 };
		
			Arrays.sort(numbers,Comparator.reverseOrder());
			int total=1;
			for (int i = 0; i<4; i++) {
				total *= numbers[i];
				
			}
			System.out.println(" maximum product " + total);
			
			System.out.println("*********************");
			System.out.println("longest decreasing subarray");
			int[] arrayy = {1, 2, 2, 3, 4, 4, 5, 5};

			// Remove duplicates from array
			Set<Integer> set = new HashSet<Integer>();
			for (int i = 0; i < arrayy.length; i++) {
			    set.add(arrayy[i]);
			}

			// Rearrange the array in decreasing order
			int[] newArray = new int[set.size()];
			int i = 0;
			for (Integer num : set) {
			    newArray[i] = num;
			    i++;
			}
			Arrays.sort(newArray);
			for (int j = 0; j < newArray.length / 2; j++) {
			    int temp = newArray[j];
			    newArray[j] = newArray[newArray.length - 1 - j];
			    newArray[newArray.length - 1 - j] = temp;
			}
			System.out.println(Arrays.toString(newArray));

	}

}
