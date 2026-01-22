package demo;

import java.util.List;

import entities.Product;
import models.ProductModel;

public class Demo4 {
	public static void main(String[] args) {
		ProductModel productModel = new ProductModel();
		
		Boolean status = true;
		List<Product> products = productModel.searchByStatus(status);
		
		System.out.println("Size: " + products.size());
		
		for (Product product : products) {
			System.out.println(product.toString());
		}
	}
}
