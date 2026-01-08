package demo;

import entities.Product;

public class Demo3 {
	public static void main(String[] args) {
		Product product = new Product();
		product.setId(1);
		product.setName("Product 1");
		product.setPrice(5);
		product.setQuantity(100);
		
		System.out.println("=====Product 1 Info=====");
		System.out.println("ID: " + product.getId());
		System.out.println("Name: " + product.getName());
		System.out.println("Price: " + product.getPrice());
		System.out.println("Quantity: " + product.getQuantity());

		System.out.println("\n\n");
		
		Product product2 = new Product();
		product2.setId(2);
		product2.setName("Product 2");
		product2.setPrice(7.5);
		product2.setQuantity(20);
		
		System.out.println("=====Product 2 Info=====");
		System.out.println("ID: " + product2.getId());
		System.out.println("Name: " + product2.getName());
		System.out.println("Price: " + product2.getPrice());
		System.out.println("Quantity: " + product2.getQuantity());
	}
}
