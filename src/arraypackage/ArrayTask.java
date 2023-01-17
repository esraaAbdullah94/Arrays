package arraypackage;

import java.util.Arrays;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class ArrayTask {

	public static void main(String[] args)

	{
		System.out.println("****Answer q1****");
		System.out.println("*********************");
		int array[] = { 1, 5, 9, 3, 7, 8, 2, 4, 6 };
		Arrays.sort(array);

		System.out.println("The third highest number in the array is " + array[array.length - 3]);


		System.out.println("*********************");
		System.out.println("****Answer q2****");
		Integer[] numbers = { 1, 2, 3, 4, 5, 6 };

		Arrays.sort(numbers, Comparator.reverseOrder());
		int total = 1;
		for (int i = 0; i < 4; i++) {
			total *= numbers[i];

		}
		System.out.println(" maximum product " + total);

		

		System.out.println("****Answer q3****");
		System.out.println("*********************");
		System.out.println("longest decreasing subarray");
		int[] arrayy = { 1, 2, 3, 4, 5, 4, 3, 2, 1 };

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
		
		System.out.println("****Answer q4****");
		System.out.println("*********************");
		int[] numberss = {1, 2, 15, 20, 15, 30, 20, 15, 15};
		int maxCount = 0;
		int maxNum = 0;

		for (int i1 = 0; i1 < numberss.length; i1++) {
		    int num = numberss[i1];
		    int count = 0;

		    for (int j = 0; j < numberss.length; j++) {
		        if (num > 10 && num == numberss[j]) {
		            count++;
		        }
		    }

		    if (count > maxCount) {
		        maxCount = count;
		        maxNum = num;
		    }
		}

		System.out.println("Number " + maxNum + " is the most repeated and is greater than 10, it appears " + maxCount + " times.");
		System.out.println("****Answer q5****");
		System.out.println("*********************");
		int[] nummbers = {5, 10, 20, 25, 30};
		int expectedNum = 5;

		for (int i2 = 0; i2 < nummbers.length; i2++) {
		    if (nummbers[i2] > expectedNum) {
		        while (expectedNum < nummbers[i2]) {
		            if (expectedNum % 5 == 0) {
		                System.out.println("Missing number: " + expectedNum);
		            }
		            expectedNum++;
		        }
		    }
		    expectedNum = nummbers[i2] + 1;
		}
		System.out.println("****Answer q6****");
		System.out.println("*********************");
		int[] arraay = {1, 2, 4, 6, 8, 10};
		int k = 10;

		for (int i3 = 0; i3 < arraay.length; i3++) {
		    if (arraay[i3] % 2 == 0) {
		        for (int j = i3+1; j < arraay.length; j++) {
		            if (arraay[j] % 2 == 0 && arraay[i3] + arraay[j] == k) {
		                System.out.println(arraay[i3] + " + " + arraay[j] + " = " + k);
		                return;
		            }
		        }
		    }
		}
		System.out.println("False");
	}

}
