package entities;

public class Product {
	private int id;
	private String name;
	private double price;
	private int quantity;
	
	
	public int getId() {return id;}
	public void setId(int id) {this.id = id;}
	
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	
	public double getPrice() {return price;}
	public void setPrice(double price) {
		if (price < 0) {
			System.out.println("Invalid price");
		} else {
		this.price = price;
		}
	}
	
	public int getQuantity() {return quantity;}
	public void setQuantity(int quantity) {this.quantity = quantity;}
	
	// getter --> get the value for attributes
	// setter --> set the value for attributes
	
	// Quickly generate getter and setter: ALT + SHIFT + S --> GENERATE GETTER AND SETTER
	
	
	// Constructor
	public Product() {
		System.out.println("No parameter constructor");
	}
	
	// Quickly generate constructor using fields: ALT + SHIFT + S --> GENERATE CONSTRUCTOR USING FIELDS
	public Product(int id, String name, double price, int quantity) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public void total() {
		System.out.println("Total: " + this.price * this.quantity);
	}
}
