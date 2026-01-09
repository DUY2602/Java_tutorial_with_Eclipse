package demo;

import java.util.Scanner;

import entities.Product;

public class Demo6 {
	public static void main(String[] args) {
		Product p1 = new Product(1, "TV", 2.3, 1);
		Product p2 = new Product(2, "Iphone", 4.5, 5);
		Product p3 = new Product(3, "Laptop", 6, 3);

		p1.total();
		p2.total();
		p3.total();
		
		Product p4 = new Product();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ID: ");
		p4.setId(sc.nextInt());
		
		sc.nextLine();
		
		System.out.print("Name: ");
		p4.setName(sc.nextLine());
		
		System.out.print("Price: ");
		p4.setPrice(sc.nextDouble());
		
		System.out.print("Quantity: ");
		p4.setQuantity(sc.nextInt());
		
		p4.printInfo();
	}
}
