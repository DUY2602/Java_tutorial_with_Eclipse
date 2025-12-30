package demo;

import java.util.Scanner;

public class Demo5 {
	public static void main(String[] args) {
		int[] a = arrayInput();
		arrayOutput(a);
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
	
	public static void arrayOutput(int[] a) {
		for (int i : a) {
			System.out.print(i + " ");
		}
		
	}
}
