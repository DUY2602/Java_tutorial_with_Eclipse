package demo;

public class Demo3 {
	public static void main(String[] args) {
		// String array
		String[] fruits = {"Banana", "Apple", "Orange", "Grape"};
		
		for(int i = 0; i < fruits.length; i++) {
			System.out.print(fruits[i] + " ");
		}
		
		System.out.println("\n");
		
		for(String fruit : fruits) {
			System.out.print(fruit + " ");
		}
	}
}
