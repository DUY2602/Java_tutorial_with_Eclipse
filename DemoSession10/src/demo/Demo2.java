package demo;

import entities.Employee;
import entities.Student;

public class Demo2 {
	public static void main(String[] args) {
		Student student = new Student("Student 1", "Female", "St02", 8.7);
		student.print();
		
		Employee employee = new Employee("Employee 1", "Male", "em2", 64.8);
		employee.print();
	}
}
