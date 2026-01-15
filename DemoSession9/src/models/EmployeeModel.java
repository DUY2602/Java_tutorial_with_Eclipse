package models;

import java.util.ArrayList;
import java.util.List;

import entities.Department;
import entities.Employee;

public class EmployeeModel {
	public List<Employee> findAll(){
		List<Employee> employees = new ArrayList<Employee>();
		
		Department d1 = new Department(1, "Kế toán");
		Department d2 = new Department(2, "IT");
		Department d3 = new Department(3, "Nhân sự");
		employees.add(new Employee(1, "Employee 1", 100, d1));
		employees.add(new Employee(2, "Employee 2", 120, d2));
		employees.add(new Employee(3, "Employee 3", 150, d3));
		employees.add(new Employee(4, "Employee 4", 200, d2));
		return employees;
	}
}
