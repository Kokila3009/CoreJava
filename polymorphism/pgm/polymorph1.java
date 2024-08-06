package com.polymorphism.pgm;
abstract class Vehicle{
	abstract void move();
}
class Car extends Vehicle{

	@Override
	void move() {
		System.out.println("Car Drives On the Road");

	}


}
class Aeroplane extends Vehicle{

	@Override
	void move() {
		System.out.println("Aeroplane Flies in the Sky");

	}

}
class Boat extends Vehicle{

	@Override
	void move() {
		System.out.println("Boat Sails on the Water");

	}

}
class Bicycle extends Vehicle{

	@Override
	void move() {
		System.out.println("Bicycle Pedals on the road");

	}

}
public class polymorph1 {

	public static void main(String[] args) {
		Car ob =new Car();
		ob.move();
		Aeroplane  ob1 = new Aeroplane ();
		ob1.move();
		Boat ob2= new Boat();
		ob2.move();
		Bicycle ob3=new Bicycle();
		ob3.move();	


	}

}
