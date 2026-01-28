package demo;


import java.util.Date;
import java.util.List;

import entities.Product;
import models.ProductModel;

public class Demo15 {
	public static void main(String[] args) {
		ProductModel productModel = new ProductModel();
		if(productModel.delete(8)) {
			System.out.println("Xoa san pham thanh cong");
		} else {
			System.out.println("Xoa san pham that bai");
		}
		
	}
}
