package demo;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.mindrot.jbcrypt.BCrypt;

import entities.Account;
import helpers.RandomStringHelper;
import models.AccountModel;

public class Demo19 {
	public static void main(String[] args) {
		try {
			AccountModel accountModel = new AccountModel();
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			Account account = new Account();
			
			account.setUsername("duy");
			account.setFullName("Đỗ Đức Duy");
			account.setEmail("daveduy2006@gmail.com");
			account.setDob(sdf.parse("26/02/2006"));
			account.setCreated(new Date());
			account.setPassword(BCrypt.hashpw("duy", BCrypt.gensalt()));
			account.setStatus(false);
			account.setSecurity_code(RandomStringHelper.generateSixDigitNumber());
			
			if(accountModel.create(account)) {
				System.out.println("Successful");
				
			} else {
				System.out.println("Failed");
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
