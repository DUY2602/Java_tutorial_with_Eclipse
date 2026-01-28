package demo;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import entities.Product;
import models.ProductModel;

public class Demo8 {
	public static void main(String[] args) {
		try {
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
			ProductModel productModel = new ProductModel();
			List<Product> products = productModel.searchByCreated(simpleDateFormat.parse("20/01/2026"));
			for (Product product : products) {
				System.out.println(product);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
