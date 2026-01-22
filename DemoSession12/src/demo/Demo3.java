package demo;

import java.io.File;

public class Demo3 {
	public static void main(String[] args) {
		File file = new File("src\\data\\a.txt");
		System.out.println("File name: " + file.getName());
		System.out.println("File size: " + file.length());
		System.out.println("Absolute path: " + file.getAbsolutePath());
	}
}
