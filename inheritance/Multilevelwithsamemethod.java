package com.gentach.inheritance;
class Vehicles6 {
    void Attributes(int year, String color, String company) {
        int Year = year;
        String Color = color;
        String Company = company;
        System.out.println("Model_Number: " + Year);
        System.out.println("Color: " + Color);
        System.out.println("Company: " + Company);
    }
}

class FourWheeler6 extends Vehicles6 {
   
    void Attributes() {
        
        int Seats = 5;
        String Steering = "Power";
        int Milage1 = 15;
        String enginetype = "Petrol";
        System.out.println("SeatingCapacity: " + Seats);
        System.out.println("SteeringType: " + Steering);
        System.out.println("Milage: " + Milage1);
        System.out.println("EngineType: " + enginetype);
    }

   
    void Attributes(int Seats, String Steering, int Milage1, String enginetype) {
        int SeatingCapacity = Seats;
        String SteeringType = Steering;
        int Milage = Milage1;
        String EngineType = enginetype;
        System.out.println("SeatingCapacity: " + SeatingCapacity);
        System.out.println("SteeringType: " + SteeringType);
        System.out.println("Milage: " + Milage);
        System.out.println("EngineType: " + EngineType);
    }
}

class Car6 extends FourWheeler6 {
    
    void Attributes() {
        
        String Nav = "Present";
        String AC = "Automatic";
        int airbags = 6;
        System.out.println("NavigationSystem: " + Nav);
        System.out.println("AirConditioning: " + AC);
        System.out.println("Number Of Airbags: " + airbags);
    }


    void Attributes(String Nav, String AC, int airbags) {
        String NavigationSystem = Nav;
        String AirConditioning = AC;
        int NumberOfAirBags = airbags;
        System.out.println("NavigationSystem: " + NavigationSystem);
        System.out.println("AirConditioning: " + AirConditioning);
        System.out.println("Number Of Airbags: " + NumberOfAirBags);
    }
}


public class Multilevelwithsamemethod {
    public static void main(String[] args) {
        Car6 ob = new Car6();
        ob.Attributes();
        ob.Attributes(2020, "Red", "Hyundai");
        ob.Attributes("Present", "Automatic", 6);
        ob.Attributes(6, "Power Steering", 20, "Petrol");
       
    }
}

