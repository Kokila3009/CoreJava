package com.gentech.constructoroverload;

class Invoice{
	Invoice(String invoiceNumber,String customerName,String customerAddress,String customerEmail){
		System.out.println("Invoice Number :"+invoiceNumber+" , "+"Customer Name :"+customerName+" , "+"Address :"+customerAddress+" "+"Email"+customerEmail+"  ");
	}
	Invoice(String invoiceDate,String DueDate){
		System.out.println("Phone_Number :"+invoiceDate+" , "+"Age :"+DueDate+"  ");
	}
	Invoice(int SubTotal ,int tax ,int total){
		System.out.println("SubTotal :"+SubTotal+" , "+"Tax :"+tax+"  "+" Total :"+ total );
	}

}


public class constructoroverload2 {

	public class Main {
		public static void main(String[] args) {

			Invoice i1 = new Invoice("INV123", "Rajesh", "123 Main St", "rajesh@e123.com");


			Invoice i2 = new Invoice("20/07/2024","23/04/2024");  


			Invoice i3 = new Invoice(1000, 100, 1100);
		}
	}

}

