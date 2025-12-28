package demo;

import java.util.Scanner;

public class Demo1 {
	public static void main(String[] args) {
		
		// Use switch case to get the day of week
		int day = 3;
		switch(day) {
			case 1:
				System.out.println("Sunday");
				break;
			case 2:
				System.out.println("Monday");
				break;
			case 3:
				System.out.println("Tuesday");
				break;
			case 4:
				System.out.println("Wednesday");
				break;
			case 5:
				System.out.println("Thursday");
				break;
			case 6:
				System.out.println("Friday");
				break;
			case 7:
				System.out.println("Saturday");
				break;
			default:
				System.out.println("Day must be between 1 and 7");
				break;
		}
		
		countDay();
		calculator();
	}
	
	public static void countDay() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter month: ");
		int month = sc.nextInt();
		
		System.out.print("Enter year: ");
		int year = sc.nextInt();
		
		boolean isLeap = false;
		if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
			isLeap = true;
		}
		
		int day = 0;
		
		switch(month) {
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				day = 31;
				break;
				
			case 2:
				if (isLeap) {
					day = 29;
				} else {
					day = 28;
				}
				break;

			case 4: case 6: case 9: case 11:
				day = 30;
				break;
			default:
				day = 0;
				System.out.println("Error !!!");
				break;
		}
		System.out.println("The number of days: " + day);
	}
	
	public static void calculator() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter first number: ");
		int num1 = sc.nextInt();
		
		System.out.print("Enter second number: ");
		int num2 = sc.nextInt();
		
		System.out.print("Choose an operation (+ - * /): ");
		char op = sc.next().charAt(0);
		
		switch (op) {
			case '+':
				System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
				break;
				
			case '-':
				System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
				break;
				
			case '*':
				System.out.println(num1 + " x " + num2 + " = " + (num1 * num2));
				break;
				
			case '/':
				if (num2 == 0) {
					System.out.println("Error 0 division !!!");
					break;
				} else {
					System.out.println(num1 + " : " + num2 + " = " + (num1 / num2));
					break;
				}
			default:
				System.out.println("Error !!!");
				break;
		}
	}
}
