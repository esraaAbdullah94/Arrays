package arraypackage;

import java.util.Scanner;
import java.util.Stack;

public class AraayTask2 {
	public static void main(String[] args) {
		System.out.println("**** A palindrome using a stack****");
		System.out.println("*********************");
		System.out.print("Enter any string:");
        Scanner scanner=new Scanner(System.in);
        String inputString = scanner.nextLine();
        Stack<Character> stack1 = new Stack<Character>();

        for (int i = 0; i < inputString.length(); i++) {
            stack1.push(inputString.charAt(i));
        }

        String reverseString = "";

        while (!stack1.isEmpty()) {
            reverseString = reverseString+stack1.pop();
        }

        if (inputString.equals(reverseString))
            System.out.println("The input String is a palindrome.");
        else
            System.out.println("The input String is not a palindrome.");

		scanner.close();
		
		
		
		//A push operation adds an element to the topmost position of the stack, 
		//while the pop operation deletes the topmost element of the stack.
		Stack <String> stack = new Stack<>();
		stack.push("Item 1");
		stack.push( "Item 2" );
		stack.push ("Item 3" );
		stack.push( "Item 4");
		stack.push( "Item 5");
		System.out.println("**** push and pop operations****");
		System.out.println("*********************");
		System.out.println("Topmost Element of the stack: " + stack.peek());
		stack.pop();
		System.out.println("After popping one item:");
		System.out.println("Topmost Element of the stack: " + stack.peek());
		
		System.out.println("**** Try to use get for the middle element****");
		System.out.println("*********************");
		System.out.println("Middle Element of the stack: " + stack.get(2));
		////////////////
		System.out.println("**** Second largest element in the stack****");
		System.out.println("*********************");
		 Stack<Integer> staack = new Stack<Integer>();
	        staack.push(1);
	        staack.push(2);
	        staack.push(3);
	        staack.push(4);

	        int largest = Integer.MIN_VALUE;
	        int secondLargest = Integer.MIN_VALUE;

	        while (!staack.empty()) {
	            int current = staack.pop();
	            if (current > largest) {
	                secondLargest = largest;
	                largest = current;
	            } else if (current > secondLargest) {
	                secondLargest = current;
	            }
	        }

	        System.out.println("Second largest element in the stack: " + secondLargest);
		
		
		
		

	}

}
