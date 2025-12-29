package demo;

import java.util.Scanner;

/* Exercise 1: Input a string then perform the below acttion
 * 1. Reverse 
 * 2. Count the words
 * 3. isPalindrome or not
 * */

public class Exercise1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Input the string
		StringBuilder s;
		do {
		System.out.print("Enter a string: ");
		s = new StringBuilder(sc.nextLine());
		} 
		while (s.toString().trim() == "");
		
		// Show functions menu and prompt for choice
		String key = "";
		do {
		System.out.println("=====Menu=====");
		System.out.println("1. Reverse");
		System.out.println("2. Count words");
		System.out.println("3. Check if Palindrome");
		
		System.out.print("Enter your choice: ");
		int choice = sc.nextInt();
		
		switch (choice) {
			case 1:
				reverse(s);
				break;
			case 2:
				wordCount(s);
				break;
			case 3:
				Palindrome(s);
				break;
			default:
				System.out.println("Invalid choice !!!");
				break;
				}
		
			System.out.print("Press y/Y to continue: ");
			sc.nextLine();
			key = sc.nextLine();
		} while(key.equalsIgnoreCase("y"));	
	}
	
	public static void reverse(StringBuilder s) {		
		System.out.println("1. Reversed string: " + s.reverse());
	}
	
	public static void wordCount(StringBuilder s) {
		System.out.println("2. Total words: " + s.toString().trim().split(" ").length);
	}
	
	public static void Palindrome(StringBuilder s) {
		String original = s.toString();
		String reverse = s.reverse().toString();
		
		if (original.equals(reverse)) {
			System.out.println(original + " is a Palindrome");
		} else {
			System.out.println(original + " is not a Palindrome");
		}
	}
}
