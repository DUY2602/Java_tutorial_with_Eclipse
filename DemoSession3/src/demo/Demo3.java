package demo;

import java.util.Arrays;

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
		
		// Upper case
		System.out.println("String 1 uppercase: " + s1.toUpperCase());
		
		// Lower case
		System.out.println("String 1 lowercase: " + s1.toLowerCase());
		
		// Trim
		String s3 = "       abc      ";
		System.out.println("Trimming string string 3: " + s3.trim());
		
		// Find substring
		String text = "I think Java is fun";
		System.out.println("Position of Java in text: " + text.indexOf("Java"));
		// Or if want to check ignoring case (by change both text string and substring all to LowerCase)
		System.out.println("Position of jAvA in text (ignore case): " + text.toLowerCase().indexOf(("jAvA").toLowerCase()));
		
		// Find the last appearance of a character or substring
		System.out.println("Last index of char 'i': " + text.lastIndexOf("i"));
		System.out.println("Last index of substring 'is': " + text.lastIndexOf("is"));
		
		// Check if string starts or end with a particular char or substring
		System.out.println("Does string start with 'I': " + text.startsWith("I"));
		System.out.println("Dose string start with 'Java': " + text.startsWith("Java"));
		
		System.out.println("Does string end with 'f': " + text.endsWith("f"));
		System.out.println("Does string end with 'fun': " + text.endsWith("fun"));
		
		// Check if string contains a character or substring
		System.out.println("Does string contain 'a': " + text.contains("a"));
		System.out.println("Does string contain 'Python': " + text.contains("Python"));
		
		// Replace substring
		System.out.println("Replace 'fun' with 'fantastic': " + text.replace("fun", "fantastic"));
		
		// Cut string to words
		System.out.println("Cut string into words (store as array): " + Arrays.toString(text.split(" ")));
		
		// **********************************************************
		// String Builder ==> change the value of the original string
		// **********************************************************
		StringBuilder sb = new StringBuilder("Hello");
		System.out.println("Original string: " + sb);
		
		// Adding substring to string
		System.out.println("Adding 'Java' to string: " + sb.append(" Java"));
		
		// Insert at a particular index
		System.out.println("Insert ', ' after the word 'Hello': " + sb.insert(5, ","));
		
		// Delete from to a particular index
		System.out.println("Delete ',' by index: " + sb.delete(5, 6));
		
		// Reverse a string
		System.out.println("Reverse string: " + sb.reverse());
		
		// Regex, pattern
		String phone = "0929097779";
		System.out.println("Is this a string of phone number: " + phone.matches("\\d{10}"));
		
		// Check if string is all alphabetical
		System.out.println("Check if string only contains letter: " + "Iam18yearsold".matches("[a-zA-Z]+"));
		
		// Check if string contains character
		System.out.println("Is this a valid mail: " + "duydo7779@gmail.com".matches(".*@.*"));
	}
}
