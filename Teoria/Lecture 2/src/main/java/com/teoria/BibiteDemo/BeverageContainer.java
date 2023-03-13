package com.teoria.BibiteDemo;

import java.util.Arrays;

public class BeverageContainer {
    int fillPointer = 0;
    String[] beverageList = new String[20];
    public String[] getBeverageList(){
        return beverageList;
    }
    private void setBeverageList(String[] bvl){
        beverageList = bvl;
    }

    private void pushIntoBeverageList(String beverage){
        if (fillPointer<beverageList.length){
            beverageList[fillPointer] = beverage;
            fillPointer++;
        }
    }

    @Override
    public String toString() {
        return "BeverageContainer{" +
                "beverageList=" + Arrays.toString(beverageList) +
                '}';
    }

    public static void main(String[] args) {
        BeverageContainer bvgC = new BeverageContainer();
        bvgC.pushIntoBeverageList("Coke");
        bvgC.pushIntoBeverageList("Fanta");

        System.out.println(bvgC);
    }
}
