package demo;

public class Demo5 {
	public static void main(String[] args) {
		
		// break: stop the loop
		// continue: skip a loop
		// return: give out the result + stop executing function or loop
		
		System.out.println("Numbers from 1 to 5");
		for(int i = 1; i <= 10; i++) {
			System.out.print(i + " ");
			if (i == 5) {
				break;
			}
		}
		
		System.out.println();
		for(int i = 1; i <= 10; i++) {
			if (i == 5) {
				continue;
			}
			System.out.print(i + " ");
		}
		
		sayHello(18);
	}
	
	public static void sayHello(int age) {
		if (age < 18) {
			return;
		};
		System.out.println("Welcome");
	}
}
