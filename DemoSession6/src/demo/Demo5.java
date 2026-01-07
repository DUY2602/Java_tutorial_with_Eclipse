package demo;

public class Demo5 {
	public static void main(String[] args) {
		String s = "123";
		if(isValid(s)) {
			System.out.println("Valid");
		} else {
			System.out.println("Invalid");
		}
		
		say();
		try {
			talk();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static boolean isValid(String s) {
		try {
			Double.parseDouble(s);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public static void say() {
		try {
			hi();
			bye();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public static void talk() throws Exception{
		hi();
		bye();
	}
	
	public static void hi() throws IllegalArgumentException{
		System.out.println("Hi");
	}
	
	public static void bye() throws NullPointerException{
		System.out.println("Bye");
	}
}
