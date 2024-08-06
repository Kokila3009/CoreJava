package com.gentech.mathodswithreturn;

class StringConcatenation {
    String concatenateStrings(String[] array) {
        String result = ""; 
        
        for (String str : array) {
            result += str; 
        }
        
        return result;
    }
}

public class Concat {
    public static void main(String[] args) {
        StringConcatenation ob = new StringConcatenation();
        
        String[] array = {"Hello", " ", "World", "!", " Welcome", " to", " Java"};
        
        String result = ob.concatenateStrings(array);
        
        System.out.println(result);
    }
}

