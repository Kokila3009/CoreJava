package com.gentech.mathodswithreturn;



class DiagonalElements {
    short[] getDiagonal(short[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int size = rows;
        
        short[] diagonal = new short[size];
        
        for (int i = 0; i < size; i++) {
            diagonal[i] = matrix[i][i];
        }
        
        return diagonal;
    }
}

public class diagonal {
    public static void main(String[] args) {
        DiagonalElements ob = new DiagonalElements();
        
        short[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        short[] diagonal = ob.getDiagonal(matrix);
        
        for (int i : diagonal) {
            System.out.print(i + " ");
        }
    }
}

