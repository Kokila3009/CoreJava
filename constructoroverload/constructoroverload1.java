package com.gentech.constructoroverload;
class UserProfile{
	UserProfile(String name,String userId,String gender){
		System.out.println("User_name :"+name+" , "+"User_Id :"+userId+" , "+"Gender :"+gender+" ");
	}
	UserProfile(int number,int age){
		System.out.println("Phone_Number :"+number+" , "+"Age :"+age+"  ");
	}
	UserProfile(int salary,String email){
		System.out.println("Salary :"+salary+" , "+"Email_Id :"+email+"  ");
	}

}


public class constructoroverload1 {

	public static void main(String[] args) {
		UserProfile u1=new UserProfile("Rajesh","1CE20GHU012","Male");
		UserProfile u2=new UserProfile(978776733,35);
		UserProfile u3=new UserProfile(30000,"rajesh@gmail.com");


	}

}
