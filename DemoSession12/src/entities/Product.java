package entities;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Product {
	private String id;
	private String name;
	private double price;
	private int quantity;
	private Date created;
	
	
	public Product(String id, String name, double price, int quantity, Date created) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.created = created;
	}

	public static List<Product> readCSV(String path){
		List<Product> products = new ArrayList<>();
		
		try {
			List<String> lines = Files.readAllLines(Paths.get(path));
			
			
			SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
			
			for(int i = 1; i < lines.size(); i++) {
				String[] line = lines.get(i).split(",");
				
				String id = line[0];
	            String name = line[1];
	            double price = Double.parseDouble(line[2]);
	            int quantity = Integer.parseInt(line[3]);
	            Date created = sdf.parse(line[4]);
	            
	            products.add(new Product(id, name, price, quantity, created));
			}
			
		} catch (IOException | ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return products;
	}
	
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", quantity=" + quantity + ", created="
				+ created + "]";
	}
}
