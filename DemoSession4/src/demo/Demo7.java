package demo;

import java.util.Scanner;

public class Demo7 {
	public static void main(String[] args) {
		arrayInput();
	}
	
	public static void arrayInput() {
		System.out.print("Enter the length of the array: ");
		
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		
		int[] a = new int[length];
		for (int i = 0; i < length; i++) {
			System.out.print("Enter the value for index " + i + ": ");
			a[i] = sc.nextInt();
		}
		
		int min = a[0];
		for(int i = 0; i < length; i++) {
			if (a[i] < min) {
				min = a[i];
			}
		}
		
		int max = a[0];
		for(int i = 0; i < length; i++) {
			if (a[i] > min) {
				max = a[i];
			}
		}
		
		int sum = 0;
		for(int num : a) {
			sum += num;
		}
		
		double average = sum / length;
		
		int count_negative = 0;
		for (int num : a) {
			if (num < 0) {
				count_negative += 1;
			}
		}
		
		System.out.println("Enter a number to check: ");
		int prompt = sc.nextInt();
		int count_appearance = 0;
		boolean in = false;
		for (int num : a) {
			if (num == prompt) {
				in = true;
				count_appearance += 1;
			}
		}
		
		int count_primenumbers = 0;
		String prime_numbers = "";
		for(int num : a) {
			if (num > 0) {
				boolean isPrime = true;
				for (int j = 2; j < num; j++) {
					if ((num > j) && (num % j == 0)) {
						isPrime = false;
					}
				}
				if (isPrime) {
					count_primenumbers += 1;
					prime_numbers += String.valueOf(num) + " ";
				}
			}
		}
		
		
		
		System.out.println("Min of array: " + min);
		System.out.println("Max of array: " + max);
		System.out.println("Sum: " + sum);
		System.out.println("Average: " + average);
		System.out.println("There are " + count_negative + " negative numbers");
		
		if (in == true) {
			System.out.println(prompt + " is in the array and it appears " + count_appearance + " times");
		} else {
			System.out.println(prompt + " is not in the array");
		}
		
		if (prime_numbers.trim() != "") {
			System.out.println("There are " + count_primenumbers + " prime numbers: " + prime_numbers);
		} else {
			System.out.println("There are no prime numbers in the array");
		}
		
		// Sort giảm dần
	}
}
