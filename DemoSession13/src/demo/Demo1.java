package demo;

import models.ConnectDB;

public class Demo1 {
	public static void main(String[] args) {
		if (ConnectDB.connection() == null) {
			System.out.println("Failed to connect");
		} else {
			System.out.println("Successful");
		}
	}
}
