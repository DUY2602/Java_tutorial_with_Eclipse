package demo;

import java.util.Scanner;

public class Demo7 {
	/*
	 * Create a program that allow user to enter 2 integers m & n
	 * neu nguoi dung nhap m >= n thi yeu cau nguoi dung nhap lai
	 * 
	 * If m < n then carry out the menu functions 
	 * 1. tinh tong cac so trong khoang tu m - n
	 * 2. tinh tong cac so chan trong khoang tu m - n
	 * 3. dem xem co bao nhieu so chan, bao nhieu so le trong khoang tu m - n
	 * 4. liet ke cac so nguyen to trong khoang tu m den n. so nguyen to la so chia het cho 1 va 
	 * chinh no
	 * nhap y/Y de cho phep nguoi dung chon lai menu khac
	 * */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m, n;
		do {
			System.out.println("nhap m < n");
			System.out.print("m: ");
			m = sc.nextInt();
			System.out.print("n: ");
			n = sc.nextInt();
		} while(m >= n);
		
		String key = "";
		do {
			System.out.println("1. Menu 1");
			System.out.println("2. Menu 2");
			System.out.println("3. Menu 3");
			System.out.println("4. Menu 4");
			System.out.print("Choose menu: ");
			int menu = sc.nextInt();
			if(menu == 1) {
				menu1(m, n);
			} else if(menu == 2) {
				menu2(m, n);
			} else if(menu == 3) {
				menu3(m, n);
			}  else if(menu == 4) {
				menu4(m ,n);
			}	else {
				System.out.println("Menu invalid!");
			}
			System.out.print("Press y/Y to continue: ");
			sc.nextLine();
			key = sc.nextLine();
		} while(key.equalsIgnoreCase("y"));				// Accept both Y or y
		
	}
	
	public static void menu1(int m, int n) {
		int sum = 0;
		for(int i = m; i <= n; i++) {
			sum += i;
		}
		System.out.println("Sum numbers from m to n: " + sum);
	}
	
	public static void menu2(int m, int n) {
		int sum = 0;
		for(int i = m; i <= n; i++) {
			if (i % 2 == 0) {
				sum += i;
			}
		}
		System.out.println("Sum even numbers from m to n: " + sum);
	}
	
	public static void menu3(int m, int n) {
		int even = 0;
		int odd = 0;
		for(int i = m; i <= n; i++) {
			if (i % 2 == 0) {
				even += 1;
			} else {
				odd += 1;
			}
		}
		System.out.println("There are " + even + " even numbers and " + odd + " odd numbers");
	}
	
	public static void menu4(int m, int n) {
		String prime_nums = "";
		for(int i = m; i <= n; i++) {
			boolean isPrime = true;
			
			for(int j = 2; j < i; j++) {
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}
			
			if(isPrime) {
				prime_nums += String.valueOf(i) + " ";
			}
		}
		System.out.println("Prime numbers from " + m + " to " + n + " are: " + prime_nums);
	}
}
