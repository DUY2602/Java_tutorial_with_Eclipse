package demo;

public class Demo2 {
	public static void main(String[] args) {
		// Integer array
		int[] numbers = new int[5];			// Initialize a new array (give the length)
		
		// Giving values to array
		numbers[0] = 0;
		numbers[1] = 1;
		numbers[2] = 2;
		numbers[3] = 3;
		numbers[4] = 4;
		
		System.out.println("Number[0]: " + numbers[0]);
		System.out.println("Number[1]: " + numbers[1]);
		System.out.println("Number[2]: " + numbers[2]);
		System.out.println("Number[3]: " + numbers[3]);
		System.out.println("Number[4]: " + numbers[4]);
		
		System.out.println();
		// Loop through array by index
		for(int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
		
		System.out.println("\n");
		
		// Loop through array by elements
		// The same as for(number in numbers) in Python
		for(int number : numbers) {
			System.out.print(number + " ");
		}
		
		System.out.println("\n");
		
		// Giving the values while declare a new array
		int[] array = {1, 2, 3, 4, 5};
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
}
