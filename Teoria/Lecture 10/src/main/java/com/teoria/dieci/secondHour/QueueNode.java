package com.teoria.dieci.secondHour;

public class QueueNode<T> {
    QueueNode next;
    T elem;

    public QueueNode(T elem, QueueNode next) {
        this.next = next;
        this.elem = elem;
    }

    public QueueNode getNext() {
        return next;
    }

    public void setNext(QueueNode next) {
        this.next = next;
    }

    public T getElem() {
        return elem;
    }

    public void setElem(T elem) {
        this.elem = elem;
    }
}
