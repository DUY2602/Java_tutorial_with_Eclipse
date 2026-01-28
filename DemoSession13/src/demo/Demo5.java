package demo;

import java.util.List;

import entities.Product;
import models.ProductModel;

public class Demo5 {
	public static void main(String[] args) {
		ProductModel productModel = new ProductModel();
		List<Product> products = productModel.searchByPrice(4, 7);
		for (Product product : products) {
			System.out.println(product);
		}
	}
}
