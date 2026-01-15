package entities;

public class Dog extends Animal{

	public Dog(String name) {
		super(name);
	}

	public Dog() {
		super();
	}

	@Override
	public void sound() {
		System.out.println(this.getName() + " says Wolf wolf");
	}
	
}
