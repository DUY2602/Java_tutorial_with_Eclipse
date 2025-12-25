package demo;

public class Demo4 {
	public static void main(String[] args) {
		// While loop
		// Ex: Use while to print 1 - 5
		int i = 1;
		while(i <= 5) {
			System.out.print(i + " ");
			i++;
		}
		
		System.out.println();
		
		// Do while execute the action at least 1 time
		int j = 5;
		do {
			System.out.print(j + " ");
			j++;
		} while (j <= 5);
		
		System.out.println();
	}
}
