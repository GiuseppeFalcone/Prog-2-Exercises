package com.lab.lab2;

public class MutablePoint {
    private int xCor;
    private int yCor;
    public int getXCor(){
        return xCor;
    }

    private void setXCor(int xInput){
        this.xCor = xInput;
    }

    public int getYCor(){
        return yCor;
    }

    private void setYCor(int yInput){
        this.yCor = yInput;
    }

    public MutablePoint(int xInput, int yInput){
        this.xCor = xInput;
        this.yCor = yInput;
    }

    public void translate(int xInput, int yInput){
        setXCor(xCor + xInput);
        setYCor(yCor + yInput);

        System.out.println("New Coordinates for Translated point P(" + xCor + ','+ yCor + ')');
    }

    public void distance(int xInput, int yInput){

    }




}
