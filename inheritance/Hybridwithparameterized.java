package com.gentach.inheritance;


class Vehicles5{
	 Vehicles5(int year,String color,String company) {
		int Year=year;
		String Color=color;
		String Company=company;
		System.out.println("Model_Number :" +Year);
		System.out.println("Color : "+Color);
		System.out.println("Company :"+Company);
	}
}
class FourWheeler5 extends Vehicles5{
	FourWheeler5(int year, String color, String company,int Seats,String Steering,int Milage1,String enginetype) {
		super(year, color, company);
		int SeatingCapacity=Seats;
		String SteeringType=Steering;
		int Milage=Milage1;
		String EngineType=enginetype;
		System.out.println(" SeatingCapacity :"+SeatingCapacity);
		System.out.println("SteeringType :"+SteeringType);
		System.out.println("Milage :"+Milage);
		System.out.println("EngineType :"+EngineType);
		
	}
}
class Car5 extends Vehicles5{
	Car5(int year, String color, String company,String Nav,String AC,int airbags) {
		super(year, color, company);
		String NavigationSystem=Nav;
		String AirConditioning=AC;
		int NumberOfAirBags=airbags;
		System.out.println("NavigationSystem :"+NavigationSystem);
		System.out.println("AirConditioning :"+AirConditioning);
		System.out.println("Number Of Airbags : "+NumberOfAirBags);
		
	}
}

class MorrisGarrage1 extends Car5{
	MorrisGarrage1(int year, String color, String company, String Nav, String AC, int airbags,String internet,String self,String Alerts) {
		super(year, color, company, Nav, AC, airbags);
		String Internet=internet;
		String SelfDriving=self;
		String SafetyAlerts=Alerts;
		System.out.println("Internet :"+Internet);
		System.out.println(" SelfDriving:"+SelfDriving);
		System.out.println("SafetyAlerts : "+SafetyAlerts);
		
	}
	
}

public class Hybridwithparameterized {

	public static void main(String[] args) {
	        FourWheeler5 ob = new FourWheeler5(2023, "White", "Toyota", 5, "Power", 15, "Petrol");
	        System.out.println();
	        MorrisGarrage1 ob1 = new MorrisGarrage1(2023, "White", "MorrisGarage", "Present", "Automatic", 6, "Present", "Present", "Present");
	}

}
