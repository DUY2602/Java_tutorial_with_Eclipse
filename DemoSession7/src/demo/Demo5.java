package demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import entities.Invoice;

public class Demo5 {
	public static void main(String[] args) {
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			Invoice iv1 = new Invoice(1, "Do Duc Duy", "Laptop", 34.5, 2, new Date());
			Invoice iv2 = new Invoice(2, "Nguyen Van A", "TV", 67.8, 1, sdf.parse("08/01/2026"));
			
			iv1.printInfo();
			System.out.println("\n=======================\n");
			iv2.printInfo();
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
