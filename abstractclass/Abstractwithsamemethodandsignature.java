package com.gentech.abstractclass;
class DisplayCollege {
	String name;
	DisplayCollege(String name){
		System.out.println("Hi");
		
	}

    void display(String name) {
        System.out.println("Parent Class: " + name);
    }

	
}

class DispArea extends DisplayCollege {
		

    DispArea(String name) {
    	
		super(name);
	
        super.display(name);

	}

	void display(String name) {
        System.out.println("Sub Class: " + name);
    }
}

class DispLandmark extends DispArea {
    DispLandmark(String name){
        super(name);
        super.display(name);
    }
    void display(String name){
        System.out.println(" DispLandMark Class: " + name);
    }
}

public class Abstractwithsamemethodandsignature {

	public static void main(String[] args) {
		
		 DispLandmark dispLandmark = new DispLandmark("Bangalore");
	        dispLandmark.display("City Engineering COllege");
	}

}
