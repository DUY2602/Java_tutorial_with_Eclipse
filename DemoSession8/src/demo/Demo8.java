package demo;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import entities.Product;
import entities.Student;
import models.ProductModel;

public class Demo8 {
	/*
	 * Thực hiện các yêu cầu sau
	 * Trả ra 1 sinh viên theo ID người dùng truyền vào 
	 * Tìm kiếm danh sách sản phẩm theo từ khóa 
	 * Tìm kiểm danh sách sản phẩm theo khoảng giá
	 * Tìm kiếm danh sách sản phẩm khả dụng (quantity > 0 && status = true)
	 * Tìm ra sản phẩm có giá lớn nhất
	 * Sắp xếp danh sách sản phẩm theo giá giảm dần
	 * Thực hiện liệt kê ra các sản phẩm có created nằm trong năm 2026
	 * 
	 * */
	
	public static void main(String[] args) {
		try {
			// Create a list of students (like Demo2, Demo3)
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
			List<Student> students = new ArrayList<Student>();
			students.add(new Student(1, "Nguyen Van A", 20, 8.5, 7.5, 9.0, simpleDateFormat.parse("15/05/2004")));
			students.add(new Student(2, "Tran Thi B", 21, 7.0, 8.0, 7.5, simpleDateFormat.parse("20/08/2003")));
			students.add(new Student(3, "Le Van C", 19, 9.0, 8.5, 9.5, simpleDateFormat.parse("10/12/2005")));
			
			// Implement ProductModel (like Demo4)
			ProductModel productModel = new ProductModel();
			List<Product> allProducts = productModel.findAllList();
			
			System.out.println("=== KẾT QUẢ CÁC YÊU CẦU ===\n");
			
			/* 1. Return the student that has the specific ID */
			System.out.println("1. Sinh viên có ID = 2:");
			for (Student student : students) {
				if (student.getId() == 2) {
					System.out.println(student);
					break;
				}
			}
			
			/* 2. Find products by keyword */
			System.out.println("\n2. Sản phẩm có từ khóa 'ti':");
			List<Product> keywordResults = new ArrayList<Product>();  // Like Demo5, Demo6
			for (Product product : allProducts) {
				// Giống ProductModel.searchByKeyword()
				if (product.getName().toLowerCase().contains("ti")) {
					keywordResults.add(product);
				}
			}
			for (Product product : keywordResults) {
				System.out.println(product);
			}
			
			/* 3. Tìm kiếm danh sách sản phẩm theo khoảng giá */
			System.out.println("\n3. Sản phẩm có giá từ 2.0 đến 4.0:");
			List<Product> priceResults = new ArrayList<Product>();
			for (Product product : allProducts) {
				// Giống ProductModel.searchByPrice()
				if (product.getPrice() >= 2.0 && product.getPrice() <= 4.0) {
					priceResults.add(product);
				}
			}
			for (Product product : priceResults) {
				System.out.println(product);
			}
			
			/* 4. Tìm kiếm danh sách sản phẩm khả dụng */
			System.out.println("\n4. Sản phẩm khả dụng (quantity > 0 && status = true):");
			List<Product> availableProducts = new ArrayList<Product>();
			for (Product product : allProducts) {
				if (product.getQuantity() > 0 && product.isStatus()) {
					availableProducts.add(product);
				}
			}
			for (Product product : availableProducts) {
				System.out.println(product);
			}
			
			/* 5. Tìm ra sản phẩm có giá lớn nhất */
			System.out.println("\n5. Sản phẩm có giá lớn nhất:");
			if (!allProducts.isEmpty()) {
				Product maxProduct = allProducts.get(0);  // Giống Demo6 lấy phần tử đầu
				for (Product product : allProducts) {
					if (product.getPrice() > maxProduct.getPrice()) {
						maxProduct = product;
					}
				}
				System.out.println(maxProduct);
			}
			
			/* 6. Sắp xếp danh sách sản phẩm theo giá giảm dần */
			System.out.println("\n6. Sắp xếp sản phẩm theo giá giảm dần:");
			// Tạo bản sao để không ảnh hưởng danh sách gốc
			List<Product> sortedProducts = new ArrayList<Product>(allProducts);
			
			// Sắp xếp bằng bubble sort (dựa trên kiến thức đã học)
			for (int i = 0; i < sortedProducts.size() - 1; i++) {  // Giống Demo2 for index
				for (int j = 0; j < sortedProducts.size() - i - 1; j++) {
					if (sortedProducts.get(j).getPrice() < sortedProducts.get(j + 1).getPrice()) {
						// Hoán đổi vị trí
						Product temp = sortedProducts.get(j);
						sortedProducts.set(j, sortedProducts.get(j + 1));
						sortedProducts.set(j + 1, temp);
					}
				}
			}
			
			for (Product product : sortedProducts) {
				System.out.println(product);
			}
			
			/* 7. Sản phẩm có created nằm trong năm 2026 */
			System.out.println("\n7. Sản phẩm có created trong năm 2026:");
			List<Product> products2026 = new ArrayList<Product>();
			SimpleDateFormat yearFormat = new SimpleDateFormat("yyyy");  // Giống Product.java toString()
			
			for (Product product : allProducts) {
				String year = yearFormat.format(product.getCreated());
				if (year.equals("2026")) {
					products2026.add(product);
				}
			}
			
			if (products2026.isEmpty()) {
				System.out.println("Không có sản phẩm nào");
			} else {
				for (Product product : products2026) {
					System.out.println(product);
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
