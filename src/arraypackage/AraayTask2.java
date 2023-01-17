package arraypackage;

import java.util.Scanner;
import java.util.Stack;

public class AraayTask2 {
	public static void main(String[] args) {
		//A push operation adds an element to the topmost position of the stack, 
		//while the pop operation deletes the topmost element of the stack.
		Stack <String> stack = new Stack<>();
		stack.push("Item 1");
		stack.push( "Item 2" );
		stack.push ("Item 3" );
		stack.push( "Item 4");
		

		System.out.println("Topmost Element of the stack: " + stack.peek());
		stack.pop();
		System.out.println("After popping one item:");
		System.out.println("Topmost Element of the stack: " + stack.peek());
		
		System.out.println("****Answer q6****");
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

	}

}
