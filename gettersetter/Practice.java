package com.gentech.gettersetter;
class Profile1{
	String Name;
	String Email;
	int Phone_Number;
	private	Account_Credentials ob1=new Account_Credentials();
	private	History ob2=new History();
	void show() {
		System.out.println("Name: " + Name);
		System.out.println("Email: " + Email);
		System.out.println("Phone Number: " + Phone_Number);
		System.out.println("Account Number: " + getOb1().getAccountNumber());
		System.out.println("Credited Amount: " + getOb1().getCreditedAmount());
		System.out.println("Previous Payment Amount: " + ob2.getPreviousPaymentAmount());
		System.out.println("Recipient Name: " + ob2.getRecepientName());
	}
	
	private class Account_Credentials{

		private int AccountNumber;
		private int CreditedAmount;
		public int getAccountNumber() {
			return AccountNumber;
		}
		public void setAccountNumber(int accountNumber) {
			AccountNumber = accountNumber;
		}
		public int getCreditedAmount() {
			return CreditedAmount;
		}
		public void setCreditedAmount(int creditedAmount) {
			CreditedAmount = creditedAmount;
		}
	}
	private class History{
		private int PreviousPaymentAmount;
		private String RecepientName;
		public int getPreviousPaymentAmount() {
			return PreviousPaymentAmount;
		}
		public void setPreviousPaymentAmount(int previousPaymentAmount) {
			PreviousPaymentAmount = previousPaymentAmount;
		}
		public String getRecepientName() {
			return RecepientName;
		}
		public void setRecepientName(String recepientName) {
			RecepientName = recepientName;
		}
	}
public class Practice {

	public static void main(String[] args) {
		Profile1 ob=new Profile1();
		ob.getOb1().setAccountNumber(937845);
		ob.ob2.setPreviousPaymentAmount(984733);
		ob.ob2.setRecepientName("Kokila");
		ob.getOb1().setCreditedAmount(9000000);
		String a=ob.Name="Rajesh";
		String b=ob.Email="kokilakr@gmail.com";
		int c = ob.Phone_Number=93787673;
		ob.show();
		
	}
		
 
	}


}
