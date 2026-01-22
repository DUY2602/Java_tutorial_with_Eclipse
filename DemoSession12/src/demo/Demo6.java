package demo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Demo6 {
	public static void main(String[] args) {
		try {
			List<String> products = Files.readAllLines(Paths.get("src/data/product.csv"));
			for(int i = 1; i < products.size(); i++) {
				System.out.println(products.get(i));
			}
			
			// thực hiện tạo đối tượng product và viết hàm sau 
			// viết hàm nhận vào 1 đường dẫn là file excel, sau đó chuyển đổi dữ liệu từ file excel
			// thanh danh sách sản phẩm và trả ra
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
