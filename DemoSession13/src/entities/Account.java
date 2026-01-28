package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Account {
	private int id;
	private String username;
	private String password;
	private String fullName;
	private Date dob;
	private String email;
	private Date created;
	private boolean status;
	private String security_code;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public String getSecurity_code() {
		return security_code;
	}
	public void setSecurity_code(String security_code) {
		this.security_code = security_code;
	}
	public Account(int id, String username, String password, String fullName, Date dob, String email, Date created,
			boolean status, String security_code) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.fullName = fullName;
		this.dob = dob;
		this.email = email;
		this.created = created;
		this.status = status;
		this.security_code = security_code;
	}
	public Account() {
		super();
	}
	@Override
	public String toString() {
		return "Account [id=" + id + ", username=" + username + ", password=" + password + ", fullName=" + fullName
				+ ", dob=" + dob + ", email=" + email + ", created=" + created + ", status=" + status
				+ ", security_code=" + security_code + "]";
	}
	
	
	
}
