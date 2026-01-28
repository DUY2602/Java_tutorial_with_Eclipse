package demo;

import java.util.List;

import entities.Product;
import models.ProductModel;

public class Demo7 {
	public static void main(String[] args) {
		ProductModel productModel = new ProductModel();
		List<Product> products = productModel.searchByCreated(2026, 1, 20);
		for (Product product : products) {
			System.out.println(product);
		}
	}
}
