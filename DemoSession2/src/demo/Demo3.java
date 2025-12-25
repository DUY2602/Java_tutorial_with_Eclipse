package demo;

public class Demo3 {
	public static void main(String[] args) {
		// Ex: Print from 1 -> 5
		for(int i = 1; i <= 5; i++) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		//Ex: Print even numbers 2 - 10
		for(int i = 2; i <= 10; i += 2) {
			System.out.print(i + " ");
		}
		
		// Ex: Sum from 1 --> 10
		int sum = 0;
		for(int i = 1; i <= 10; i++) {
			sum += i;
		}
		System.out.println("\nSum: " + sum);
		
		// Ex: Multiplication table from 2 - 9
		for(int i = 2; i <= 9; i++) {
			System.out.println("\nMultiplication table of " + i);
			for(int j = 1; j <= 10; j++) {
				System.out.println(i + " x " + j + " = " + i*j);
			}
		}
	}
}
