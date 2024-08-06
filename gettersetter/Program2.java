package com.gentech.gettersetter;
class Animals1{

	String Animal_type;
	String Animal_Species;
	AnimalType ob1=new AnimalType();
	static class AnimalType{
		static int lifespan=20;
		static String Food="Milk,Meat";
		void show() {
		
		System.out.println(lifespan+" "+Food);
		
		
		}
	}
}
public class Program2 {

	public static void main(String[] args) {
		Animals1 ob =  new Animals1();
		String a = ob.Animal_type="Domestic";
		String b=ob.Animal_Species="Dog";
		ob.ob1.show();
		System.out.println(ob.Animal_type+" "+ob.Animal_Species);
		
		
		

	}



}
