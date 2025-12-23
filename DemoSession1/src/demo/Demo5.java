package demo;

import java.util.Scanner;

public class Demo5 {
	public static void main(String[] args) {
		// Imagine scanner like a memory zone
		// Scanner gets user input + \n at the end
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("age: ");
		int age = scanner.nextInt();
		System.out.println("Your Age: " + age);
		
		System.out.println("price: ");
		double price = scanner.nextDouble();
		System.out.println("Your Price: " + price);
		
		System.out.println("status: ");
		boolean status = scanner.nextBoolean();
		System.out.println("Your Status: " + status);
		
		System.out.println("key: ");
		char key = scanner.next().charAt(0);
		System.out.println("Your Key: " + key);
		
		scanner.nextLine();
		System.out.println("username: ");
		String username = scanner.nextLine();
		System.out.println("Your username: " + username);
	}
}
