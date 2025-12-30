package demo;

import java.util.UUID;

public class Demo4 {
	public static void main(String[] args) {
		//UUID
		String s = UUID.randomUUID().toString();
		System.out.println(s);
		
		// Get rid of "-"
		String name = s.replace("-", "");
		System.out.println(name);
		
		// Extension a.txt.png.jpg
		String filename = "a.txt.png.jpg";
		
		// Find the last dot (before extension)
		int lastDocIndex = filename.lastIndexOf(".");
		System.out.println("Last index of dot: " + lastDocIndex);
		
		// Use substring to take out the extension
		String extension = filename.substring(lastDocIndex);
		System.out.println("Extension: " + extension);
		
		// Concatenate name & extension to get a brand new random name
		String finalName = name + extension;
		System.out.println("Final name: " + finalName);
		
		System.out.println(generateFileName("doducduy.jpg.gif.doc.pdf"));
	}
	
	// Create a new function to generate random name
	public static String generateFileName(String filename) {
		String s = UUID.randomUUID().toString();
		String name = s.replace("-", "");
		int lastDocIndex = filename.lastIndexOf(".");
		String extension = filename.substring(lastDocIndex);
		String finalName = name + extension;

		
		return finalName;
	}
}
