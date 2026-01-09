package entities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;


public class Student {
	
	// Student's attributes
	public int id;
	protected String name;
	private double math;
	private double physics;
	private double chemistry;
	private Date dob;
	
	// Getter & Setter for Student class
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

	public double getMath() {
		return math;
	}

	public void setMath(double math) {
		this.math = math;
	}

	public double getPhysics() {
		return physics;
	}

	public void setPhysics(double physics) {
		this.physics = physics;
	}

	public double getChemistry() {
		return chemistry;
	}

	public void setChemistry(double chemistry) {
		this.chemistry = chemistry;
	}

	public Date getDob() {
		return dob;
	}
	
	// A method to input for Student info
	public void getInfo() {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		sdf.setLenient(false);
		
		System.out.print("Enter ID: ");
		this.setId(sc.nextInt());
		
		sc.nextLine();
		
		System.out.print("Enter name: ");
		this.setName(sc.nextLine());

		System.out.print("Enter Math score: ");
		this.setMath(sc.nextDouble());

		System.out.print("Enter Physics score: ");
		this.setPhysics(sc.nextDouble());
		
		System.out.print("Enter Chemistry score: ");
		this.setChemistry(sc.nextDouble());
		
		sc.nextLine();

		System.out.print("Enter Date of Birth (dd/MM/yyyy): ");
		while (true) {
			try {
				Date input = sdf.parse(sc.nextLine());
				
				if (setDob(input)) { 
		            break;
		        }
				
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				System.out.println("Invalid format, please enter again (dd/MM/yyyy)");
			}
		}

	}
	

	// Avoid the valid Date format but in the future
	public boolean setDob(Date dob) {
		Date today = new Date();
		if (dob.after(today)) {
			System.out.println("DOB can't be in the future, please enter again (dd/MM/yyyy)");
			return false;
		} else {
			this.dob = dob;
			return true;
		}
	}

	// Method to calculate average score
	private double average_score() {
		return (this.math + this.physics + this.chemistry) / 3;
	}
	
	// Print average score
	public void average() {
		double average = average_score();
		System.out.println("Average score for " + this.name + ": " + average);
	}
	
	// Print the final grade rank
	public void grade() {
		double average = average_score();
		
		if (average >= 8) {
			System.out.println("Excellent");
		} else if (average >= 6) {
			System.out.println("Good");
		} else {
			System.out.println("Fairly");
		}
	}
	
	// Print basic info
	public void printInfo() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("ID: " + this.id);
		System.out.println("Name: " + this.name);
		System.out.println("Math: " + this.math);
		System.out.println("Physics: " + this.physics);
		System.out.println("Chemistry: " + this.chemistry);
		System.out.println("DOB: " + sdf.format(this.dob));
	}
	
	// Check if today is student's birthday
	public void checkBirthday() {
		Calendar cld = Calendar.getInstance();
		
		cld.setTime(new Date());
		int month_now = cld.get(Calendar.MONTH);
		int day_now = cld.get(Calendar.DAY_OF_MONTH);
		
		cld.setTime(this.dob);
		int month_birth = cld.get(Calendar.MONTH);
		int day_birth = cld.get(Calendar.DAY_OF_MONTH);
		
		if ((month_now == month_birth) && (day_now == day_birth)) {
			System.out.println("Happy birthday");
		} else {
			System.out.println("Not today");
		}
		
	}
	
	// Check if student is 18+
	public void checkAge() {
		Calendar cld = Calendar.getInstance();
		cld.setTime(new Date());
		int year_now = cld.get(Calendar.YEAR);
		
		cld.setTime(this.dob);
		int year_of_birth = cld.get(Calendar.YEAR);
		
		int age = year_now - year_of_birth;
		
		if (age >= 18) {
			System.out.println("Mature");
		} else {
			System.out.println("Immature");
		}
	}
}
