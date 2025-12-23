package demo;

import java.util.Scanner;

public class Demo5 {
	public static void main(String[] args) {
		// Imagine scanner like a memory zone
		// Scanner gets user input + \n at the end
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("age: ");
		int age = scanner.nextInt();					// nextInt for integer
		System.out.println("Your Age: " + age);
		
		System.out.println("price: ");
		double price = scanner.nextDouble();			// nextDouble for double
		System.out.println("Your Price: " + price);
		
		System.out.println("status: ");
		boolean status = scanner.nextBoolean();			// nextBoolean for boolean
		System.out.println("Your Status: " + status);
		
		System.out.println("key: ");
		char key = scanner.next().charAt(0);			// next().charAt() for keyword (character)
		System.out.println("Your Key: " + key);
		
		// key only takes 1 character from the scanner so it still remains \n
		scanner.nextLine(); 
		// reset the scanner to delete \n for next string prompt
		
		System.out.println("username: ");
		String username = scanner.nextLine();				// nextLine for string
		System.out.println("Your username: " + username);
	}
}
