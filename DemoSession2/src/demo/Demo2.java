package demo;

import java.util.Scanner;

public class Demo2 {
	public static void main(String[] args) {
		int age = 22;
		if (age >= 18) {
			System.out.println("You're mature");
		} else {
			System.out.println("You're immature");
		}
		
		int number = 5;
		if (number % 2 == 0) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}
		
		grade();
	}
	
	public static void grade() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter your score: ");
		int score = scanner.nextInt();
		
		if (score >= 85) {
			System.out.println("Excellent");
		} else if (score >= 65) {
			System.out.println("Good");
		} else if (score >= 50) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
		
	}
}
