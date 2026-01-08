package demo;

import entities.Employee;

public class Demo2 {
	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.id = 1;
		employee.name = "Do Duc Duy";
		employee.salary = 100;
		
		System.out.println("===Employee 1 Info===");
		System.out.println("ID: " + employee.id);
		System.out.println("Name: " + employee.name);
		System.out.println("Salary: " + employee.salary);

		System.out.println("\n\n");
		
		Employee employee2 = new Employee();
		employee2.id = 2;
		employee2.name = "Nguyen Van A";
		employee2.salary = 10;
		
		System.out.println("===Employee 2 Info===");
		System.out.println("ID: " + employee2.id);
		System.out.println("Name: " + employee2.name);
		System.out.println("Salary: " + employee2.salary);
	}
}
