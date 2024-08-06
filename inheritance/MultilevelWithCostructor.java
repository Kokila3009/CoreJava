package com.gentach.inheritance;

class Vehicles3{
	 Vehicles3(int year,String color,String company) {
		int Year=year;
		String Color=color;
		String Company=company;
		System.out.println("Model_Number :" +Year);
		System.out.println("Color : "+Color);
		System.out.println("Company :"+Company);
	}
	 Vehicles3(String Nav,String AC,int airbags,String name){
		 String Name=name;
			String NavigationSystem=Nav;
			String AirConditioning=AC;
			int NumberOfAirBags=airbags;
		 System.out.println("NavigationSystem :"+NavigationSystem);
			System.out.println("AirConditioning :"+AirConditioning);
			System.out.println("Number Of Airbags : "+NumberOfAirBags);
			System.out.println("Vehicle Name : "+Name);
		 
	 }
}
class FourWheeler3 extends Vehicles3{
	FourWheeler3(int year, String color, String company,int Seats,String Steering,int Milage1,String enginetype) {
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
	FourWheeler3(String Nav,String AC,int airbags,String name,String Ownername ){
		super(Nav,AC,airbags,name);
		
		System.out.println("Ownername : "+Ownername);
	}
}


public class MultilevelWithCostructor {
		public static void main(String[] args) {
			 FourWheeler3 ob1 = new FourWheeler3(2021, "Red", "Toyota", 5, "Power", 15, "Petrol");
		        System.out.println();
		        FourWheeler3 ob2 = new FourWheeler3("GPS", "Automatic", 6, "Innova", "Rajesh");
			
			
	}

}
