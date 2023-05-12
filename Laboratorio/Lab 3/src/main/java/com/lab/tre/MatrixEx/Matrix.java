package com.lab.tre.MatrixEx;

public class Matrix {
    private int[][] matrix;
    public int getMatrix(int row, int column) {
        return matrix[row][column];
    }

    public boolean setMatrix(int row, int colum, int elem) {
        matrix[row][colum] = elem;
        return true;
    }



    public Matrix (int rows, int columns){
        matrix = new int[rows][columns];
    }

    public int rows(){
        return matrix.length;
    }

    public int columns(){
        return matrix[].length;
    }

    public int[][] add (int[][] matrixOne, int[][] matrixTwo){

    }
}
