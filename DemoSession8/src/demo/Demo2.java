package demo;

import java.text.SimpleDateFormat;
import java.util.Date;

import entities.Product;

public class Demo2 {
	public static void main(String[] args) {
		try {
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
			Product[] products = new Product[4];
			Product product1 = new Product(1, "Product 1", 7.8, 20, new Date(), true);
			Product product2 = new Product(2, "Product 2", 8.5, 10, simpleDateFormat.parse("20/10/2025"), true);
			Product product3 = new Product(3, "Product 3", 3.2, 50, simpleDateFormat.parse("15/02/2023"), true);
			Product product4 = new Product(4, "Product 4", 3.2, 50, simpleDateFormat.parse("15/02/2023"), true);
			products[0] = product1;
			products[1] = product2;
			products[2] = product3;
			products[3] = product4;
			System.out.println("--- List product for index ---");
			for(int i = 0; i < products.length; i++) {
				System.out.println(products[i].toString());
			}
			System.out.println("--- List product foreach ---");
			for (Product product : products) {
				System.out.println(product.toString());
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
