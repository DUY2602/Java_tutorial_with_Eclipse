package demo;

import entities.Employee;
import entities.Student;

public class Demo3 {
	public static void main(String[] args) {
		Student student1 = new Student();
		student1.input();
		student1.print();
		
		Employee employee1 = new Employee();
		employee1.input();
		employee1.print();
	}
}
