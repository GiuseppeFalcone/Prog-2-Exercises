package com.lab.uno;

import java.util.Arrays;

public class Calculator {
    private int[] instructionSet;
    private int fillPointer;

    public Calculator(){
        instructionSet = new int[50];
        fillPointer = 0;
    }

    private void push(int num){
        instructionSet[fillPointer] = num;
        ++fillPointer;
    }

    private int pop(){
        --fillPointer;
        return instructionSet[fillPointer];
    }

    public int exec(String instructions){
        for(int ix = 0; ix < instructions.length(); ix++){
            char c = instructions.charAt(ix);
            if (c >= '0' && c <= '9'){
                push(c - '0');
            }else if (c == '+'){
                int num1 = pop();
                int num2 = pop();
                push(num1 + num2);
            } else if (c == '*') {
                int num1 = pop();
                int num2 = pop();
                push(num1 * num2);
            } else if (c == '-') {
                int num2 = pop();
                int num1 = pop();
                push(num1 - num2);
            } else if (c == '/'){
                int num2 = pop();
                int num1 = pop();
                push(num1 / num2);
            } else if (c == '%'){
                int num2 = pop();
                int num1 = pop();
                push(num1 % num2);
            } else if (c == '#') {
                print();
            }
            /*
            switch(c){
                default -> throw new IllegalStateException("Unexpected value: " + c);
                case c >= '0' &&  c <= '9':
                    push(c - '0');
                case c == '+':
                    int num1 = pop();
                    int num2 = pop();
                    push(num1 + num2);
            }
            */
        }
        return pop();
    }

    private void print(){
        System.out.println("The stack has size: "+ fillPointer + "\nIt contains" + Arrays.toString(Arrays.copyOfRange(instructionSet, 0, fillPointer)));
    }
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("2+4 = " + calculator.exec("24+"));
        System.out.println("2*4 = " + calculator.exec("24*"));
        System.out.println("2-4 = " + calculator.exec("24-"));
        System.out.println("2222222222********* = " + calculator.exec("2222222222*********"));

        // Es 2
        System.out.println("(15*16)*17 = " + calculator.exec("35*44**98+*"));
        System.out.println("10! = " + calculator.exec("5298765432*********"));

        // Es 3
        System.out.println("4/2 = " + calculator.exec("42/"));
        System.out.println("5/2 = " + calculator.exec("52%"));

        calculator.print();

    }


}
