package demo;


import java.util.List;

import entities.Product;
import models.ProductModel;

public class Demo11 {
	public static void main(String[] args) {
		ProductModel productModel = new ProductModel();
		List<Product> sort1 = productModel.sort1();
		for (Product product : sort1) {
			System.out.println(product);
		}
		System.out.println("-------------");
		List<Product> sort2 = productModel.sort2(true);
		for (Product product : sort2) {
			System.out.println(product);
		}
		
	}
}
