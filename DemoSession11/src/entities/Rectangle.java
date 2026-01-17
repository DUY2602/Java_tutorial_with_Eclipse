package entities;

public class Rectangle extends Shape implements IShape{
	
	private double a;
	private double b;
	
	
	
	public Rectangle(String name) {
		super(name);
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
	public double perimeter() {
		// TODO Auto-generated method stub
		return (this.a + this.b) * 2;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return this.a * this.b;
	}

	@Override
	public void print() {
		System.out.println("Name: " + this.getName());
		System.out.println("a: " + this.a);
		System.out.println("b: " + this.b);
		System.out.println("Perimeter: " + this.perimeter());
		System.out.println("Area: " + this.area());
	}
}
