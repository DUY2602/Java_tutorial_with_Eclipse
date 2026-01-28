package demo;


import java.util.List;

import entities.Product;
import models.ProductModel;

public class Demo12 {
	public static void main(String[] args) {
		ProductModel productModel = new ProductModel();
		int sum1 = productModel.sum1();
		System.out.println("sum1: " + sum1);
		double sum2 = productModel.sum2(true);
		System.out.println("sum2: " + sum2);
		
	}
}
