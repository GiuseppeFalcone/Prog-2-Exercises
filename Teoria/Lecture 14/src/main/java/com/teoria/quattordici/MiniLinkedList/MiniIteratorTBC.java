package com.teoria.quattordici.MiniLinkedList;

/* MiniIterator.java - Classe che consente di traversare una volta sola una lista con un numero "size" di applicazioni di getNext() senza rendere pubblici gli indirizzi dei nodi. */
public class MiniIteratorTBC {
    private Node nextNode; // next = prossimo nodo da "visitare"

    public MiniIteratorTBC(Node first) {
        nextNode = first;
    }


    public boolean hasNext() {
        return nextNode != null;
    }

    /**
     *   restituisce l’elemento nel nodo corrente e muove il puntatore next al nodo dopo. Si noti che next() cancella il valore originale di next: la visita della lista l viene fatta una volta sola. Per fare un’altra visita dovrò creare nel codice client un altro oggetto it = l.iterator().
     */
    public int nextElement() {
        assert hasNext();
        int x = nextNode.getElem();
        nextNode = nextNode.getNext();
        return x;
    }

}

