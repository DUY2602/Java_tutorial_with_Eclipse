package demo;

public class Demo1 {
	// Wrapper class
	// int => Integer
	// double => Double
	// boolean => Boolean
	
	public static void main(String[] args) {
		String a = "5";
		int n1 = Integer.parseInt(a);
		
		String b = "4.5";
		double n2 = Double.parseDouble(b);
		
		String c = "true";
		boolean status = Boolean.parseBoolean(c);
		
		int n3 = 6;
		String d = String.valueOf(n3);
		
		double n4 = 7.6;
		String e = String.valueOf(n4);
		
		boolean status1 = false;
		String f = String.valueOf(status1);
	}
}
