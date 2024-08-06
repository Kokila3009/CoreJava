package com.gentech.abstractclass;
abstract class Animal {
    abstract void makeSound();
    
}

class Dog extends Animal {
   
    void makeSound() {
        System.out.println("dog : Bow Bow");
    }
}



public class abstractwithinstanceblock {

	public static void main(String[] args) {
		
		  Animal myDog = new Dog();
	        myDog.makeSound();
	        
	}

}
