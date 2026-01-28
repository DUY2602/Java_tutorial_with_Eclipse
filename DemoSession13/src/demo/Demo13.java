package demo;


import java.util.List;

import entities.Product;
import models.ProductModel;

public class Demo13 {
	public static void main(String[] args) {
		ProductModel productModel = new ProductModel();
		int count1 = productModel.count1();
		System.out.println("count1: " + count1);
		int count2 = productModel.count2(true);
		System.out.println("count2: " + count2);
		double min = productModel.min();
		System.out.println("min: " + min);
		
	}
}
