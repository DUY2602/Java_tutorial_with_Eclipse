package entities;

import java.util.Scanner;

public class Square extends Shape {

	private double a;
	
	public Square() {
		super();
	}

	public Square(String name, double a) {
		super(name);
		this.a = a;
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	@Override
	public void Perimeter() {
		System.out.println("Perimeter: " + this.a + "x4"  + "=" + 4*this.a);
	}

	@Override
	public void Area() {
		System.out.println("Area: " + this.a + "*" + this.a + "=" + this.a*this.a);
	}
	
	public void Input() {
		super.Input();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input a: ");
		this.a = sc.nextDouble();
	}

}
