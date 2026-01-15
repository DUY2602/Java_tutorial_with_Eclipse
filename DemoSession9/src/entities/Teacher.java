package entities;

import java.util.ArrayList;
import java.util.List;

public class Teacher {
	private int id;
	private String name;
	private double salary;
	private List<Course> courses = new ArrayList<Course>();
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public List<Course> getCourses() {
		return courses;
	}
	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}
	public Teacher(int id, String name, double salary, List<Course> courses) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.courses = courses;
	}
	public Teacher() {
		super();
	}
	@Override
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + ", salary=" + salary + ", courses=" + courses + "]";
	}
	
	public void print() {
		System.out.println("id: " + this.id);
		System.out.println("name: " + this.name);
		System.out.println("salary: " + this.salary);
		for (Course course : courses) {
			System.out.println(course.toString());
		}
	}
}
