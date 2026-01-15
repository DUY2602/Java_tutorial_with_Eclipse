package demo;

import java.util.List;

import entities.Product;
import models.ProductModel;

public class Demo1 {
	/*
	 * Thực hiện các yêu cầu sau
	 * Trả ra 1 sản phẩm theo ID người dùng truyền vào 
	 * Tìm kiếm danh sách sản phẩm theo từ khóa 
	 * Tìm kiểm danh sách sản phẩm theo khoảng giá
	 * Tìm kiếm danh sách sản phẩm khả dụng (quantity > 0 && status = true)
	 * Tìm ra sản phẩm có giá lớn nhất
	 * Sắp xếp danh sách sản phẩm theo giá giảm dần
	 * Thực hiện liệt kê ra các sản phẩm có created nằm trong năm 2026
	 * 
	 * */
	public static void main(String[] args) {
		ProductModel productModel = new ProductModel();
		
		// Trả ra 1 sản phẩm theo ID người dùng truyền vào
		System.out.println("Sản phẩm theo ID");
		System.out.println(productModel.findByID(1));
		
		System.out.println("Danh sách sản phẩm theo từ khóa");
		String keyword = "ti";
		for (Product product : productModel.searchByKeyword(keyword)) {
			System.out.println(product.toString());
		}
		
		System.out.println("Danh sách sản phẩm theo khoảng giá");
		double min = 3, max = 5;
		List<Product> products = productModel.searchByPrice(min, max);
		for (Product product : products) {
			System.out.println(product);
		}
	}
}
