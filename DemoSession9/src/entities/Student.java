package entities;

public class Student {
	private int id;
	private String name;
	private double score;
	private Address address;
	
	public Student() {
		super();
	}
	public Student(int id, String name, double score, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.score = score;
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", score=" + score + ", address=" + address + "]";
	}
	
	
}
