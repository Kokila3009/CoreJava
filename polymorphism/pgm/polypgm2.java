package com.polymorphism.pgm;
abstract class transaction{
	abstract void Process();
}
class Deposit extends transaction{

	@Override
	void Process() {
		System.out.println("Processing Deposit Tranaction"); 

	}

}
class Withdrawl extends transaction{

	@Override
	void Process() {
		System.out.println("Processing Withdrawl Transaction");		
	}

}
class Transfer extends transaction{

	@Override
	void Process() {
		System.out.println("Processing Transfering");		
	}

}

public class polypgm2 {

	public static void main(String[] args) {
		Deposit ob= new Deposit();
		ob.Process();
		Withdrawl ob1 = new Withdrawl();
		ob1.Process();
		Transfer ob2 = new Transfer();
		ob2.Process();
		

	}

}
