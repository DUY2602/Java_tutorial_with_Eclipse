package demo;

import entities.Product;
import models.ProductModel;

public class Demo4 {
	 public static void main(String[] args) {
		ProductModel productModel = new ProductModel();
		Product[] products = productModel.findAll();
		System.out.println("--- List 1 ---");
		for (Product product : products) {
			System.out.println(product.toString());
		}
		System.out.println("--- List 2 ---");
		for (Product product : productModel.findAll()) {
			System.out.println(product.toString());
		}
		System.out.println("--- Product 1 ---");
		Product product = productModel.findByID(1);
		System.out.println(product.toString());
		System.out.println("--- Product 2 ---");
		System.out.println(productModel.findByID(2).toString());
	}
}
