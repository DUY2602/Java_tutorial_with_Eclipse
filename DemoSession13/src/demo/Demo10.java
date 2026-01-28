package demo;


import entities.Product;
import models.ProductModel;

public class Demo10 {
	public static void main(String[] args) {
		ProductModel productModel = new ProductModel();
		Product product = productModel.findByID(20);
		if(product == null) {
			System.out.println("not found");
		} else {
			System.out.println(product.toString());
		}
	}
}
