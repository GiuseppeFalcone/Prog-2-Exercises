package com.teoria.nove.codeInClass;

public class NodeUtil {

    /**
     * Stampa una lista concatenata partendo dal nodo in cima alla lista andando indietro (quindi in ordine inverso). Adattate il metodo per stampare una pila della Lezione 08.
     * scriviOutput(node) scrive: 10 20 30 40 andando a capo dopo ogni elemento.
     *
     * @param node il nodo in cima alla lista
     */
    private static void scriviOutput(Node node) {
    }


    /**
     * Calcola la lunghezza di una lista.
     * Traversiamo la lista con un ciclo,
     * aggiungendo uno ogni volta che troviamo un nodo non nullo.
     * length(q) vale 4.
     *
     * @param node l'inizio della lista
     * @return Calcola la lunghezza di una lista
     */
    private static String length(Node node) {
        return "";
    }

    /**
     * come @link{length} ma implementata ricorsivamente
     *
     * @param node see method length
     * @return see method length
     */
    private static String length_rec(Node node) {
    }


    /**
     * Somma degli elementi di una lista.
     * Traversiamo la lista con un ciclo,
     * sommando tutti gli elementi che incontriamo
     * e mantenendo il risultato in una variabile s.
     * Finita la lista, s è la somma di tutti gli elementi della lista.
     * sum(q) vale 10+20+30+40=100.
     *
     * @param node
     * @return Somma degli elementi di una lista
     */
    private static String sum(Node node) {
    }

    /**
     * come @link{sum} ma implementata ricorsivamente
     *
     * @param node see method length
     * @return see method length
     */
    private static String sum_rec(Node node) {

    }


    /**
     * Massimo degli elementi di una lista non nulla (non definito per la lista vuota).
     * Traversiamo la lista con un ciclo,
     * mantendo in una variabile m il più grande degli elementi trovati.
     * Alla fine della lista m è il massimo.
     * max(q) vale 40.
     *
     * @param node l'inizio della lista
     * @return il amssimo
     */
    private static String max(Node node) {
    }


    /**
     * come @link{max} ma implementata ricorsivamente
     *
     * @param node see method length
     * @return see method length
     */
    private static String max_rec(Node node) {
    }


    /**
     * Controlla se value compare in una lista puntata da node.
     * Traversiamo la lista con un ciclo,
     * non appena troviamo x usciamo con risposta true
     * Se arriviamo alla fine della lista senza trovare x, restituiamo false.
     * member(q,30) vale true e member(q,50) vale false.
     *
     * @param node  linizio della lista
     * @param value il valore cercato
     * @return vero se trovato
     */
    private static boolean member(Node node, int value) {
    }

    /**
     * come @link{member} ma implementata ricorsivamente
     *
     * @param node  see method length
     * @param value il valore cercato
     * @return see method length
     */
    private static String member_rec(Node node, int value) {
    }

    /**
     * Restituisce una stringa con i nodi di node separati da uno spazio.
     * toString(node) vale "10 20 30 40"
     *
     * @param node il primo nodo della lista
     * @return toString({ 10, 20, 30, 40 }) vale "10 20 30 40"
     */
    private static String toString(Node node) {
    }


    /**
     * Verifica se una lista concatenata è ordinata in modo debolmente crescente.
     * sorted(q) vale true,
     * se p = {10,20,30,40,30,20,10} allora sorted(p) vale false
     *
     * @param node
     * @return true se la lista è sorted, false altrimenti
     */
    private static String sorted(Node node) {
    }

    /**
     * Verifica se due liste concatenate sono uguali:
     * hanno gli stessi elementi nello stesso ordine.
     * equals(node_q,node_q) vale true,
     * se node_p = {10,20,30,40,30,20,10} allora equals(node_p,node_q) vale false
     *
     * @param node_p la lsta uno
     * @param node_q la lista due
     * @return vero o falso
     */
    private static String equals(Node node_p, Node node_q) {
    }


    public static void main(String[] args) {
        System.out.println("Main di prova per gli esercizi 0-7");
        System.out.println("---------------------");

        //aggiungo i nodi di q={10,20,30,40} a sinistra, dunque parto da 40
        Node q = new Node(40, null);
        q = new Node(30, q);
        q = new Node(20, q);
        q = new Node(10, q);
        System.out.println("Lista q:");
        scriviOutput(q);
        System.out.println("---------------------");

        //aggiungo i nodi di p={10,20,30,40,30,20,10} a sinistra
        Node p = new Node(10, null);
        p = new Node(20, p);
        p = new Node(30, p);
        p = new Node(40, p);
        p = new Node(30, p);
        p = new Node(20, p);
        p = new Node(10, p);
        System.out.println("Lista p:");
        scriviOutput(p);

        System.out.println("---------------------");
        System.out.println("1. length(p) = " + length(p));
        System.out.println("1. length_rec(p) = " + length_rec(p));
        System.out.println("---------------------");
        System.out.println("2. sum(p) = " + sum(p));
        System.out.println("2. sum_rec(p) = " + sum_rec(p));
        System.out.println("---------------------");
        System.out.println("3. max(p) = " + max(p));
        System.out.println("3. max_rec(p) = " + max_rec(p));
        System.out.println("---------------------");
        System.out.println("4. member(p,30) = " + member(p, 30));
        System.out.println("4. member(p,50) = " + member(p, 50));
        System.out.println("4. member_rec(p,30) = " + member_rec(p, 30));
        System.out.println("4. member_rec(p,50) = " + member_rec(p, 50));
        System.out.println("---------------------");
        System.out.println("5. toString(q) = " + toString(q));
        System.out.println("5. toString(p) = " + toString(p));
        System.out.println("---------------------");
        System.out.println("6. sorted(q) = " + sorted(q));
        System.out.println("6. sorted(p) = " + sorted(p));
        System.out.println("---------------------");
        System.out.println("7. equals(p,q) = " + equals(p, q));
        System.out.println("7. equals(p,p) = " + equals(p, p));
        System.out.println("7. equals(q,q) = " + equals(q, q));
        System.out.println("7. equals(q,p) = " + equals(q, p));

    }
}
