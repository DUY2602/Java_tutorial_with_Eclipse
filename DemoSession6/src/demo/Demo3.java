package demo;

import helper.Calculatorhelper;
import helper.MailHelper;

public class Demo3 {
	public static void main(String[] args) {
		MailHelper mailHelper = new MailHelper();
		mailHelper.send("a@gmail.com", "b@gmail.com");
		
		new MailHelper().send("c@gmail.com", "d@gmail.com");
		
		MailHelper.send("e@yahoo.com", "f@yahoo.com");
		
		
		double a = 10;
		double b = 5;
		System.out.println(Calculatorhelper.sum(a, b));
		System.out.println(Calculatorhelper.sub(a, b));
		System.out.println(Calculatorhelper.mul(a, b));
		System.out.println(Calculatorhelper.div(a, b));

	}
}
