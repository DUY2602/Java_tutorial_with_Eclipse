package demo;

import entities.Student;

public class Demo7 {
	public static void main(String[] args) {
		Student[] students = new Student[3];
		
		for (int i = 0; i < students.length; i++) {
			System.out.println("\n====== Entering data for Student " + (i + 1) + " ======");
            students[i] = new Student();
            students[i].getInfo();
		}
		
		System.out.println("\n========== STUDENT LIST ==========");
        for (Student s : students) {
            s.printInfo();
            s.average();
            s.grade();
            s.checkAge();
            s.checkBirthday();
            System.out.println("\n============================================\n");
        }
	}
}
