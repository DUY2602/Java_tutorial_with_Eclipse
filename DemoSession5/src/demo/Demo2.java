package demo;

public class Demo2 {
	public static void main(String[] args) {
		String s = "p01,Tivi,4.5,30";
		String[] result = s.split(",");
		System.out.println("ID: " + result[0]);
		System.out.println("Name: " + result[1]);
		System.out.println("Price: " + result[2]);
		System.out.println("Quantity: " + result[3]);

	}
}
