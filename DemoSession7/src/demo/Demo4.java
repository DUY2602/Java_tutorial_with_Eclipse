package demo;

import entities.Product;

public class Demo4 {
	public static void main(String[] args) {
		Product product = new Product();
		
		Product product2 = new Product(2, "Product 2", 2.5, 20);
		System.out.println("=====Product 2 Info=====");
		System.out.println("ID: " + product2.getId());
		System.out.println("Name: " + product2.getName());
		System.out.println("Price: " + product2.getPrice());
		System.out.println("Quantity: " + product2.getQuantity());
	}
}
