package demo;

import java.util.Scanner;

public class Demo6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String key = "";
		do {
			System.out.println("1. Menu 1");
			System.out.println("2. Menu 2");
			System.out.println("3. Menu 3");
			System.out.print("Choose menu: ");
			int menu = sc.nextInt();
			if(menu == 1) {
				menu1();
			} else if(menu == 2) {
				menu2();
			} else if(menu == 3) {
				menu3();
			} else {
				System.out.println("Menu invalid!");
			}
			System.out.print("Press y/Y to continue: ");
			sc.nextLine();
			key = sc.nextLine();
		} while(key.equalsIgnoreCase("y"));
	}
	
	public static void menu1() {
		System.out.println("Menu 1 is selected");
	}
	
	public static void menu2() {
		System.out.println("Menu 2 is selected");
	}
	
	public static void menu3() {
		System.out.println("Menu 3 is selected");
	}
}
