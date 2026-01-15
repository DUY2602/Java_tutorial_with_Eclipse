package entities;

import java.util.Scanner;

public abstract class Shape {
	private String name;
	
	
	
	public Shape() {
	}
	public Shape(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public abstract void Perimeter();
	public abstract void Area();
	
	public void Input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Shape: ");
		this.name = sc.nextLine();
	}
}
