package _01_AnimalFarm;

import java.util.ArrayList;

public class AnimalFarmRunner {
	public static void main(String[] args) {
		Dog dog = new Dog();
		Cow cow = new Cow();
		Pig pig = new Pig();
		Shep sheep = new Shep();
		ArrayList<Animal> farm = new ArrayList<Animal>();
			farm.add(dog);
			farm.add(cow);
			farm.add(pig);
			farm.add(dog);
			farm.add(cow);
			farm.add(sheep);
			for (int i = 0; i < 6; i++) {
				farm.get(i).eat();
				farm.get(i).makeNoise();
			}
	}
}
