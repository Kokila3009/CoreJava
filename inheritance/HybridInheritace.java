package com.gentach.inheritance;

class Vehicles1{
	void Attributes(int year,String color,String company) {
		int Year=year;
		String Color=color;
		String Company=company;
		System.out.println("Model_Number :" +Year);
		System.out.println("Color : "+Color);
		System.out.println("Company :"+Company);
	}
}
class FourWheeler1 extends Vehicles1{
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
class Car1 extends Vehicles1{
	void Attributes(String Nav,String AC,int airbags) {
		String NavigationSystem=Nav;
		String AirConditioning=AC;
		int NumberOfAirBags=airbags;
		System.out.println("NavigationSystem :"+NavigationSystem);
		System.out.println("AirConditioning :"+AirConditioning);
		System.out.println("Number Of Airbags : "+NumberOfAirBags);
	}
}

class MorrisGaarrage extends Car1{
	void Attributes(String internet,String self,String Alerts) {
		String Internet=internet;
		String SelfDriving=self;
		String SafetyAlerts=Alerts;
		System.out.println("Internet :"+Internet);
		System.out.println(" SelfDriving:"+SelfDriving);
		System.out.println("SafetyAlerts : "+SafetyAlerts);
		
	}
	
}
public class HybridInheritace {

	public static void main(String[] args) {
		
		FourWheeler1 ob =new FourWheeler1();
		
		MorrisGaarrage ob1=new MorrisGaarrage();
		
		ob.Attributes(2023, "White", "MorrisGaarrage");
		ob1.Attributes("Present", "Automatic", 6);
		ob.Attributes(6, "Power Steering",20,"Petrol");
		ob1.Attributes("Present","Present", "Present");
	}

}
