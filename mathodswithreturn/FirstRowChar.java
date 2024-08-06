package com.gentech.mathodswithreturn;

class FirstRow {
	char[][] CharRow(char[][] a) {
		char b[][] = new char[a.length][a[0].length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				b[i][j] = a[0][j]; 
			}
		}
		return b;
	}
}

public class FirstRowChar {
	public static void main(String[] args) {
		FirstRow ob = new FirstRow();
		char c[][] = {{'a', 'c', 's'}, {'q', 'w', 'r'}};
		char[][] res = ob.CharRow(c);



		for (int j = 0; j < res[0].length; j++) {
			System.out.print(res[0][j] + " "); 
		}
		System.out.println(); 
	}
}

