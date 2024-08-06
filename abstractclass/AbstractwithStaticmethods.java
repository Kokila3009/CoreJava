package com.gentech.abstractclass;


abstract class Transportation {
    static void displayTransportationInfo() {
        System.out.println("Transportation is essential for moving from one place to another.");
    }

    static void displayTransportationType(String type) {
        System.out.println("Transportation Type: " + type);
    }

    
}


public class AbstractwithStaticmethods {

	
		 public static void main(String[] args) {
		        Transportation.displayTransportationInfo();
		        Transportation.displayTransportationType("Various");
		       
	}

}
