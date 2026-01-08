package demo;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Demo8 {
	public static void main(String[] args) {
		Date today = new Date();
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(today);
		
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH);
		int day = calendar.get(Calendar.DAY_OF_MONTH);
		int hour = calendar.get(Calendar.HOUR);
		int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
		
		System.out.println("Year: " + year);
		System.out.println("Month: " + (month + 1));
		System.out.println("Day: " + day);
		System.out.println("Hour: " + hour);
		System.out.println("Day of week: " + dayOfWeek);
		
		System.out.println("February: " + (Calendar.FEBRUARY + 1));
		
		/*
		 * Input a string of birthday dd/MM/yyyy
		 * 1. Prompt again if invalid format
		 * 2. Check if today is birthday
		 * 3. Check if 18 years old
		 * */
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date dob = null;
		
		System.out.print("Enter birthday (dd/MM/yyyy): ");
		String input = sc.nextLine();
		
		while(true) {
			try {
				sdf.setLenient(false);
				dob = sdf.parse(input);
				System.out.println("Valid");
				break;
			} catch (Exception e) {
				System.out.println("Invalid");
			}
		}
		
		Calendar calendar2 = Calendar.getInstance();
		calendar2.setTime(dob);
		int dayOfBirth = calendar2.get(Calendar.DAY_OF_MONTH);
		int monthOfBirth = calendar2.get(Calendar.MONTH);
		int yearOfBirth = calendar2.get(Calendar.YEAR);
		
		if ((day == dayOfBirth) && (monthOfBirth == month)) {
			System.out.println("Happy Birthday !!!");
		} else {
			System.out.println("Not today");
		}
		
		if (year - yearOfBirth >= 18) {
			System.out.println("Mature");
		} else {
			System.out.println("Immature");
		}
	}
}
