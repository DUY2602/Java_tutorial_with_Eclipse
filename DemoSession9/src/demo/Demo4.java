package demo;

import entities.Address;
import entities.Student;

public class Demo4 {
	public static void main(String[] args) {
		Address address1 = new Address(1, "Thành phố Hồ Chí Minh", "Bình Thạnh", "Phường 25");
		Address address2 = new Address(2, "Thành phố Hồ Chí Minh", "Phú Nhuận", "Phường 20");
		Address address3 = new Address(3, "Thành phố Hồ Chí Minh", "Thủ Đức", "Phường 30");
		
		Student student1 = new Student(1, "Student 1", 8.9, address1);
		Student student2 = new Student(2, "Student 2", 5.7, address1);
		Student student3 = new Student(3, "Student 3", 9.0, address2);
		Student student4 = new Student(4, "Student 4", 5.6, address3);
		Student student5 = new Student(5, "Student 5", 9.6, new Address(4, "Đồng Nai", "Biên Hòa", "Trảng Dài"));
		System.out.println("--- Student 1 info ---");
		System.out.println(student1.toString());
		System.out.println("--- Student 2 info ---");
		System.out.println(student2.toString());
		System.out.println("--- Student 3 info ---");
		System.out.println(student3.toString());
		System.out.println("--- Student 4 info ---");
		System.out.println(student4);
		
	}
}
