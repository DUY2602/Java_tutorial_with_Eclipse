package demo;

import java.util.Scanner;

public class Exercise2 {
	/* Input a string, then perform one these actions
	  * 1. Count words
	  * 2. Upper case name (for ex: nguyen van a => Nguyen Van A)
	  * 3. Count appearance of word
	  * 4. Upper case the lower case letter or vice versa (for ex: lE ThAnH Tu => Le tHaNh tU)
	  */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		// Input the string
		StringBuilder s;
		do {
		System.out.print("Enter a string: ");
		s = new StringBuilder(sc.nextLine());
		} 
		while (s.toString().trim() == "");
		
		// Show functions menu and prompt for choice
		String key = "";
		do {
		System.out.println("\n=============Menu============");
		System.out.println("1. Count words");
		System.out.println("2. Upper case name");
		System.out.println("3. Count appearance of word");
		System.out.println("4. Upper case the lower case & vice versa");
		
		System.out.print("Enter your choice: ");
		int choice = sc.nextInt();
		
		switch (choice) {
			case 1:
				wordCount(s);
				break;
			case 2:
				upperCaseName(s);
				break;
			case 3:
				countAppearance(s);
				break;
			case 4:
				upperLower(s);
				break;
			default:
				System.out.println("Invalid choice !!!");
				break;
				}
		
			System.out.print("Press y/Y to continue: ");
			sc.nextLine();
			key = sc.nextLine();
		} while(key.equalsIgnoreCase("y"));	
	}
	
	public static void wordCount(StringBuilder s) {
		System.out.println("Total words: " + s.toString().trim().split(" ").length);
	}
	
	public static void upperCaseName(StringBuilder s) {
		String[] string_arr = s.toString().split(" ");
		
		String text = "";
		for (int i = 0; i < string_arr.length; i++) {
			String first = string_arr[i].substring(0, 1).toUpperCase();
			String remainder = string_arr[i].substring(1);
			text += first + remainder + " ";
		}
		System.out.println("Upper Case Name: " + text);
	}
	
	public static void countAppearance(StringBuilder s) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Enter the string to count appearance: ");
		String prompt = sc.nextLine();
		
		int count = (s.toString().length() - s.toString().toLowerCase().replace(prompt.toLowerCase(), "").length());
		
		System.out.println("Appear " + count / prompt.length() + " times");
	}
	
	public static void upperLower(StringBuilder s) {
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			
			if (Character.isLowerCase(c)) {
				s.setCharAt(i, Character.toUpperCase(c));
			} else {
				s.setCharAt(i, Character.toLowerCase(c));
			}
		}
		System.out.println("After convert Upper -> Lower & Lower -> Upper: " + s.toString());
	}
}
