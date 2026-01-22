package demo;

import java.io.File;

public class Demo1 {
	public static void main(String[] args) {
		File file = new File("C:\\Users\\vppho\\OneDrive\\Desktop\\Aptech\\Java\\data_for_DS12\\a.txt");
		System.out.println("File name: " + file.getName());
		System.out.println("File size: " + file.length());
		System.out.println("Absolute path: " + file.getAbsolutePath());
		System.out.println("isFile: " + file.isFile());
		System.out.println("isDirectory: " + file.isDirectory());
	}
}
