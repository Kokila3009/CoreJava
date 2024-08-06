package com.gentach.inheritance;

class Vehicles2{
	void Attributes(int year,String color,String company) {
		int Year=year;
		String Color=color;
		String Company=company;
		System.out.println("Model_Number :" +Year);
		System.out.println("Color : "+Color);
		System.out.println("Company :"+Company);
	}
}
class FourWheeler2 extends Vehicles1{
	void Attributes(int Seats,String Steering,int Milage1,String enginetype){
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
class Car2 extends Vehicles2{
	void Attributes(String Nav,String AC,int airbags) {
		String NavigationSystem=Nav;
		String AirConditioning=AC;
		int NumberOfAirBags=airbags;
		System.out.println("NavigationSystem :"+NavigationSystem);
		System.out.println("AirConditioning :"+AirConditioning);
		System.out.println("Number Of Airbags : "+NumberOfAirBags);
	}
}

		
		


public class HeirarchicalInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car2 ob = new Car2();
		FourWheeler2 ob1 = new FourWheeler2();
		ob.Attributes(2020, "Red", "Hyundai");
		ob.Attributes("Present", "Automatic", 6);
		ob1.Attributes(6, "Power Steering",20,"Petrol");
	}

}
