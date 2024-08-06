package com.polymorphism.pgm;
abstract class Animal {
	abstract void Sound();
}

class Dog extends Animal {
	@Override
	void Sound() {
		System.out.println("Bow Bow Bow");
		System.out.println("The dog barks.");
	}
}

class Cat extends Animal {
	@Override
	void Sound() {
		System.out.println("Meow Meow Meow");
		System.out.println("The cat meows.");
	}
}

class Cow extends Animal {
	@Override
	void Sound() {
		System.out.println("The cow moos.");
	}
}

class Lion extends Animal {
	@Override
	void Sound() {
		System.out.println("The lion roars.");
	}
}

class Sheep extends Animal {
	@Override
	void Sound() {
		System.out.println("The sheep baas.");
	}
}

class Duck extends Animal {
	@Override
	void Sound() {
		System.out.println("The duck quacks.");
	}
}

public class polypgm5 {
	public static void main(String[] args) {
		Dog ob=new Dog();
		ob.Sound();
		Cat ob1=new Cat();
		ob1.Sound();
		Cow ob2=new Cow();
		ob2.Sound();
		Lion ob3=new Lion();
		ob3.Sound();
		Sheep ob4= new Sheep();
		ob4.Sound();
		Duck ob5=new Duck();
		ob5.Sound();


	}
}
