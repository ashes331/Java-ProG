package ch07;

public class AbstractMethodExample {

	public static void main(String[] args) {
		
		Dog dog = new Dog();
		dog.sound();
		
		Cat cat = new Cat();
		cat.sound();
		
		animalSound(new Dog());
		animalSound(new Cat());

	}
	
	public static void animalsound(Animal animal) {
		animal.sound();
	}

}
