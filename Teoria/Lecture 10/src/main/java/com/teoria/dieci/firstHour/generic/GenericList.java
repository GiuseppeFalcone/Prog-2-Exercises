package com.teoria.dieci.firstHour.generic;

public class GenericList <T> {
    private GenericNode<T> first;

    public GenericList() {
        first = null;
    }

    public boolean empty() {
        return first == null;
    }

    /* Al posto di GenericNode<T> posso scrivere GenericNode< >, purche' Java sia in grado di dedurre in modo unico il valore T */
    public void push(T elem) {
        first = new GenericNode<T>(elem, first);
    }

    public T pop() {
        assert !empty() : "pop on empty stack";
        T x = first.getElem();
        first = first.getNext();
        return x;
    }

    public String toString() {
        GenericNode<T> p = first;
        String s = "";
        while (p != null) {
            s = s + p.getElem() + " ";
            p = p.getNext();
        }
        return s;
    }


    public boolean member(T value) {
        GenericNode<T> node = first;
        while (node != null) {
            //a ogni passo se trovo x restituisco "true"
            if (node.equals(value)) return true;
            else node = node.getNext();
        }
        //se ho esaurito la lista senza trovare x allora x non c'e'
        return false;
    }
}
