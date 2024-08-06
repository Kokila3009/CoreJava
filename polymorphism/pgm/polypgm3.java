package com.polymorphism.pgm;
abstract class paymentmethods{
	abstract void PaymentMethod();

}
class Googlepay extends paymentmethods{

	@Override
	void PaymentMethod() {
		System.out.println("Payment Through GooglePay");

	}

}
class Phonepay extends paymentmethods{

	@Override
	void PaymentMethod() {
		System.out.println("Payment Through PhonePay");		
	}

}
class Cash extends paymentmethods{

	@Override
	void PaymentMethod() {
		System.out.println("Payment Through Cash");
	}
	
}
public class polypgm3 {

	public static void main(String[] args) {
		Googlepay ob = new Googlepay();
		ob.PaymentMethod();
		Phonepay ob1 = new Phonepay();
		ob1.PaymentMethod();
		Cash ob2 = new Cash();
		ob2.PaymentMethod();
		
	}

}
