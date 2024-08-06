package com.gentech.mathodswithreturn;

class Square {
    int[] square(int a, int b) {
        int[] squares = new int[(b - a)+1]; 
        for (int j = a; j <= b; j++) {
            squares[j-a] = j * j; 
        }
        return squares;
    }
}

public class SquareOfNumbers {
    public static void main(String[] args) {
        Square ob = new Square();
        int[] a1 = ob.square(1, 10); 
        
        for (int i = 0; i < a1.length; i++) {
            System.out.print(a1[i] + " "); 
        }
    }
}
