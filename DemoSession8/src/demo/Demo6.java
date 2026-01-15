package demo;

import java.util.ArrayList;
import java.util.List;

public class Demo6 {
	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		names.add("name 1"); // 0
		names.add("name 2");// 1
		names.add("name 3");// 2
		names.add("name 4");// 3
		names.add("name 5");// 4
		// lay ra so phan tu trong danh sach
		System.out.println("so phan tu: " + names.size());
		// xem phan tu thu 3 trong danh sach
		System.out.println("phan tu thu 3: " + names.get(3));
		// in danh sach ra 
		System.out.println("Danh sach");
		for (String name : names) {
			System.out.print(name + "\t");
		}
		// xoa phan tu cuoi cung cua danh sach nhung ko gan cung
		int lastElementIndex = names.size() - 1;
		names.remove(lastElementIndex);
		System.out.println("\nDanh sach sau khi xoa phan tu cuoi cung");
		for (String name : names) {
			System.out.print(name + "\t");
		}
		// thuc hien xoa het cac phan tu cua danh sach
		names.clear();
	}
}
