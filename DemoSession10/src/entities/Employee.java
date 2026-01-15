package entities;

import java.util.Scanner;

public class Employee extends Human{
	private String id;
	private double salary;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Employee(String id, double salary) {
		super();
		this.id = id;
		this.salary = salary;
	}
	public Employee() {
		super();
	}
	public Employee(String name, String gender, String id, double salary) {
		super(name, gender);
		this.id = id;
		this.salary = salary;
	}
	
	public void print() {
		System.out.println("ID: " + this.id);
		System.out.println("Salary: " + this.salary);
		super.print();
	}
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ID: ");
		this.id = sc.nextLine();
		
		System.out.println("Salary: ");
		this.salary = sc.nextDouble();
		
		super.input();	
	}
}
