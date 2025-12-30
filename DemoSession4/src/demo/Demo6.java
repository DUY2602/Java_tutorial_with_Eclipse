package demo;

import java.util.Scanner;

public class Demo6 {
	public static void main(String[] args) {
		String[] a = arrayInput();
		arrayOutput(a);
	}
	
	public static String[] arrayInput() {
		System.out.print("Enter the length of the array: ");
		
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		
		sc.nextLine();
		
		String[] a = new String[length];
		for (int i = 0; i < length; i++) {
			System.out.print("Enter the value for index " + i + ": ");
			a[i] = sc.nextLine();
			
		}
		
		return a;
	}
	
	public static void arrayOutput(String[] a) {
		for (String i : a) {
			System.out.print(i + " ");
		}
		
	}
}
