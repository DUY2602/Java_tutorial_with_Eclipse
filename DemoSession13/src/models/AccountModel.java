package models;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import entities.Account;

public class AccountModel {
	public List<Account> findAll(){
		List<Account> accounts = new ArrayList<Account>();
		
		try {
			PreparedStatement preparedStatement = ConnectDB.connection().prepareStatement("select * from account");
			ResultSet resultSet = preparedStatement.executeQuery();
			
			while(resultSet.next()) {
				Account account = new Account();
				
				account.setId(resultSet.getInt("id"));
				account.setUsername(resultSet.getString("username"));
				account.setPassword(resultSet.getString("password"));
				account.setFullname(resultSet.getString("fullname"));
				account.setDob(resultSet.getDate("dob"));
				account.setEmail(resultSet.getString("email"));
				account.setCreated(resultSet.getDate("created"));
				account.setStatus(resultSet.getBoolean("status"));
				
				accounts.add(account);
			}
		} catch (Exception e) {
			accounts = null;
			e.printStackTrace();
		}
		
		return accounts;
	}
}
