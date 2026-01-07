package demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Demo7 {
	/*
	 * Give a string "10/03/2025"
	 * - Convert to Date type
	 * - Convert again from Date type to format year month day
	 * 
	 * 
	 * 
	 * Convert date (today) to format year month date
	 * 
	 * 
	 * 
	 * Prompt user for a date string in format (dd/MM/yyyy)
	 * Check if it's in correct format
	 * - If yes then convert to yyyy-MM-dd
	 * - If no then throw error and propmt again
	 * 
	 * 
	 * 
	 * String s = "2025-01-06 10:30:30"
	 * Convert to ngày 06, tháng 01, năm 2025 vào lúc 10 giờ 30 phút 30 giây
	 * */
	public static void main(String[] args) {
		example1();
		
		System.out.println("\n=============================\n");
		
		example2();
		
		System.out.println("\n=============================\n");
		
		example3();
		
		System.out.println("\n=============================\n");
		
		example4();

	}
	
	public static void example1() {
		String s = "10/03/2025";
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date date = null;
		
		// Convert to Date type
		try {
			date = sdf.parse(s);
			System.out.println(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		// Convert to year month day
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy/MM/dd");
		String s2 = sdf2.format(date);
		System.out.println(s2);
	}
	
	public static void example2() {
		Date today = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		
		String s = sdf.format(today);
		System.out.println(s);
	}
	
	public static void example3() {
		Scanner sc = new Scanner(System.in);
		boolean isValid = true;
		do {
			System.out.print("Enter a date to check (dd/MM/yyyy): ");
			String input = sc.nextLine();
			
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			sdf.setLenient(false);
			try {
				Date date = sdf.parse(input);
				SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
				
				String s = sdf2.format(date);
				System.out.println(s);
				isValid = true;
			} catch (Exception e) {
				System.out.println("Invalid format !!!");
				isValid = false;
			}
		} while (!isValid);
	}
	
	public static void example4() {
		 String s = "2025-01-06 10:30:30";
		 SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		 Date date = null;
		 
		 try {
			date = sdf.parse(s);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 SimpleDateFormat sdf2 = new SimpleDateFormat("'ngày' dd, 'tháng' MM, 'năm' yyyy 'vào lúc' HH 'giờ' mm 'phút' ss 'giây'");
		 String s2 = sdf2.format(date);
		 
		 System.out.println(s2);
	}
}
