package demo;

import entities.Student;

public class Demo1 {
	public static void main(String[] args) {
		Student student = new Student();
		student.id = 1;
		// student.name can't be called as PROTECTED can only be accessed within package
		//student.age can't be called as PRIVATE can only be accessed within class
	}
}
