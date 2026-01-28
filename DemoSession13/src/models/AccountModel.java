package models;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.mindrot.jbcrypt.BCrypt;

import com.sun.jdi.request.ClassPrepareRequest;

import entities.Account;
import helpers.RandomStringHelper;
import helpers.SendMailTest;

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
				account.setDob(resultSet.getDate("dob"));
				account.setEmail(resultSet.getString("email"));
				account.setFullName(resultSet.getString("fullname"));
				account.setCreated(resultSet.getDate("created"));
				account.setStatus(resultSet.getBoolean("status"));
				account.setSecurity_code(resultSet.getString("security_code"));
				accounts.add(account);
			}
		} catch (Exception e) {
			accounts = null;
			e.printStackTrace();
		}
		return accounts;
	}
	
	public Account findByID(int id) {
		Account account = null;
		
		try {
			PreparedStatement preparedStatement = ConnectDB.connection()
					.prepareStatement("select * from account where id = ?");
			preparedStatement.setInt(1, id);
			ResultSet resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				account = new Account();
				account.setId(resultSet.getInt("id"));
				account.setUsername(resultSet.getString("username"));
				account.setPassword(resultSet.getString("password"));
				account.setDob(resultSet.getDate("dob"));
				account.setEmail(resultSet.getString("email"));
				account.setFullName(resultSet.getString("fullname"));
				account.setCreated(resultSet.getDate("created"));
				account.setStatus(resultSet.getBoolean("status"));
				account.setSecurity_code(resultSet.getString("security_code"));
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			account = null;
		}
		
		return account;
	}
	
	public Account findByUsername(String username) {
		Account account = null;
		
		try {
			PreparedStatement preparedStatement = ConnectDB.connection()
					.prepareStatement("select * from account where username = ?");
			preparedStatement.setString(1, username);
			ResultSet resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				account = new Account();
				account.setId(resultSet.getInt("id"));
				account.setUsername(resultSet.getString("username"));
				account.setPassword(resultSet.getString("password"));
				account.setDob(resultSet.getDate("dob"));
				account.setEmail(resultSet.getString("email"));
				account.setFullName(resultSet.getString("fullname"));
				account.setCreated(resultSet.getDate("created"));
				account.setStatus(resultSet.getBoolean("status"));
				account.setSecurity_code(resultSet.getString("security_code"));
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			account = null;
		}
		
		return account;
	}
	
	public boolean create(Account account) {
		boolean result = true;
		
		try {
			PreparedStatement preparedStatement = ConnectDB.connection()
					.prepareStatement("insert into account(username, password, fullname, dob, email, created, status, security_code)"
							+ "values(?, ?, ?, ?, ?, ?, ?, ?)");
			preparedStatement.setString(1, account.getUsername());
			preparedStatement.setString(2, account.getPassword());
			preparedStatement.setString(3, account.getFullName());
			preparedStatement.setDate(4, new Date(account.getDob().getTime()));
			preparedStatement.setString(5, account.getEmail());
			preparedStatement.setDate(6, new Date(account.getCreated().getTime()));
			preparedStatement.setBoolean(7, account.isStatus());
			preparedStatement.setString(8, account.getSecurity_code());
			
			result = preparedStatement.executeUpdate() > 0;
			
			if (result) {
				String from = "daveduy2006@gmail.com";
				String to = "daveduy2006@gmail.com";
				
				String subject = "Verify account";
				String body = "Your OTP code: " + account.getSecurity_code();
				
				SendMailTest.sendEmail(from, to, subject, body);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			result = false;
		}
		
		return result;
	}
	
	public Account findByEmail(String email) {
		Account account = null;
		
		try {
			PreparedStatement preparedStatement = ConnectDB.connection()
					.prepareStatement("select * from account where email = ?");
			preparedStatement.setString(1, email);
			ResultSet resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				account = new Account();
				account.setId(resultSet.getInt("id"));
				account.setUsername(resultSet.getString("username"));
				account.setPassword(resultSet.getString("password"));
				account.setDob(resultSet.getDate("dob"));
				account.setEmail(resultSet.getString("email"));
				account.setFullName(resultSet.getString("fullname"));
				account.setCreated(resultSet.getDate("created"));
				account.setStatus(resultSet.getBoolean("status"));
				account.setSecurity_code(resultSet.getString("security_code"));
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			account = null;
		}
		
		return account;
	}
	
	public boolean verifyAccount(String email, String securityCode) {
		boolean result = true;
		
		try {
			Account account = findByEmail(email);
			if (account != null) {
				PreparedStatement preparedStatement = ConnectDB.connection().prepareStatement("update account set status = ? where id = ?");
				preparedStatement.setBoolean(1, true); 
		        preparedStatement.setInt(2, account.getId());
		        
		        result = preparedStatement.executeUpdate() > 0;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			result = false;
		}
		
		return result;
	}
	
	public boolean checkLogin(String username, String password) {
		
		try {
			Account account = findByUsername(username);
			if (account != null) {
				return BCrypt.checkpw(password, account.getPassword()) && account.isStatus();
			}
			return false;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	public static void main(String[] args) {
		AccountModel accountModel = new AccountModel();
		boolean status = accountModel.verifyAccount("daveduy2006@gmail.com", "588744");
		if(status) {
			System.out.println("Verified");
		} else {
			System.out.println("Unverified");
		}
		
		System.out.println(new AccountModel().checkLogin("duy", "duy"));
	}
}
