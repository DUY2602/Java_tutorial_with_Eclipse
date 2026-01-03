package demo;

import java.util.Scanner;

public class Demo7 {
	/*
	 * Create a program
	 * 1. Prompt user for an array of integer (both the length and value)
	 * 2. Find max, min value
	 * 3. Calculate sum of values
	 * 4. Calculate the average of positive values
	 * 5. Count how many negative values
	 * 6. Prompt user for an integer to check if it's in the array (if yes then  count the appearance)
	 * 7. List all the prime numbers in the array
	 * 8. Sort ascending (bubble sort)
	 * 9. Sort descending (bubble sort)
	 * */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String key = "";
		int[] a = arrayInput();
		
		do {
			System.out.println("========Function Menu========");
			System.out.println("1. Find max, min value");
			System.out.println("2. Calculate sum values");
			System.out.println("3. Calcualte average positive values");
			System.out.println("4. Count how many negative values");
			System.out.println("5. Check if integer is in array");
			System.out.println("6. List all prime numbers");
			System.out.println("7. Sort ascending");
			System.out.println("8. Sort Descendinng");
			
			System.out.print("Enter your choice: ");
			int choice = sc.nextInt();
			
			switch (choice) {
				case 1:
					minMax(a);
					break;
					
				case 2:
					sum(a);
					break;

				case 3:
					average(a);
					break;

				case 4:
					countNeg(a);
					break;

				case 5:
					checkAppearance(a);
					break;

				case 6:
					primeNum(a);
					break;

				case 7:
					bubbleSortASC(a);
					break;

				case 8:
					bubbleSortDESC(a);
					break;

				default:
					System.out.println("Invalid choice !!!");
					break;

			}
			sc.nextLine();
			System.out.print("Do yo want to continue (Y/y): ");
			key = sc.nextLine();
			
		} while(key.equalsIgnoreCase("y"));
	}
	
	public static int[] arrayInput() {
		System.out.print("Enter the length of the array: ");
		
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		
		int[] a = new int[length];
		for (int i = 0; i < length; i++) {
			System.out.print("Enter the value for index " + i + ": ");
			a[i] = sc.nextInt();
		}
		return a;
	}
	
	public static void minMax(int[] a) {
		int min = a[0];
		for(int i = 0; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];
			}
		}
		
		int max = a[0];
		for(int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		
		System.out.println("Min of array: " + min);
		System.out.println("Max of array: " + max);
	}
		
	public static void sum(int[] a) {
		int sum = 0;
		for(int num : a) {
			sum += num;
		}
		
		System.out.println("Sum: " + sum);
	}
	
	public static void average(int[] a) {
		int sum = 0;
		int count = 0;
		for(int num : a) {
			if(num > 0) {
				sum += num;
				count += 1;
			}
		}
		
		double average = sum / count;
		System.out.println("Average: " + average);

	}
	
	public static void countNeg(int[] a) {
		int count_negative = 0;
		for (int num : a) {
			if (num < 0) {
				count_negative += 1;
			}
		}
		System.out.println("There are " + count_negative + " negative numbers");
	}
	
	public static void checkAppearance(int[] a) {
		Scanner sc = new Scanner(System.in);
		
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
		if (in == true) {
			System.out.println(prompt + " is in the array and it appears " + count_appearance + " times");
		} else {
			System.out.println(prompt + " is not in the array");
		}
	}
		
	public static void primeNum(int[] a) {
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
		if (prime_numbers.trim() != "") {
			System.out.println("There are " + count_primenumbers + " prime numbers: " + prime_numbers);
		} else {
			System.out.println("There are no prime numbers in the array");
		}
	}
	
		
	public static void bubbleSortASC(int[] a) {
		for (int i = 0; i < a.length - 1; i++) {
		    for (int j = 0; j < a.length - i - 1; j++) {
		        if (a[j] > a[j + 1]) {
		        	
		            int temp = a[j];
		            a[j] = a[j + 1];
		            a[j + 1] = temp;
		        }
		    }
		}
		for (int num : a) {
			System.out.print(num + " ");
		}
	}
	
	public static void bubbleSortDESC(int[] a) {
		for (int i = 0; i < a.length - 1; i++) {
		    for (int j = 0; j < a.length - i - 1; j++) {
		        if (a[j] < a[j + 1]) {
		        	
		            int temp = a[j];
		            a[j] = a[j + 1];
		            a[j + 1] = temp;
		        }
		    }
		}
		for (int num : a) {
			System.out.print(num + " ");
		}
	}
}
