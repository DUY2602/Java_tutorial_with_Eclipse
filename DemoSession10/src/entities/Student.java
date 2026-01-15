package entities;

import java.util.Scanner;

public class Student extends Human{
	private String id;
	private double score;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	public Student(String id, double score) {
		super();
		this.id = id;
		this.score = score;
	}
	public Student() {
		super();
	}
	
	
	
	public Student(String name, String gender, String id, double score) {
		super(name, gender);
		this.id = id;
		this.score = score;
	}
	
	public void print() {
		System.out.println("ID: " + this.id);
		System.out.println("score: " + this.score);
		super.print();
	}
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ID: ");
		this.id = sc.nextLine();
		
		System.out.println("Score: ");
		this.score = sc.nextDouble();
				
		super.input();	
	}
}
