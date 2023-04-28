package com.teoria.dieci.firstHour.generic_pair;

public class GenericPair<T, S> {
    private T first;
    private S second;
    // T, S parametri di tipo che rappresentano variabili di
    // classe (e dunque dei tipi)
    // T e S NON possono essere tipi primitivi
    // (limitazione solo apparente, viene superata introducendo  il
    // concetto di "autoboxing" )

    /* Dobbiamo chiamare il costruttore GenericPair, senza <T,S>*/
    public GenericPair(T first, S second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public S getSecond() {
        return second;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public void setSecond(S second) {
        this.second = second;
    }

    /* Il metodo toString() appartiene a qualunque classe T, S
    quindi puo' essere usato (se le classi sostituite a T e S non definiscono il toString() viene usato quella della classe Object, che restituisce la stringa indirizzo-nella-heap in esadecimale) */
    public String toString() {
        return "(" + first.toString() + "," + second.toString() + ")";
    }
}
