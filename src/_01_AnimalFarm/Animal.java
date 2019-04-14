package _01_AnimalFarm;

public abstract class Animal {
	public abstract void makeNoise();

	public abstract void eat();
}

class Dog extends Animal {
	public void makeNoise() {
		System.out.println("Bork");
	}

	public void eat() {
		System.out.println("The dog got fatter");
	}
}

class Cow extends Animal {
	public void makeNoise() {
		System.out.println("Mooo");
	}

	public void eat() {
		System.out.println("The cow got fatter");
	}
}

class Pig extends Animal {
	public void makeNoise() {
		System.out.println("Oink");
	}

	public void eat() {
		System.out.println("The pig got fatter");
	}
}

class Shep extends Animal {
	public void makeNoise() {
		System.out.println("Baaaaaaaaaaaaaaaaa");
	}

	public void eat() {
		System.out.println("The shep got fatter");
	}
}