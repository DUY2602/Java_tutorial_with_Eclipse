package models;

import java.util.ArrayList;
import java.util.List;

import entities.Course;
import entities.Teacher;

public class TeacherModel {
	public List<Teacher> findAll(){
		List<Teacher> teachers = new ArrayList<Teacher>();
		
		Course c1 = new Course(1, "Toán");
		Course c2 = new Course(2, "Lý");
		Course c3 = new Course(3, "Hóa");
		Course c4 = new Course(4, "Sinh");
		Course c5 = new Course(5, "Văn");
		Course c6 = new Course(4, "Anh");
		
		Teacher teacher1 = new Teacher();
		teacher1.setId(1);
		teacher1.setName("Teacher 1");
		teacher1.setSalary(100);
		teacher1.getCourses().add(c1);
		teacher1.getCourses().add(c2);
		teacher1.getCourses().add(c3);
		
		Teacher teacher2 = new Teacher();
		teacher2.setId(2);
		teacher2.setName("Teacher 2");
		teacher2.setSalary(120);
		teacher2.getCourses().add(c1);
		teacher2.getCourses().add(c3);
		teacher2.getCourses().add(c4);
		
		Teacher teacher3 = new Teacher();
		teacher3.setId(3);
		teacher3.setName("Teacher 3");
		teacher3.setSalary(150);
		teacher3.getCourses().add(c1);
		teacher3.getCourses().add(c5);
		teacher3.getCourses().add(c6);
		
		teachers.add(teacher1);
		teachers.add(teacher2);
		teachers.add(teacher3);
		return teachers;
	}
}
