package demo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.Product;

public class Demo7 {
	public static void main(String[] args) {
		List<Product> products = null;
		
		try {
			products = Product.readCSV("src/data/product.csv");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for (Product p : products) {
            System.out.println(p.toString());
        }
	}
}
