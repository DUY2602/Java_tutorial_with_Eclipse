package demo;

public class Demo3 {
	public static void main(String[] args) {
		// String operation
		
		String s1 = "Hello World";
		System.out.println("First string: " + s1);
		
		String s2 = new String("Create string as an object");
		System.out.println("Second string: " + s2);
		
		// Take out the length of string
		System.out.println("Length of string 1: " + s1.length());
		
		// Take out a char
		System.out.println("Char at position 0 of string 1: " + s1.charAt(0));
		
		// String cutting
		System.out.println("Take string from start to position 4: " + s1.substring(0, 4));
		System.out.println("Take string from position 4 to end: " + s1.substring(4));
		
		// String combining
		System.out.println("Combine first string with ' - Java': " + s1.concat(" - Java"));
		
		// Letter case comparison
		System.out.println("Case comparison: " + s1.equals("hello world"));
		System.out.println("Ignore case comparison: " + s1.equalsIgnoreCase("hello world"));
		
		// Uppercase
		System.out.println("String 1 uppercase: " + s1.toUpperCase());
		
		// Lowercase
		System.out.println("String 1 lowercase: " + s1.toLowerCase());
		
		// Trim
		String s3 = "       abc      ";
		System.out.println("Trimming string string 3: " + s3.trim());
		
		// Find substring
		String text = "Java is fun";
		System.out.println("Position of Java in text: " + text.indexOf("Java"));
	}
}
