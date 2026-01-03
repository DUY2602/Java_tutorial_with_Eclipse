package demo;

import java.util.Scanner;

public class Demo1 {
	public static void main(String[] args) {
		String[] filename = {
				"a.git", "b.gif", "c.docx", "d.txt", "e.jpg", "f.png", "g.png"
		};
		
		/*
		 * 1. List all .png file
		 * 2. Count how many .gif file
		 * 3. Prompt an extension, list all files that have that extension
		 * */
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter an extension to check: ");
		String prompt = sc.nextLine();
		
		int count_gif = 0;
		
		for (String file : filename) {
			
			
			int lastDotIndex = file.lastIndexOf(".");
			String ext = file.substring(lastDotIndex);
			
			if (ext.equals(".png")) {
				System.out.println(file);
			}
			
			if (ext.equals(".gif")) {
				count_gif += 1;
			}
			
			if (ext.equals(prompt)) {
				System.out.println(file);
			}
		}
		System.out.println("There are " + count_gif + " " + prompt + " files");
	}
}
