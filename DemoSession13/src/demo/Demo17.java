package demo;

import java.util.List;

import entities.Account;
import models.AccountModel;

public class Demo17 {
	public static void main(String[] args) {
		AccountModel accountModel = new AccountModel();
		List<Account> accounts = accountModel.findAll();
		
		for (Account account : accounts) {
			System.out.println(account);
		}
		
		System.out.println("\n\n");
		
		System.out.println(accountModel.findByID(2));
		
		System.out.println("\n\n");
		
		System.out.println(accountModel.findByUsername("lethib"));
	}
}
