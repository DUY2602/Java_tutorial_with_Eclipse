package demo;

import entities.Human;
import entities.IB;
import entities.IHuman;
import entities.IHuman2;

public class Demo1 {
	public static void main(String[] args) {
		IHuman human1 = new Human();
		human1.eat();
		human1.sleep();
		human1.run();
		
		IHuman2 human2 = new Human();
		human2.run();
		
		IB human3 = new Human();
		human3.b1();
		human3.b2();
		human3.c1();
		human3.c2();
		human3.d1();
		human3.d2();
		
		/*
		 * Interface requires implemented classes to override the methods
		 * A class can implement multiple interface
		 * An interface can inherit multiple interfaces
		 * */
	}
}
