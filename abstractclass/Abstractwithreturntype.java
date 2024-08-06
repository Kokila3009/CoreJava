package com.gentech.abstractclass;
abstract class Numbers {
  
    int[] Numberslist() {
        int[] numbers = new int[50];
        for (int i = 0; i < 50; i++) {
            numbers[i] = i + 1;
        }
        return numbers;
    }
}

public class Abstractwithreturntype {
    public static void main(String[] args) {
        Numbers numbers = new Numbers() {}; 
        
        int[] result = numbers.Numberslist();
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
