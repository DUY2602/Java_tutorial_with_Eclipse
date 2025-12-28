package demo;

public class Demo2 {
	public static void main(String[] args) {
		
		// Error handling: try, catch, finnaly in Java
		
//		int result = 10 / 0;
//		System.out.println(result);			
//		
//		String text = null;
//		System.out.println(text.length());			// Error java.lang.NullPointerException: null value
		
		try {
			int result = 10 / 0;				// Error java.lang.ArithmeticException: 0 division
			System.out.println(result);
		} 
		catch (Exception e) {
			e.printStackTrace(); 			// Get the specific error
			System.out.println("Try catch helps maintain program while error");
		}
		
		System.out.println("\n-----------------------------------------\n");
		
		try {
			String text = null;
			System.out.println(text.length());			// Error java.lang.NullPointerException: null value
			
		} 
		catch (Exception e) {
			e.printStackTrace();
			System.out.println("Try catch helps maintain program while error");
		}
		finally {					// Always run
			System.out.println("The program is still executing");
		}
	}
}
