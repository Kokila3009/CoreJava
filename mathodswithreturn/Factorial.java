package com.gentech.mathodswithreturn;
class Factorial1{
	double factorial(double a) {
		double fact=1;
		for(double i=a;i>=1;i--) {
			 fact=fact*i;
			 
		}
		
		return fact;
		
	}
}
public class Factorial {

	public static void main(String[] args) {
		
		Factorial1 on =new Factorial1();
		double d = on.factorial(4);
		System.out.print(d);
		
	}
	

}
