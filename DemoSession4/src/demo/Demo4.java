package demo;

import java.util.Scanner;

public class Demo4 {
	public static void main(String[] args) {
		// Array Input
		System.out.print("Enter the length of the array: ");
		
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		
		int[] a = new int[length];
		
		for (int i = 0; i < length; i++) {
			System.out.print("Enter the value for index " + i + ": ");
			a[i] = sc.nextInt();
		}
		
		for (int i : a) {
			System.out.print(i + " ");
		}
	}
}
