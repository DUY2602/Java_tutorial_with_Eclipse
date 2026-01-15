package demo;

import java.util.ArrayList;
import java.util.List;

public class Demo5 {
	public static void main(String[] args) {
		// khai bao ra danh kieu so nguyen
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(60); // index = 0;
		numbers.add(-5);
		numbers.add(20);
		numbers.add(11);
		numbers.add(-30);
		numbers.add(25);
		System.out.println("Size: " + numbers.size()); // lay ra so phan tu cua danh sach
		System.out.println("Phan tu o vi tri thu 2: " + numbers.get(2)); // lay ra phan tu theo index
		System.out.println("Phan tu o vi tri thu 4: " + numbers.get(4));
		for (Integer number : numbers) {
			System.out.print(number + " ");
		}
		numbers.remove(0); // xoa phan tu dau tien
		System.out.println("\nSau khi xoa phan tu dau tien");
		for (Integer number : numbers) {
			System.out.print(number + " ");
		}
		numbers.clear(); // xoa tat ca cac phan tu 
		System.out.println("\nSau khi xoa tat ca phan tu");
		for (Integer number : numbers) {
			System.out.print(number + " ");
		}
		
		boolean isEmpty = numbers.isEmpty();
		System.out.println(isEmpty);
	}
}
