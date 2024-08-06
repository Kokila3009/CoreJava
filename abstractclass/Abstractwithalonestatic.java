package com.gentech.abstractclass;


abstract class Display {
    static {
        System.out.println("Hi");
    }

    static void displayMessage() {
        System.out.println("Hi Welcome to Full Stack Development Course");
    }
}


public class Abstractwithalonestatic {

	public static void main(String[] args) {
		
		Display.displayMessage();
	}

}
