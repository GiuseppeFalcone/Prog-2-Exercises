package com.teoria.dieci.secondHour;

public class Queue<T> {
    QueueNode<T> first;
    QueueNode<T> last;

    public Queue() {
        first = null;
        last = null;
    }

    public void push(T ct){
        QueueNode<T> qn = new QueueNode<T>(ct, null);
        if (first==null) {
            first = qn;
            last = qn;
        } else
            last.setNext(qn);
    }

    public T pop(){
        QueueNode<T> aa = first;
        if (first==null)
            return null;
        first = first.getNext();
        return aa.getElem();
    }

    public void Printing(){
        QueueNode<T> node = first;
        while(node != null){
            System.out.println(node.getElem() + " ");
            node = node.getNext();
        }
    }
}
