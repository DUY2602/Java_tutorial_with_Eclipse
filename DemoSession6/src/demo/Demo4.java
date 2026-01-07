package demo;

public class Demo4 {
	public static void main(String[] args) {
		example1();
		System.out.println("\n=================\n");
		
		example2();
		System.out.println("\n=================\n");
		
		example3();
		System.out.println("\n=================\n");
		
		try {
			checkAge(14);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Program still executing");
		System.out.println("\n=================\n");

		try {
			hello();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void example1() {
		try {
			int a = 10 / 0;
			System.out.println(a);
			
			String s = null;
			System.out.println(s);
		} catch (ArithmeticException e) {
			System.out.println("Can't divide by 0");
		} catch (Exception e) {
			System.out.println("Error in calculation");
		}
		
		System.out.println("The program can continue executing");
		
	}
	
	public static void example2() {
		try {
			int[] arr = new int[3];
			System.out.println(arr[5]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array out of index");
		} catch (ArithmeticException e) {
			System.out.println("Can't divide by 0");
		} catch (Exception e) {
			System.out.println("Error in calculation");
		}
	}
	
	public static void example3() {
		try {
			int x = 10 / 2;
			System.out.println(x);
		} catch (Exception e) {
			System.out.println("Error !!!");
		} finally {
			System.out.println("Always execute finally");
		}
	}
	
	public static void checkAge(int age) {
		// Create a custom error
		if(age < 18) {
			throw new IllegalArgumentException("Age must be 18 or above");
		}
		System.out.println("Welcome !!!");
	}
	
	public static void hello() throws Exception {
		System.out.println("Thorws an error");
	}
}
