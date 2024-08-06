package com.gentach.inheritance;


class Vehicles4{
	 Vehicles4(int year,String color,String company) {
		int Year=year;
		String Color=color;
		String Company=company;
		System.out.println("Model_Number :" +Year);
		System.out.println("Color : "+Color);
		System.out.println("Company :"+Company);
	}
}
class FourWheeler4 extends Vehicles4{
	FourWheeler4(int year, String color, String company,int Seats,String Steering,int Milage1,String enginetype) {
		super(year, color, company);
		int SeatingCapacity=Seats;
		String SteeringType=Steering;
		int Milage=Milage1;
		String EngineType=enginetype;
		System.out.println("SeatingCapacity :"+SeatingCapacity);
		System.out.println("SteeringType :"+SteeringType);
		System.out.println("Milage :"+Milage);
		System.out.println("EngineType :"+EngineType);
		
	}
}

public class Multileleparameterized {

	public static void main(String[] args) {
	
		 FourWheeler4 ob1 = new FourWheeler4(2021, "Red", "Toyota", 5, "Power", 15, "Petrol");
	       
		
	}

}
