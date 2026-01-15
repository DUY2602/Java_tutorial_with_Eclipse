package models;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import entities.Product;

public class ProductModel {
	public List<Product> findAll(){
		try {
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
			List<Product> products = new ArrayList<Product>();
			products.add(new Product(1, "Tivi", 8.5, 10, simpleDateFormat.parse("20/09/2025"), true));
			products.add(new Product(2, "Laptop", 1.5, 20, simpleDateFormat.parse("10/10/2025"), true));
			products.add(new Product(3, "Phone", 2.5, 30, simpleDateFormat.parse("30/11/2025"), true));
			products.add(new Product(4, "Headphone", 3.5, 40, simpleDateFormat.parse("15/12/2025"), true));
			return products;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public Product findByID(int id) {
		for (Product product : findAll()) {
			if(product.getId() == id) {
				return product;
			}
		}
		return null;
	}
	
	public List<Product> searchByKeyword(String keyword){
		List<Product> results = new ArrayList<Product>();
		for (Product product : findAll()) {
			if(product.getName().toLowerCase().contains(keyword.toLowerCase())) {
				results.add(product);
			}
		}
		return results;
	}
	
	public List<Product> searchByPrice(double min, double max){
		List<Product> results = new ArrayList<Product>();
		for (Product product : findAll()) {
			if(product.getPrice() >= min && product.getPrice() <= max) {
				results.add(product);
			}
		}
		return results;
	}
}
