package demo;

import java.util.List;

import entities.Product;
import models.ProductModel;

public class Demo6 {
	public static void main(String[] args) {
		ProductModel productModel = new ProductModel();
		List<Product> products = productModel.searchByKeyword("ti");
		for (Product product : products) {
			System.out.println(product);
		}
	}
}
