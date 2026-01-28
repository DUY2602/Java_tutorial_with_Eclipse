package demo;


import java.util.Date;
import java.util.List;

import entities.Product;
import models.ProductModel;

public class Demo14 {
	public static void main(String[] args) {
		ProductModel productModel = new ProductModel();
		Product product = new Product();
		product.setName("New Product 1");
		product.setPrice(5.6);
		product.setQuantity(500);
		product.setDescription("ABC");
		product.setCreated(new Date());
		product.setStatus(true);
		if(productModel.create(product)) {
			System.out.println("Tao san pham thanh cong");
		} else {
			System.out.println("Tao san pham that bai");
		}
		
	}
}
