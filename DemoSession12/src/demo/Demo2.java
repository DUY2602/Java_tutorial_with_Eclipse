package demo;

import java.io.File;

public class Demo2 {
	public static void main(String[] args) {
		File folder = new File("C:\\Users\\vppho\\OneDrive\\Desktop\\Aptech\\Java\\data_for_DS12");
		System.out.println("isDirectory: " + folder.isDirectory());
		File[] files = folder.listFiles();
		
		for (File file : files) {
			if (file.isFile()) {
				System.out.println("File name: " + file.getName());
				System.out.println("File size: " + file.length());
				System.out.println("Absolute path: " + file.getAbsolutePath());
				System.out.println("isFile: " + file.isFile());
				System.out.println("isDirectory: " + file.isDirectory());
				System.out.println("\n\n");
			} else if (file.isDirectory()) {
				System.out.println("Folder name: " + file.getName());
				System.out.println("files: " + file.listFiles().length);
				System.out.println("\n\n");
			}
		}
	}
}
