package demo;

import java.util.Scanner;

public class Demo3 {
	public static void main(String[] args) {
		String[] products = {
				"p01,Tivi,4.5,30",
				"p02,Iphone,2.3,40",
				"p03,Ipad,3.6,50",
				"p04,Airpod,1.1,60",
				"p05,Laptop,5.5,70",
				"p06,PC,8.9,80",
				"p07,HeadPhone,2.7,15"
		};
		
		for (String product : products) {
			String[] result = product.split(",");
			
			System.out.println("ID: " + result[0]);
			System.out.println("Name: " + result[1]);
			System.out.println("Price: " + result[2]);
			System.out.println("Quantity: " + result[3]);
			System.out.println("\n==============================\n");
		}
		
		/*
		 * 1. Total amount of products
		 * 2. Total price of products
		 * 3. Enter a keyword, check if product names contain it
		 * 4. Enter an ID, check if ID is in the product list
		 * 5. Find most expensive price
		 * 6. Sort DESC the price
		 * */
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a keyword: ");
		String key = sc.nextLine();
		
		System.out.println("Enter an ID: ");
		String id = sc.nextLine();
		
		int total_amount = 0;
		double total_price = 0;
		String search_name_products = "";
		String search_id_products = "";
		double max = 0;
		double[] price = new double[products.length];
		
		for (int i = 0; i < products.length; i++) {
			String[] result = products[i].split(",");
			price[i] = Double.parseDouble(result[2]);
			
			if (price[i] > max) {
				max = price[i];
			}
		}
		
		for (String product : products) {
			String[] result = product.split(",");
			
			total_amount += Integer.parseInt(result[3]);
			total_price += Double.parseDouble(result[2]);
			
			if (result[1].toLowerCase().contains(key.toLowerCase())) {
				search_name_products += result[1] + " ";
			}
			
			if (result[0].equals(id)) {
				search_id_products = result[1];
			}
			
			if (result[2].equals(String.valueOf(max))) {
				System.out.println("The most expensive product: " + result[1]);
			}
		}
		
		System.out.println("Total amount of products: " + total_amount);
		System.out.println("Total price of products: " + total_price);
		System.out.println("Products that match keyword " + key + ": " + search_name_products);
		System.out.println("Products that match ID " + id + ": " + search_id_products);


		
		for (int i = 0; i < price.length - 1; i++) {
			for (int j = 0; j < price.length - i - 1; j++) {
				if (price[j] < price[j + 1]) {
					double temp = price[j];
					price[j] = price[j + 1];
					price[j + 1] = temp;
				}
			}
		}
		
				
		for (int i = 0; i < price.length; i++) {
			System.out.print(price[i] + " ");
		}
	}
}
