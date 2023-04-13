package com.teoria.otto.excInClass;
/* ArrayExt.java
Laa classe ArrayExt definisce array estendibili con dimensioni
un valore min deciso inizialmente, oppure il doppio, il quadruplo
eccetera, a seconda di quanto spazio viene richiesto.

Inoltre ArrayExt fornisce operazioni più generali, di aggiunta e
rimozione di un elemento dato il suo indice. Queste operazioni
mantengono l'ordine all’interno dell’array se questo esiste.
Vengono utilizzate nel caso di array ordinati, quando vogliamo
modificare l’array, ma facendo sì che resti ordinato. */

public class ArrayExt {
    // Invariante: (0 <= size <= lunghezza vett) e (lunghezza vett>0)
    // (parte significativa di vett: da 0 a size-1)
    private int size;
    //indica la parte effettivamente in uso del array, 0 all’inizio
    private int[] vett;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int[] getVett() {
        return vett;
    }

    public void setVett(int[] vett) {
        this.vett = vett;
    }

    /**
     * Se startingSize>0, questo metodo costruisce un array di startingSize elementi
     * con size=0. La lunghezza di vett sara' startingSize*(una potenza di 2).
     * @param startingSize la dimensione massima allocata all'array inizialmente
     */
    public ArrayExt(int startingSize) {
        assert startingSize > 0 : "startingSize non positivo = " + startingSize;
        size = 0;
        vett = new int[startingSize];
        assert 0 <= size && size <= vett.length;
    }

    public String toString() {
        String s = " size = " + size;
        for (int i = 0; i < size; ++i) s = s + "\n vett[" + i + "]=" + vett[i];
        return s;
    }

    //Metodo di lettura dell'elemento i con 0<=i<size
    public int get(int i) {
        assert 0 <= i && i < size : "get su indice non in 0,...,size-1 " + i;
        return vett[i];
    }

    /**
     * Metodo di scrittura dell'elemento indice con 0<=indice<size
     * @param indice l'indice in cui inserire
     * @param valore il valore da inserire
     */
    public void set(int indice, int valore) {
        assert 0 <= indice && indice < size : "set su indice non in 0,...,size-1 " + indice;
        vett[indice] = valore;
    }


    /**
     * Metodo per aggiungere un elemento elementoDaInserire nel posto 0<=posizione<=size, spostando
     * di una posizione gli elementi a destra di posizione. Puo' fare da push
     * @param elementoDaInserire l'intero che vogliamo inserire in vett
     */

    public void add(int elementoDaInserire) {
        // se array e piena, allora espandi
        estendiSeNecessario();

        // trova la posizione in cui inserire (ho cambiato il nome del metodo usato nel video -- vedi nota nel metodo)
        int posizione = trovaPosizioneDiInserimento(elementoDaInserire);
        // sposta a destra gli elementi
        spostaADestra(posizione);
        // inserisci l'elemento
        // differenza con il video: nel video ho assegnato direttamente a vett[posizione] ma in realtà avevo già un
        // metodo set definito ne programma quindi lo riuso qui
        set(posizione, elementoDaInserire);

        // errore nel video!
        // size non dobbiamo incrementalo qui perché lo abbiamo già incrementato nel metodo di  spostamento a destra
        // se lo facessimo di nuovo avremo incrementato size di 2 e quindi avremmo un elemento non
        // valido come ultimo elemento. Quindi rispetto al video, qui ho rimosso la seguente linea
        // size++;
        assert 0 <= size && size <= vett.length; //controllo l’invariante
    }

    /**
     * sposta gli elementi di vett a destra a partire dalla posizione e fino a size+1
     * attenzione! l'algoritmo richiede di fare lo stostamento a partire da destra (vedi slides)
     * @param posizione la posizione da cui spostare
     */
    private void spostaADestra(int posizione) {
        for (int ix=size-1; ix>=posizione; ix--)
            vett[ix+1] = vett[ix];
        size++;
    }

    /**
     * dato un elemento, cerca il suo indice d inserimento nell'array (cioè cerca il primo elemento > del parametro
     *
     * NOTA! ho cambiato il nome che avevo usato nel video per dare un nome più significativo. Si chiamava trovaPosizione
     * ma era ambiguo tra trova posizione dell'elemento e trova posizione da inserire. Ho chiarito e risolto un errore
     *
     * @param elemento il numero da cercare in vett
     * @return la posizione
     */
    private int trovaPosizioneDiInserimento(int elemento) {
        for (int ix = 0; ix < size; ix++) {
            // errore nel video! avevo scritto
            // if (vett[ix] == elemento)
            // ma siccome inseriamo un elemento, quell'elemento non esiste quindi se usiamo = non lo troviamo e
            // finiazmo ad inserire in posizione size
            // qui sotto la condizione giusta. L'array è ordinato e quindi il posto è immediatamente prima del
            // valore più grande
            if (vett[ix] > elemento)
                return ix;
        }
        return size;
    }

    /**
     * decide se il vett è da estendere e nel caso lo estende
     */
    private void estendiSeNecessario() {
        if (size >= vett.length) {
            // crea vettore piu grande
            int[] vett2 = new int[vett.length * 2];
            // copia elementi
            for (int ix = 0; ix < vett.length; ix++) {
                vett2[ix] = vett[ix];
            }
            // crea link
            vett = vett2;
        }
    }



}
