package com.teoria.dieci.secondHour;

public class Main {

    public static void main(String[] args) {
        Queue<Contatto> myQueue = new Queue<>();
        myQueue.push(new Contatto("pippo", "pippo@pippo.com"));
        myQueue.push(new Contatto("pluto", "pluto@pippo.com"));
        myQueue.push(new Contatto("topo", "topo@pippo.com"));

        Queue<PrinterJob> myQueue2 = new Queue<>();
        myQueue2.push(new PrinterJob("111", "blah blah"));
        myQueue2.push(new PrinterJob("2222", "blah blah"));
        myQueue2.push(new PrinterJob("3333", "blah blah"));

        myQueue.Printing();
        myQueue2.Printing();

    }
}
