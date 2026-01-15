package demo;

import java.util.List;

import entities.Employee;
import entities.Teacher;
import models.EmployeeModel;
import models.TeacherModel;

public class Demo7 {
	public static void main(String[] args) {
		TeacherModel teacherModel = new TeacherModel();
		List<Teacher> teachers = teacherModel.findAll();
		for (Teacher teacher : teachers) {
			teacher.print();
			System.out.println("----------------");
		}
		
		EmployeeModel employeeModel = new EmployeeModel();
		List<Employee> employees = employeeModel.findAll();
		for (Employee employee : employees) {
			System.out.println(employee.toString());
		}
	}
}
