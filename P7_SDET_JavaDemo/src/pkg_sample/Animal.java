package pkg_sample;

class Animal {

	public void makeSound() {
		System.out.println("The animal makes a sound.");
	}
}

class Dog extends Animal {
	public void makeSound() {
		System.out.println("DOG ");
	}
}

class Cat extends Animal {
	public void makeSound() {
		System.out.println("Cat ");
	}

	public static void main(String[] args) {
		Animal[] ani = { new Dog(), new Cat() };
		for (Animal a : ani) {
			a.makeSound();
		}

	}

}