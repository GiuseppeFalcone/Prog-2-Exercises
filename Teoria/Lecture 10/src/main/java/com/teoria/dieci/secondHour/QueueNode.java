package com.teoria.dieci.secondHour;

public class QueueNode<T> {
    QueueNode<T> next;
    T elem;

    public QueueNode(T elem, QueueNode<T> next) {
        this.next = next;
        this.elem = elem;
    }

    public QueueNode<T> getNext() {
        return next;
    }

    public void setNext(QueueNode<T> next) {
        this.next = next;
    }

    public T getElem() {
        return elem;
    }

    public void setElem(T elem) {
        this.elem = elem;
    }
}
