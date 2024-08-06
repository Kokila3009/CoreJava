package com.gentech.gettersetter;

class Profile1 {
    String Name;
    String Email;
    int Phone_Number;
    private Account_Credentials ob1 = new Account_Credentials();
    private History ob2 = new History();

    void show() {
        System.out.println("Name: " + Name);
        System.out.println("Email: " + Email);
        System.out.println("Phone Number: " + Phone_Number);
        System.out.println("Account Number: " + ob1.getAccountNumber());
        System.out.println("Credited Amount: " + ob1.getCreditedAmount());
        System.out.println("Previous Payment Amount: " + ob2.getPreviousPaymentAmount());
        System.out.println("Recipient Name: " + ob2.getRecepientName());
    }

    public Account_Credentials getOb1() {
		return ob1;
	}

	public void setOb1(Account_Credentials ob1) {
		this.ob1 = ob1;
	}

	private class Account_Credentials {
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

    private class History {
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

public class Pract {
    public static void main(String[] args) {
        Profile1 ob = new Profile1();
        // Accessing inner class methods
        ob.ob1.setAccountNumber(937845);
        ob.ob1.setCreditedAmount(9000000);
        ob.ob2.setPreviousPaymentAmount(984733);
        ob.ob2.setRecepientName("Kokila");
        ob.Name = "Rajesh";
        ob.Email = "kokilakr@gmail.com";
        ob.Phone_Number = 93787673;
        
        // Display the values
        ob.show();
    }
}
