package com.gentech.abstractclass;

abstract class Travel {

	abstract String travelMode();


	abstract String execute();
}

abstract class LandTravel extends Travel {

	String travelMode() {
		return "Land";
	}
}


class CarTravel extends LandTravel {
	String execute() {
		return "Traveling by " + travelMode() + " using a car.";
	}
}

class BicycleTravel extends LandTravel {

	String execute() {
		return "Traveling by " + travelMode() + " using a bicycle.";
	}
}



public class abstractwithmultilevel {

	public static void main(String[] args) {

		CarTravel ob = new CarTravel();
		BicycleTravel ob1 = new BicycleTravel();

		System.out.println(ob.execute());      
		System.out.println(ob1.execute());
	}

}
