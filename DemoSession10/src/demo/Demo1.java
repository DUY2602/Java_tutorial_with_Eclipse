package demo;

import entities.Employee;
import entities.Student;

public class Demo1 {
	public static void main(String[] args) {
		Student student = new Student();
		
		student.setName("Student 1");
		student.setGender("Male");
		
		student.setId("st01");
		student.setScore(10);
		
		System.out.println("=====Student Info=====");
		System.out.println("ID: " + student.getId());
		System.out.println("Name: " + student.getName());
		System.out.println("Gender: " + student.getGender());
		System.out.println("Score: " + student.getScore());
		
		
		System.out.println("\n\n");
		
		Employee employee = new Employee();
		
		employee.setId("st01");
		employee.setSalary(78.5);
		
		System.out.println("=====Employee Info=====");
		System.out.println("ID: " + employee.getId());
		System.out.println("Salary: " + employee.getSalary());
		
		
		
		Student student2 = new Student("Student 2", "Female", "St02", 8.7);
		System.out.println("=====Student 2 Info=====");
		System.out.println("ID: " + student.getId());
		System.out.println("Name: " + student.getName());
		System.out.println("Gender: " + student.getGender());
		System.out.println("Score: " + student.getScore());
		
		Employee employee2 = new Employee("Employee 2", "Male", "em2", 64.8);
	}
}
