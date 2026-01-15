package demo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.Category;
import entities.Product;

public class Demo5 {
	public static void main(String[] args) {
		Category category1 = new Category();
		category1.setId(1);
		category1.setName("Category 1");
		category1.getProducts().add(new Product(1, "Product 1", 8.9, 20, new Date(), true));
		category1.getProducts().add(new Product(2, "Product 2", 2.9, 10, new Date(), true));
		category1.getProducts().add(new Product(3, "Product 3", 3.9, 30, new Date(), true));
		System.out.println(category1);
		
		category1.print();
		
		List<Product> products = new ArrayList<Product>();
		products.add(new Product(1, "Product 1", 8.9, 20, new Date(), true));
		products.add(new Product(2, "Product 2", 8.9, 20, new Date(), true));
		products.add(new Product(3, "Product 3", 8.9, 20, new Date(), true));
		
		Category category2 = new Category(2, "Category 2", products);
		System.out.println("Category 2");
		category2.print();
		
		/*
		 * thực hiện tạo ra đối tượng giáo viên (teacher)
		 * 1 giáo viên sẽ có danh sách các môn học (course)
		 * teacher(id, name, salary, courses)
		 * course(id, name)
		 * 
		 * thực hiện tạo ra đối tượng nhân nhân viên (employee) và phòng ban (department)
		 * 1 nhân viên sẽ thuộc 1 phòng ban
		 * employee(id, name, salary, department)
		 * department(id, name)
		 * */
		
		
	}
}
