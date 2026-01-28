package demo;

import java.util.Scanner;

import models.AccountModel;

public class Demo21 {
	public static void main(String[] args) {
		AccountModel accountModel = new AccountModel();
		Scanner sc = new Scanner(System.in);
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
