package demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo6 {
	public static void main(String[] args) {
		Date today = new Date();
		System.out.println(today);
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		System.out.println(simpleDateFormat.format(today));
		
		System.out.println("\n=======================\n");
		
		String s = "20/11/2025";
		SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("dd/MM/yyy");
		try {
			Date date = simpleDateFormat2.parse(s);
			System.out.println(date);
			
			SimpleDateFormat simpleDateFormat3 = new SimpleDateFormat("yyyy-MM-dd");
			String s1 = simpleDateFormat3.format(date);
			System.out.println(s1);
		} catch (ParseException e) {
			System.out.println("Error in Date Format");
			e.printStackTrace();
		}
	}
}
