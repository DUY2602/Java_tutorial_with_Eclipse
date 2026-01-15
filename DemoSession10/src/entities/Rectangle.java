package entities;

import java.util.Scanner;

public class Rectangle extends Shape{
	private double a;
	private double b;
	
	
	
	public Rectangle() {
		super();
	}

	public Rectangle(String name, double a, double b) {
		super(name);
		this.a = a;
		this.b = b;
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	@Override
	public void Perimeter() {
		System.out.println("Perimeter: 2*(" + this.a + "+" + this.b + ")=" + 2*(this.a+this.b));
	}

	@Override
	public void Area() {
		System.out.println("Area: " + this.a + "*" + this.b + "=" + this.a*this.b);
	}
	
	public void Input() {
		super.Input();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input a: ");
		this.a = sc.nextDouble();
		
		System.out.println("Input b: ");
		this.b = sc.nextDouble();
	}
}
