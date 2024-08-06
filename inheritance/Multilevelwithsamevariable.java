package com.gentach.inheritance;

class Patient{
	String PatientName;
	void show() {
		System.out.println(PatientName+" : Its Patient Class");
	}
}
class Hospital extends Patient{
	
	Hospital(String name){
		String PatientName=super.PatientName=name;
	}
	void display() {
		System.out.println(PatientName+" : Its Hospital Class");
	}
	
}
public class Multilevelwithsamevariable{
	public static void main(String args[]) {
		Hospital ob=new Hospital ("Ram");
		ob.display();
		ob.show();
	}
}

