package com.teoria.otto.excInClass;

//ArrayExtDemo.java
public class ArrayExtDemo {
    public static void main(String[] args) {
        ArrayExt a = new ArrayExt(10); //capienza iniziale 10
        //Per controllare il metodo extend() aggiungo 12 elementi.
        String msg = "Aggiungo i valori x=0,1,...,11 al vettore a" +
                "\n - sempre in prima posizione" +
                "\n - ognuno davanti ai valori precedenti" +
                "\n - ogni aggiunta sposta avanti di uno gli elementi precedenti";
        System.out.println(msg);
        int x = 0;
        while (x < 12) {
            a.add(x);
            ++x;
        }
        System.out.println(" a \n" + a);
         System.out.println("Aggiungo x=-1 ");
        a.add(-1);
        System.out.println(" a \n" + a);
    }
}
