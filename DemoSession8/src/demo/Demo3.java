package demo;

import java.text.SimpleDateFormat;

import entities.Product;

public class Demo3 {
	public static void main(String[] args) {
		try {
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
			Product product4 = new Product(4, "Product 4", 8.5, 10, simpleDateFormat.parse("20/10/2025"), true);
			Product[] products = {
					new Product(1, "Product 1", 8.5, 10, simpleDateFormat.parse("20/10/2025"), true),
					new Product(2, "Product 2", 8.5, 10, simpleDateFormat.parse("20/10/2025"), true),
					new Product(3, "Product 3", 8.5, 10, simpleDateFormat.parse("20/10/2025"), true),
					product4
			};
			for (Product product : products) {
				System.out.println(product.toString());
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
