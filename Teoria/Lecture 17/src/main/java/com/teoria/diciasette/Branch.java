package com.teoria.diciasette;

/**
 * Branch.java - Sottoclasse di Tree degli alberi non vuoti:
 * elem
 * /      \
 * left     right
 * Gli elementi a sinistra sono minori di elem, quelli a destra sono
 * maggiori
 */


public class Branch extends Tree {
    private int elem;   //radice
    private Tree left;  //nodi a sinistra: piu' piccoli della radice
    private Tree right; //nodi a destra: piu' grandi della radice

    public Branch(int elem, Tree left, Tree right) {
        this.elem = elem;
        this.left = left;
        this.right = right;
    }

    public boolean empty() {
        return false;
    }
    // Un albero non vuoto non e' vuoto

    public int max() {
        return right.empty() ? elem : right.max();
    }
    // Se la parte destra e' vuota il nodo piu' grande e' la radice.
    // Altrimenti il nodo piu' grande si trova a destra

    public boolean contains(int x) {
    /* Usa la RICERCA BINARIA, in media richiede tempo log_2(n)
       dove n = numero dei nodi. */
        if (x == elem) // abbiamo trovato l'elemento
            return true;
        else if (x < elem)
            // x se c'e' si trova tra i nodi piu' piccoli a sinistra
            return left.contains(x);
        else //x>elem
            // x se c'e' si trova tra i nodi piu' grandi a destra
            return right.contains(x);
    }

    public Tree insert(int x) {
        /** Inseriamo x preservando l'invariante "albero di ricerca":
         dunque x va inserito a sinistra se e' piu' piccolo della radice e a
         destra se e' piu' grande. */
        if (x < elem)
            left = left.insert(x);
            //e' essenziale aggiornare il valore di left
        else if (x > elem)
            right = right.insert(x);
        //e' essenziale aggiornare il valore right

        //il caso x==elem, x gia' presente nell'albero, non lo
        //inseriamo

        // ora  restituisco this, perché non ho inserito nulla in questo caso
        // creo un nodo solo quando sono in leaf
        // quindi qua ritorno il nodo stesso e il sopra albero non verrà cambiato
        return this;
    }

    public Tree remove(int x) {
        if (x < elem) {
            // se c'e', l'elemento da eliminare e` nel sottoalbero sinistro
            left = left.remove(x); //aggiorno left
            return this;
        } else if (x > elem) {
            // se c'e', l'elemento da eliminare e' nel sottoalbero destro
            right = right.remove(x); //aggiorno right
            return this;
        }
        // questo è il caso in cui ho trovato l'elemento da eliminare
        else { //
            if (left.empty())
                // il sottoalbero sinistro e` vuoto, dunque resta il
                // sottoalbero destro:
                return right;
            else if (right.empty())
                // il sottoalbero destro e` vuoto, dunque resta il
                // sottoalbero sinistro:
                return left;
            else {
                elem = left.max();
                // rimpiazziamo elem con il massimo del sottoalbero
                // sinistro (massimo dei minimi)
                // e, per evitare ripetizioni, eliminiamo
                // il massimo dal sottoalbero sinistro:
                left = left.remove(elem); //aggiorno left
                return this;
            }
        }

    }


    public Tree search(int x) {
        if (x < elem) {
            // se c'e', l'elemento da eliminare e` nel sottoalbero sinistro
            left = left.remove(x); //aggiorno left
            return this;
        } else if (x > elem) {
            // se c'e', l'elemento da eliminare e' nel sottoalbero destro
            right = right.remove(x); //aggiorno right
            return this;
        }
        // questo è il caso in cui ho trovato l'elemento da eliminare
        else return this;
    }

    //Metodo che gestisce la parte NON pubblica della stampa.
    //Non forniamo spiegazioni sul suo funzionamento,
    // non e' essenziale.
    protected String toStringAux
    (String prefix, String root, String left, String right) {
        return this.left.toStringAux(prefix + left, "   /", "   ", "  ¦")
                + "\n" + prefix + root + "[" + elem + "]" + "\n" +
                this.right.toStringAux(prefix + right, "   \\", "  ¦", "   ");
    }
}
// end class Branch


