package demo;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Demo3 {
	// Map lưu trữ dữ liệu theo cặp key - value
	public static void main(String[] args) {
		Map<String, String> student = new HashMap<String, String>();
		student.put("id", "st01");
		student.put("name", "student 1");
		student.put("address", "TP HCM");
		student.put("score", "8.9");
		
		System.out.println("size: " + student.size());
		System.out.println("id: " + student.get("id"));
		System.out.println("name: " + student.get("name"));
		System.out.println("address: " + student.get("address"));
		System.out.println("score: " + student.get("score"));
		
		System.out.println("contain key address: " + student.containsKey("address"));
		
		student.remove("address");
		System.out.println("contain key address: " + student.containsKey("address"));
		
		for (String key : student.keySet()) {
			System.out.println("key: " + key + " - value: " + student.get(key));
		}
		
		Map<String, Object> product = new HashMap<String, Object>();
		product.put("id", 1);
		product.put("name", "Product 1");
		product.put("price", 5.6);
		product.put("quantity", 20);
		product.put("created", new Date());
		product.put("status", true);
		System.out.println("Product info");
		for (String key : product.keySet()) {
			System.out.println(key + ": " + product.get(key));
		}
		
		
	}
}
