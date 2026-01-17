package entities;

public class Square extends Shape implements IShape{

	private double a;
	
	
	public Square(String name) {
		super(name);
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
	public double perimeter() {
		return 4 * this.a;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return this.a * this.a;
	}

	@Override
	public void print() {
		System.out.println("Name: " + this.getName());
		System.out.println("a: " + this.a);
		System.out.println("Perimeter: " + this.perimeter());
		System.out.println("Area: " + this.area());
	}

}
