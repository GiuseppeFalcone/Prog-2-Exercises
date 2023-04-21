package com.teoria.dodici;
public class DynamicStackSizeDemo {

    public static void main(String[] args) {
        System.out.println("Definisco la pila dynamicStackSize = {-1}");
        DynamicStackSize dynamicStackSize = new DynamicStackSize();
        dynamicStackSize.push(-1);
        System.out.print(dynamicStackSize);

        System.out.println("Definisco la pila dynamicStackSize = {11,9,7,5,3,1,-1}");
        dynamicStackSize.push(1);
        dynamicStackSize.push(3);
        dynamicStackSize.push(5);
        dynamicStackSize.push(7);
        dynamicStackSize.push(9);
        dynamicStackSize.push(11);
        System.out.print(dynamicStackSize);

        System.out.println("Estraggo 11, 9, 7. Leggo 5");
        System.out.println(" dynamicStackSize.pop() = " + dynamicStackSize.pop());
        System.out.println(" dynamicStackSize.pop() = " + dynamicStackSize.pop());
        System.out.println(" dynamicStackSize.pop() = " + dynamicStackSize.pop());
        //Leggiamo il prossimo elemento, 5, senza estrarlo dala pila
        System.out.println("  dynamicStackSize.top() = " + dynamicStackSize.top());
        System.out.println("Stampo cio' che resta: dynamicStackSize={5,3,1,-1}");
        System.out.print(dynamicStackSize);
    }
}
