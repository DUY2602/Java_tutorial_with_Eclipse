package demo;

import java.util.Iterator;
import java.util.Scanner;

import entities.Rectangle;
import entities.Shape;
import entities.Square;

public class Demo7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of shapes: ");
		int n = sc.nextInt();
		
		Shape[] shapes = new Shape[n];
		
		for(int i = 0; i < shapes.length; i++) {
			System.out.println("\n=====Shape menu=====");
			System.out.println("1. Square");
			System.out.println("2. Rectangle");
			System.out.println("Enter choice: ");
			int type = sc.nextInt();
			if (type == 1) {
				Square square = new Square();
				square.Input();
				shapes[i] = square;
			} else if (type == 2) {
				Rectangle rectangle = new Rectangle();
				rectangle.Input();
				shapes[i] = rectangle;
			}
		}
		
		for (Shape shape : shapes) {
			System.out.println("Name: " + shape.getName());
			shape.Perimeter();
			shape.Area();
		}
	}
}
