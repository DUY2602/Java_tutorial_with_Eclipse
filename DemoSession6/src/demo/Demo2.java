package demo;

public class Demo2 {
	public static void main(String[] args) {
		Demo2 demo2 = new Demo2();
		int sum = demo2.sum(2, 3);
		System.out.println("Sum: " + sum);
		
		int sum2 = new Demo2().sum(2, 3);
		System.out.println("Sum: " + sum2);
	}
	
	public int sum(int a, int b) {
		return a + b;
	}
}
