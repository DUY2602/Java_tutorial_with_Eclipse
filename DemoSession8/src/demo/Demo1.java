package demo;

import entities.Student;

public class Demo1 {
/*
 * tạo đối tượng SinhVien có các thuộc tinh sau 
 * 
	maSV
	tenSV
	tuoi
	toan
	ly
	hoa
	ngaySinh
	
	thực hiện tạo ra 3 đối tượng sinh viên cho phép người dùng nhập giá trị thuộc tính từ bàn phím
	
	viết hàm tính diem trung bình cho mỗi sinh viên
	
	viết hàm xếp loại sinh viên dựa vào diem trung binh
	
	8 trở lên : giỏi
	6-8: khá
	dưới 6: trung bình
	
	viết hàm in sinh viên
	
	viết hàm kiểm tra xem hôm nay có phải sinh nhật của sinh viên không
	
	viết hàm kiểm tra xem sinh viên có đủ 18 tuổi chưa

 * */
	public static void main(String[] args) {
		Student student = new Student();
		//student.input();
		//student.print();
		
		System.out.println("------------");
		Student student2 = new Student();
		//student2.input();
		//student2.print();
		
		Student student3 = new Student();
		student3.input();
		System.out.println(student3.toString());
	}
}
