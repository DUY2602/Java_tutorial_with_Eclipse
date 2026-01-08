package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Invoice {
	private int id;
	private String customerName;
	private String productName;
	private double price;
	private int quantity;
	private Date created;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	
	
	
	public Invoice() {

	}
	
	
	public Invoice(int id, String customerName, String productName, double price, int quantity, Date created) {
		this.id = id;
		this.customerName = customerName;
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
		this.created = created;
	}
	
	
	public void printInfo() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("ID: " + this.id);
		System.out.println("Customer name: " + this.customerName);
		System.out.println("Product Name: " + this.productName);
		System.out.println("Price: " + this.price);
		System.out.println("Quantity: " + this.quantity);
		System.out.println("Created: " + sdf.format(this.created));

	}
}
