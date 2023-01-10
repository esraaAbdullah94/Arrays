package arraypackage;

import java.util.ArrayList;
import java.util.Arrays;
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
		
		System.out.println("**********************");
		System.out.println("Qustion 4");
		
		int[] numbers3 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		System.out.println("Enter number: ");
		int num3= scanner.nextInt();
		List<int[]> pairs = new ArrayList<>();
		for (int i = 0; i < numbers3.length; i++) {
		  for (int j = i + 1; j < numbers3.length; j++) {
		    if (numbers3[i] + numbers3[j] == num3) {
		      pairs.add(new int[]{numbers3[i], numbers3[j]});
		    }
		  }
		}

		for (int[] pair : pairs) {
		  System.out.println("["+pair[0] + "," + pair[1]+"]");
		}
		
		System.out.println("**********************");
		System.out.println("Qustion 5");
		
		//int[] array = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5};
		int[] array = {0, 0, 1, 1, 2, 2, 3, 3, 4, 4};

		int[] result = new int[array.length];
		int index = 0;
		for (int i = 0; i < array.length; i++) {
		    boolean isDuplicate = false;
		    for (int j = 0; j < i; j++) {
		        if (array[i] == array[j]) {
		            isDuplicate = true; 
		            break;
		        }
		        
		    }
		    if (!isDuplicate) {
		        result[index++] = array[i];
		        
		    }
		    
		}
		//System.out.println("Input "+ "[1, 1, 2, 2, 3, 3, 4, 4, 5, 5]");
		result = Arrays.copyOf(result, index);
		
		System.out.println("Length of new array: "+result.length + "\n" +" Output "+ Arrays.toString(result));
		
		scanner.close();
		System.out.println("**********************");
		System.out.println("Qustion 6");
		
		int[] firstArray = {1, 2, 3, 4, 5};        //source array  
		int[] secondArray = {6, 7, 8, 9, 10};  //destination array  
		int fal = firstArray.length;        //determines length of firstArray  
		int sal = secondArray.length;   //determines length of secondArray  
		int[] resultt = new int[fal + sal];  //resultant array of size first array and second array  
		System.arraycopy(firstArray, 0, resultt, 0, fal);  
		System.arraycopy(secondArray, 0, resultt, fal, sal);  
		System.out.println(Arrays.toString(resultt));
		
	}

}
