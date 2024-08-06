package com.polymorphism.pgm;
abstract class MathematicalOperations{
	abstract void Operation(int a,int b);
			
}
class Addition  extends MathematicalOperations{

	@Override
	void Operation(int a,int b) {
		int res=a+b;
		System.out.println(" Addition Result is :"+res);
		
	}
	
}
class Substraction extends MathematicalOperations{

	@Override
	void Operation(int a, int b) {
		int res=b-a;
		System.out.println(" Substraction Result is :"+res);
		
	}
	
}
class Multiplication extends MathematicalOperations{

	@Override
	void Operation(int a, int b) {
		int res=a*b;
		System.out.println(" Multiplication Result is :"+res);
		
	}
	
}
class Division extends MathematicalOperations{

	@Override
	void Operation(int a, int b) {
		float res=a/b;
		System.out.println(" Division Result is :"+res);
		
	}
	
}
class Modulus extends MathematicalOperations{

	@Override
	void Operation(int a, int b) {
		int res=a%b;
		System.out.println(" Multiplication Result is :"+res);
		
	}
	
}
public class polypgm4 {

	public static void main(String[] args) {
		 Addition  ob = new  Addition ();
		 ob.Operation(450, 385);
		 Substraction ob1 =new Substraction();
		 ob1.Operation(4875, 8757);
		 Multiplication ob2 = new Multiplication();
		 ob2.Operation(75, 76);
		 Division ob3=new Division();
		 ob3.Operation(724, 12);
		 Modulus ob4 = new Modulus();
		 ob4.Operation(94, 3);

	}

}
