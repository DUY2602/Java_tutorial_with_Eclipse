package demo;

import java.util.List;

import entities.Product;
import models.ProductModel;

public class Demo2 {
	public static void main(String[] args) {
		ProductModel productModel = new ProductModel();
		List<Product> products = productModel.findAll();
		
		System.out.println("Size: " + products.size());
		
		for (Product product : products) {
			System.out.println(product.toString());
		}
	}
}
