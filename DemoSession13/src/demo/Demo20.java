package demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import org.mindrot.jbcrypt.BCrypt;

import entities.Account;
import helpers.RandomStringHelper;
import models.AccountModel;

public class Demo20 {
	public static void main(String[] args) {
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			AccountModel accountModel = new AccountModel();
			
			System.out.println("Please register account");
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Username: ");
			String username = sc.nextLine();
			
			System.out.print("Password: ");
			String password = sc.nextLine();
			
			System.out.print("Fullname: ");
			String fullname = sc.nextLine();
			
			System.out.print("DOB: ");
			String dob = sc.nextLine();
			
			System.out.print("Email: ");
			String email = sc.nextLine();
			
			Account account = new Account();
			account.setUsername(username);
			account.setFullName(fullname);
			account.setPassword(BCrypt.hashpw(password, BCrypt.gensalt()));
			account.setEmail(email);
			account.setCreated(new Date());
			account.setSecurity_code(RandomStringHelper.generateSixDigitNumber());
			account.setDob(sdf.parse(dob));
			account.setStatus(false);
			
			if (accountModel.create(account)) {
				System.out.println("Successfully created. Please type OTP to verify account");
				System.out.println("OTP: ");
				String otp = sc.nextLine();
				
				if (accountModel.verifyAccount(email, otp)) {
					System.out.println("Successfully verified! Please login");
					System.out.println("Username: ");
					String usernameLogin = sc.nextLine();
					System.out.println("Passowrd: ");
					String passwordLogin = sc.nextLine();
					boolean result = accountModel.checkLogin(usernameLogin, passwordLogin);
					if (result) {
						System.out.println("Successfully logged in");
					} else {
						System.out.println("Failed");
					}
				}
			}
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Failed");
		}
	}
}
