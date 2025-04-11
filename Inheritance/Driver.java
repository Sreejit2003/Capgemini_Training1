package Inheritance;

public class Driver {
	public static void main(String[] args) {
		Animal animal = new Animal();
		System.out.println(animal.a);
		
		Dog dog = new Dog();
		System.out.println(dog.a);
		
		System.out.println(animal.a);
		System.out.println(animal.x);
		
		
	}
}
