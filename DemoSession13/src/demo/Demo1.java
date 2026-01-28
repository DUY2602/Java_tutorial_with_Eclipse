package demo;

import models.ConnectDB;

public class Demo1 {
	public static void main(String[] args) {
		if(ConnectDB.connection() == null) {
			System.out.println("Ket noi that bai");
		} else {
			System.out.println("Ket noi thanh cong");
		}
	}
}
