package demo;

import entities.Course;
import entities.Department;
import entities.Employee;
import entities.Teacher;

public class Demo6 {
	public static void main(String[] args) {
		Teacher teacher = new Teacher();
		teacher.setId(1);
		teacher.setName("Teacher 1");
		teacher.setSalary(100);
		teacher.getCourses().add(new Course(1, "Toán"));
		teacher.getCourses().add(new Course(2, "Hóa"));
		teacher.getCourses().add(new Course(3, "Lý"));
		teacher.print();
		System.out.println("Employee 1 info");
		Employee e1 = new Employee(1, "Employee1", 89, new Department(1, "Kế toán"));
		System.out.println(e1.toString());
		System.out.println("Employee 2 info");
		Department d1 = new Department(2, "IT");
		Employee e2 = new Employee(2, "Employee2", 200, d1);
		System.out.println(e2);
		
	}
}
