package com.lab.lab2;

import java.util.Scanner;

// Classe per modellare uno stack con capacita` finita di numeri
// interi
public class Stack
{
    private int[] stack; // chiediamo stack != null. 

    //non fissiamo subito una massima dimensione per tutti gli stack
    private int size;    // 0 <= size <= stack.length

    // crea uno stack con capacità iniziale specificata
    public Stack(int capacity)
    {
        assert capacity >= 0: 
            "la capacita' dello stack doveva essere >=0 invece vale" + capacity;
        stack = new int[capacity];
        //adesso fissiamo: massimo numero elementi stack = capacity
        size = 0;
    }

    // e` conveniente mettere a disposizione due operazioni per sapere
    // se lo stack e` vuoto o pieno. Cio` consente all'utilizzatore
    // dello stack di sapere quando un'operazione push/pop e` lecita
    public boolean empty()
    { return size == 0; }

    public boolean full()
    { return size == stack.length; }

    // inserisce un nuovo elemento x in cima allo stack
    public void push(int x)
    {
        assert !full():  "tentativo push in uno stack pieno di elementi: "  + size;
        stack[size] = x; 
        size++; 
    }

    // estrae e ritorna l'elemento in cima allo stack
    public int pop()
    {
        assert !empty(): "tentativo pop da uno stack vuoto";
        --size; 
        return stack[size];
    }

    // definiamo un metodo equals che controlla se due stack sono 
    // identici in tutto: stessa capienza, stesso numero size di elementi
    // utilizzati, stessi elementi tra quelli di indice 0, ..., size-1.
    public boolean equals(Stack altroStack)
    {
        if (this.size != altroStack.size) 
            return false;
        if (this.stack.length != altroStack.stack.length) 
            return false;

        int i = 0;
        while (i < size) {
            if ((this.stack)[i] != (altroStack.stack)[i]) 
                return false;
            i++;
        }

        return true;
    }

    public static void main(String[] args) {
        Stack calc = new Stack(10);

        String instructions = "32*4+";
        int ix = 0;
        while (ix < instructions.length()){
            char c = instructions.charAt(ix);
            if (c >= '0' && c <= '9'){
                calc.push(c - '0');
            }else if (c == '+'){
                int num1 = calc.pop();
                int num2 = calc.pop();
                calc.push(num1 + num2);
            } else if (c == '*') {
                int num1 = calc.pop();
                int num2 = calc.pop();
                calc.push(num1 * num2);
            } else if (c == '-') {
                int num2 = calc.pop();
                int num1 = calc.pop();
                calc.push(num1 - num2);
            } else if (c == '/'){
                int num2 = calc.pop();
                int num1 = calc.pop();
                calc.push(num1 / num2);
            } else if (c == '%'){
                int num2 = calc.pop();
                int num1 = calc.pop();
                calc.push(num1 % num2);
            } /*else if (c == '#') {
                print();
            }*/
            ix++;
        }
        int result = calc.pop();

        Stack calc2 = new Stack(9);

        String instructions2 = "32*4+";
        ix = 0;
        while (ix < instructions2.length()){
            char c = instructions2.charAt(ix);
            if (c >= '0' && c <= '9'){
                calc2.push(c - '0');
            }else if (c == '+'){
                int num1 = calc2.pop();
                int num2 = calc2.pop();
                calc2.push(num1 + num2);
            } else if (c == '*') {
                int num1 = calc2.pop();
                int num2 = calc2.pop();
                calc2.push(num1 * num2);
            } else if (c == '-') {
                int num2 = calc2.pop();
                int num1 = calc2.pop();
                calc2.push(num1 - num2);
            } else if (c == '/'){
                int num2 = calc2.pop();
                int num1 = calc2.pop();
                calc2.push(num1 / num2);
            } else if (c == '%'){
                int num2 = calc2.pop();
                int num1 = calc2.pop();
                calc2.push(num1 % num2);
            } /*else if (c == '#') {
                print();
            }*/
            ix++;
        }
        int result2 = calc2.pop();

        System.out.println(calc.equals(calc2));



    }
}
