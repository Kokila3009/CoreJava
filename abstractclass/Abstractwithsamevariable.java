package com.gentech.abstractclass;
class Student {

	String bookName;
	void show() {
		System.out.println("Book Name in Student class :"+bookName);
	}
}
class Library extends Student {
	String bookName;
	Library(String name){
		super.bookName=name;
	}
	void display(){
		System.out.println("book Name in Library class :"+bookName);
	}
}
class Bookshelf extends Library{
	String bookName;
	Bookshelf(String name){
		super(name);
		super.bookName = name;
	}
	void displayBook() {
		System.out.println("book Name in Bookshelf class :"+bookName);
	}
}
public class Abstractwithsamevariable {

	public static void main(String[] args) {

		Bookshelf o = new Bookshelf("Hands-On Machine Learning with Scikit-Learn, Keras, and TensorFlow: Concepts, Tools, and Techniques to Build Intelligent Systems, Third Edition");
		o.bookName="Machine Learning";
		o.show();
		o.display();
		o.displayBook();
	}

}
