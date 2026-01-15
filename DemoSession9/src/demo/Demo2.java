package demo;

import java.util.HashSet;
import java.util.Set;

public class Demo2 {
	// Set (collection trong java), cho phép lưu trữ phần tử không trùng lặp
	public static void main(String[] args) {
		Set<Integer> numbers = new HashSet<Integer>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(10);
		numbers.add(-5);
		numbers.add(2);
		numbers.add(10);
		numbers.add(10);
		System.out.println("size: " + numbers.size());
		for (Integer number : numbers) {
			System.out.println(number);
		}
	}
}
