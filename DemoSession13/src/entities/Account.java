package entities;

import java.text.SimpleDateFormat;

import java.util.Date;

public class Account {
	private int id;
	private String username;
	private String password;
	private String fullname;
	private Date dob;
	private String email;
	private Date created;
	private boolean status;
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
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
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
	public Account(int id, String username, String password, String fullname, Date dob, String email, Date created,
			boolean status) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.fullname = fullname;
		this.dob = dob;
		this.email = email;
		this.created = created;
		this.status = status;
	}
	public Account() {
		super();
	}
	@Override
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		return "Account [id=" + id + ", username=" + username + ", password=" + password + ", fullname=" + fullname
				+ ", dob=" + sdf.format(dob) + ", email=" + email + ", created=" + sdf.format(created) + ", status=" + status + "]";
	}
}
