package demo;

import entities.Rectangle;
import entities.IShape;
import entities.Square;

public class Demo2 {
	public static void main(String[] args) {
		Square square1 = new Square("Square 1", 6);
		Rectangle rectangle1 = new Rectangle("Rectangle", 5, 10);
		
		print(square1);
		System.out.println("\n\n");
		print(rectangle1);
	}
	
	private static void print(IShape shape) {
		shape.print();
	}
}
