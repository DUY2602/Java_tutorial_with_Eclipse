package demo;

import entities.Animal;
import entities.Cat;
import entities.Dog;
import entities.Duck;

public class Demo4 {
	public static void main(String[] args) {
		Animal cat = new Cat("Méo");
		cat.sound();
		
		Animal dog = new Dog("Mila");
		dog.sound();
		
		Animal duck = new Duck("Donald");
		duck.sound();
		
		Animal[] animals = {
				new Cat("Cat 1"), new Dog("Dog 1"), new Duck("Duck 1")
		};
		
		for (Animal animal : animals) {
			animal.sound();
		}
	}
}
