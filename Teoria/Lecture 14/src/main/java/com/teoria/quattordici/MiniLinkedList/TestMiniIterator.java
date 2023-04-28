package com.teoria.quattordici.MiniLinkedList;

/**
 * TestMiniIterator.java (controlliamo MiniLinkedList e MiniIterator)
 */
public class TestMiniIterator {


    public static void main(String[] args) {
        //Definisco una lista miniLinkedList = {9,8,7,6,5,4,3,2,1,0} aggiungendo
        //             0,1,2,3,4,5,6,7,8,9
        //sempre in posizione 0, dunque ogni elemento davanti ai precedenti
        MiniLinkedList miniLinkedList = new MiniLinkedList();
        for (int i = 0; i < 10; i++)
            miniLinkedList.add(0, i);

        //Cancello l_7, cioe' il terzo elemento di miniLinkedList dal fondo: il 2
        //Resta miniLinkedList = { ... 3 1 0}
        System.out.println(" miniLinkedList.size()  = " + miniLinkedList.size());
        System.out.println("Cancello l_7 (contiene 2)");
        System.out.println(" miniLinkedList.remove(7)  = " + miniLinkedList.remove(7));
        System.out.println(" miniLinkedList.size()  = " + miniLinkedList.size());

        //Stampo senza MiniIterator: complessità in tempo alta come
        //spiegato nell'introduzione (vedi sopra), perché ogni get(i)
        //ricomincia dal primo nodo.
        System.out.println("Stampo miniLinkedList usando le get(i):");
        for (int i = 0; i < miniLinkedList.size(); i++) {
            System.out.println(" " + miniLinkedList.get(i));
        }

        /* Per evitare una complessità in tempo alta, potrei invece consentire miniLinkedList’accesso al first di MiniLinkedList mettendolo public. Ma miniLinkedList’accesso al first provocherebbe una "information leaking", un accesso a informazioni private della classe, che puo' produrre danni, involontari o intenzionali. Abbiamo introdotto introdotto quindi il concetto di "iterator", che è come un puntatore temporaneo, ma che sta nella heap con gli altri oggetti, non nello stack.
         */

        //Stampo tramite MiniIterator per il puntatore della stampa:
        //creo it = miniLinkedList.iterator() e faccio stampare utilizzando it.
        System.out.println("Stampo miniLinkedList usando MiniIterator:");
        MiniIterator it = miniLinkedList.generateIterator();
        while (it.hasNext())
            System.out.print(" " + it.nextElement());
        System.out.println();
        miniLinkedList.replaceValue(7, 3244);
        MiniIterator it2 = miniLinkedList.generateIterator();
        while (it2.hasNext())
            System.out.print(" " + it2.nextElement());
        System.out.println();
    }

}
