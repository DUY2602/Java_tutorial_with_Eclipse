package demo;

import entities.Rectangle;
import entities.Shape;
import entities.Square;

public class Demo5 {
	/*
	 * Create abstract class Shape - with attribute name
	 * In class Shape, there are abstract classes perimeter(), area(), input()
	 * Create rectangle, square inherit Shape
	 * */
	public static void main(String[] args) {
		Shape[] shapes = {
				new Square("Square 1", 5),
				new Rectangle("Rectangle 1", 3, 4)
		};
		
		for (Shape shape : shapes) {
			System.out.println("Name: " + shape.getName());
			shape.Perimeter();
			shape.Area();
		}
	}
}
