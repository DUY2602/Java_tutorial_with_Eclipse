package demo;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import entities.Product;

public class Demo7 {
	public static void main(String[] args) {
		try {
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
			List<Product> products = new ArrayList<Product>();
			products.add(new Product(1, "Product 1", 8.5, 10, simpleDateFormat.parse("20/09/2025"), true));
			products.add(new Product(2, "Product 2", 1.5, 20, simpleDateFormat.parse("10/10/2025"), true));
			products.add(new Product(3, "Product 3", 2.5, 30, simpleDateFormat.parse("30/11/2025"), true));
			products.add(new Product(4, "Product 4", 3.5, 40, simpleDateFormat.parse("15/12/2025"), true));
			
			// lay ra so phan tu cua danh sach san pham
			System.out.println("products size: " + products.size());
			// thuc hien lay san pham cuoi cung
			System.out.println("product cuoi cung " + products.get((products.size() - 1)));
			// thuc hien xoa san pham dau tien ra khoi mang
			products.remove(0);
			// in ra danh sach san pham
			for (Product product : products) {
				System.out.println(product.toString());
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
}
