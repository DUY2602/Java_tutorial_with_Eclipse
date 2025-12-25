package demo;

public class Demo1 {
	
	// Can create another function then call out in main()
	public static void main(String[] args) {
			hello();
			greet("duydo");
			System.out.println(add(2, 3));
			System.out.println(mul(2.5, 3.5));
			System.out.println(checkLogin("duydo", "12345"));
			System.out.println(checkLogin("duy", "123"));
	}
	
	public static void hello() {
		System.out.println("Hello, World!");
	}
	
	public static void greet(String name) {
		System.out.println("Welcome, " + name);
	}
	
	// Int function must return type int
	public static int add(int a, int b) {
		return a + b;
	}
	
	public static double mul(double a, double b) {
		return a * b;
	}
	
	public static boolean checkLogin(String username, String password) {
		if(username.equals("duydo") && password.equals("12345")) {
			return true;
		}
		
		return false;
	}
}
