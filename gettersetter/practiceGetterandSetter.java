package com.gentech.gettersetter;
class Profile{
	String Name;
	String Email;
	int Phone_Number;
	private	Account_Credentials ob1=new Account_Credentials();

	private	History ob2=new History();



	public void setAccountNumber(int accountNumber) {
		ob1.setAccountNumber(accountNumber);
	}

	public int getAccountNumber() {
		return ob1.getAccountNumber();
	}

	public void setCreditedAmount(int creditedAmount) {
		ob1.setCreditedAmount(creditedAmount);
	}

	public int getCreditedAmount() {
		return ob1.getCreditedAmount();
	}
	public void setRecepientName(String recepientName) {
		ob2.setRecepientName(recepientName);
	}

	public String getRecepientName() {
		return ob2.getRecepientName();
	}
	public void setPreviousPaymentAmount(int previousPaymentAmount) {
        ob2.setPreviousPaymentAmount(previousPaymentAmount);
    }

    public int getPreviousPaymentAmount() {
        return ob2.getPreviousPaymentAmount();
    }
	void show() {
		System.out.println("Name: " + Name);
		System.out.println("Email: " + Email);
		System.out.println("Phone Number: " + Phone_Number);
		System.out.println("Account Number: " + ob1.getAccountNumber());
		System.out.println("Credited Amount: " + ob1.getCreditedAmount());
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


}
public class practiceGetterandSetter {

	public static void main(String[] args) {
		Profile ob3=new Profile();
		String Name=ob3.Name="Kokila";
		String Email=ob3.Email="kokila@gmail.com";
		int a =ob3.Phone_Number=97655666;
		ob3.setAccountNumber(987467576);
		ob3.setCreditedAmount(9000000);
		ob3.setPreviousPaymentAmount(976566);
		ob3.setRecepientName("Rajesh");
        ob3.show();
       

	}

}
