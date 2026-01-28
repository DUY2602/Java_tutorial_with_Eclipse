package demo;


import java.util.Date;
import java.util.List;

import entities.Product;
import models.ProductModel;

public class Demo16 {
	public static void main(String[] args) {
		ProductModel productModel = new ProductModel();
		Product product = productModel.findByID(7);
		product.setName("New product name");
		product.setPrice(100);
		product.setStatus(true);
		if(productModel.update(product)) {
			System.out.println("Sua san pham thanh cong");
		} else {
			System.out.println("Sua san pham that bai");
		}
		
	}
}
