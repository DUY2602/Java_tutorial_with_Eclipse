package demo;

import java.util.Scanner;

// Exercise 2: Program that calculates perimeter and area of input rectangle
// Exercise 3: Average score: (Math*2 + Physics*2 + Chemistry) / 5
// Exercise 4: Addition of 2 fractions

public class Demo7 {
	public static void rectangle() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter length: ");
		double length = scanner.nextDouble();
		
		System.out.print("Enter width: ");
		double width = scanner.nextDouble();
		
		double perimeter = (length + width) * 2;
		double area = length * width;
		
		System.out.println("Perimeter: " + perimeter);
		System.out.println("Area: " + area);
	}
	
	public static void average() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter Math score: ");
		double math = scanner.nextDouble();
		
		System.out.print("Enter Physics score: ");
		double physics = scanner.nextDouble();
		
		System.out.print("Enter Chemistry score: ");
		double chemistry = scanner.nextDouble();
		
		double average = (math*2 + physics*2 + chemistry) / 5;
		System.out.println("Average score: " + average);
		
	}
	
	public static void addFraction() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter numerator of Fraction 1: ");
		int num1 = scanner.nextInt();
		
		System.out.println("Enter denominator of Fraction 1: ");
		int den1 = scanner.nextInt();
		
		System.out.println("Enter numerator of Fraction 2: ");
		int num2 = scanner.nextInt();
		
		System.out.println("Enter denominator of Fraction 2: ");
		int den2 = scanner.nextInt();
		
		int result_num = (num1 * den2) + (num2 * den1);
		int result_den = den1 * den2;
		System.out.println(result_num + "/" + result_den);
		
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			System.out.println("========Functions Menu========");
			System.out.println("1. Perimeter & Area rectangle");
			System.out.println("2. Calculate average score");
			System.out.println("3. Adding Fractions");
			System.out.println("0. Stop the program");
			
			int choice = scanner.nextInt();
			
			if (choice == 0) {
				System.out.println("Stop executing program");
				break;
			}
			
			switch(choice) {
				case 1:
					rectangle();
					break;
				case 2:
					average();
					break;
				case 3:
					addFraction();
					break;
				default:
					System.out.println("Invalid choice");
					break;
			}
		}
	}
}
