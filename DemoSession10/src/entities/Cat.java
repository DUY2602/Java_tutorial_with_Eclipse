package entities;

public class Cat extends Animal{

	public Cat(String name) {
		super(name);
	}

	public Cat() {
		
	}

	@Override
	public void sound() {
		System.out.println(this.getName() + " says Meow meow");
	}
}
