package entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Student {
	private int id;
	private String name;
	private int age;
	private double math;
	private double physics;
	private double chemistry;
	private Date dob;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getMath() {
		return math;
	}
	public void setMath(double math) {
		this.math = math;
	}
	public double getPhysics() {
		return physics;
	}
	public void setPhysics(double physics) {
		this.physics = physics;
	}
	public double getChemistry() {
		return chemistry;
	}
	public void setChemistry(double chemistry) {
		this.chemistry = chemistry;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public Student(int id, String name, int age, double math, double physics, double chemistry, Date dob) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.math = math;
		this.physics = physics;
		this.chemistry = chemistry;
		this.dob = dob;
	}
	public Student() {
		super();
	}
	
	public void input() {
		try {
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
			Scanner sc = new Scanner(System.in);
			System.out.print("id: ");
			this.id = sc.nextInt();
			sc.nextLine();
			System.out.print("name: ");
			this.name = sc.nextLine();
			System.out.print("age: ");
			this.age = sc.nextInt();
			System.out.print("math: ");
			this.math = sc.nextDouble();
			System.out.print("physics: ");
			this.physics = sc.nextDouble();
			System.out.print("chemistry: ");
			this.chemistry = sc.nextDouble();
			sc.nextLine();
			System.out.print("dob (dd/MM/yyyy): ");
			String s = sc.nextLine();
			this.dob = simpleDateFormat.parse(s);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	public void print() {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("id: " + this.id);
		System.out.println("name: " + this.name);
		System.out.println("age: " + this.age);
		System.out.println("math: " + this.math);
		System.out.println("physics: " + this.physics);
		System.out.println("chemistry: " + this.chemistry);
		System.out.println("dob: " + simpleDateFormat.format(this.dob));
	}
	
	@Override
	public String toString() {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", math=" + math + ", physics=" + physics
				+ ", chemistry=" + chemistry + ", dob=" + simpleDateFormat.format(dob) + "]";
	}
	
	
}
