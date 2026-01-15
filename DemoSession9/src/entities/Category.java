package entities;

import java.util.ArrayList;
import java.util.List;

public class Category {
	private int id;
	private String name;
	private List<Product> products = new ArrayList<Product>();
	
	
	public Category() {
		super();
	}
	public Category(int id, String name, List<Product> products) {
		super();
		this.id = id;
		this.name = name;
		this.products = products;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}
	@Override
	public String toString() {
		return "Category [id=" + id + ", name=" + name + ", products=" + products + "]";
	}
	
	public void print() {
		System.out.println("categoryID: " + this.id);
		System.out.println("categoryName: " + this.name);
		for (Product product : products) {
			System.out.println(product.toString());
		}
	}
	
	
	
}
