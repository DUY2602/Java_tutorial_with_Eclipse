package demo;

import entities.Product;

public class Demo6 {
	public static void main(String[] args) {
		Product p1 = new Product(1, "TV", 2.3, 1);
		Product p2 = new Product(2, "Iphone", 4.5, 5);
		Product p3 = new Product(3, "Laptop", 6, 3);

		p1.total();
		p2.total();
		p3.total();
	}
}
