package entities;

public class Human implements IHuman, IHuman2, IB{

	@Override
	public void eat() {
		System.out.println("Eat");
	}

	@Override
	public void sleep() {
		System.out.println("Sleep");
	}

	@Override
	public void run() {
		System.out.println("Run");
	}

	@Override
	public void b1() {
		System.out.println("B1");
	}

	@Override
	public void b2() {
		System.out.println("B2");
	}

	@Override
	public void c1() {
		System.out.println("C1");
	}

	@Override
	public void c2() {
		System.out.println("C2");
	}

	@Override
	public void d1() {
		System.out.println("D1");
	}

	@Override
	public void d2() {
		System.out.println("D2");
	}
	
}
