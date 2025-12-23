package demo;

import java.util.Scanner;

// Exercise 1: Create a basic info inputting program for a product
public class Demo6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter id: ");
		int id = scanner.nextInt();
		
		scanner.nextLine();
		
		System.out.println("Enter name: ");
		String name = scanner.nextLine();
		
		System.out.println("Enter price: ");
		double price = scanner.nextDouble();
		
		System.out.println("Enter quantity: ");
		int quantity = scanner.nextInt();
		
		scanner.nextLine();
		
		System.out.println("Enter created date: ");
		String date = scanner.nextLine();
		
		
		System.out.println("Enter photo: ");
		String photo  = scanner.nextLine();
		
		System.out.println("Enter status: ");
		boolean status = scanner.nextBoolean();

		
		System.out.println("ID: " + id);
		System.out.println("Name: " + name);
		System.out.println("Price: " + price);
		System.out.println("Quantity: " + quantity);
		System.out.println("Created: " + date);
		System.out.println("Photo: " + photo);
		System.out.println("Status: " + status);
	}
}
