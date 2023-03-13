//Salviamo il tutto nel file CalcolatriceDemo.java

class Calcolatrice {
/** una calcolatrice e' una pila che contiene fino a 100 interi.
 L'ultimo intero e' il risultato delle operazioni fatte finora e la
 prossima operazione agisce sugli ultimi due interi a,b e li rimpiazza
 con a+b (per una addizione) oppure a*b (per una moltiplicazione) */

    /**
     * stack = pila che contiene fino a 100 interi
     */
    private int[] stack = new int[100];

    /**
     * size = numero interi introdotti: all'inizio 0
     * le posizioni occupate hanno indice: 0, 1, …, size-1
     */
    private int size = 0;

    /**
     * push(x): aggiunge un intero x a stack dopo la parte utilizzata
     * e aumenta la parte di stack utilizzata di uno.
     * @param x un intero o il segno *
     */
    private void push(int x) {
        stack[size] = x;
        size++;
    }

    /**
     * pop(): restituisce l'ultima intero utilizzato di stack
     * e lo "cancella", riducendo la parte di stack utilizzata di uno.
     */
    private int pop() {
        size--;
        return stack[size];
    }


/**
 *  Un esempio di istruzioni da svolgere: la stringa "23+"
 *  (i)   La prima cifra viene inserita e lo stack passa da: {} (vuoto) a
 *              {2} (cioè contiene il solo numero 2).
 *  (ii)  La seconda cifra viene inserita e lo stack passa da {2} a {2,3}
 *  (iii) Quando leggiamo il + togliamo gli ultime due interi dallo stack che ritorna ad essere vuoto: {}
 *  (iv)  Sommiamo i due interi: 5=2+3, infine inseriamo 5 nello stack che diventa [5] (contiene il solo 5)
 *  (v)   Quando la lista e' finita l'ultimo intero nello stack, 5, viene tolto e diventa il risultato
 *
 * @param istruzioni una stringa che rappresenta una somma in notazione polacca inversa, e.g. "23+"
 * @return cambia lo stato della stack rimuovendo gli operandi e il segno di operazione e inserisce il risultato delle operazioni
 */


    public int esegui(String istruzioni) {
        int numeroIstruzioni = istruzioni.length(); //lunghezza
        int pc = 0; /** inizio leggendo l'istruzione 0 */
        while (pc < numeroIstruzioni) { //eseguo le istruzioni in ordine
            char c = istruzioni.charAt(pc);  //c = carattere di posto pc
            if (c >= '0' && c <= '9')  {      //vero se c e' una cifra
                push(c - '0');  //questa formula mi da' il valore della cifra c
            }
            else if (c == '+') {
                // nn inseriamo in realtà il segno - è inutile visto che lo dovremmo rimuovere subito dopo
                int ultimo = pop(); //risultato ultimo calcolo
                int penultimo = pop(); //risultato penultimo calcolo
                push(penultimo + ultimo);
            } else if (c == '*') {
                int ultimo = pop(); //risultato ultimo calcolo
                int penultimo = pop(); //risultato penultimo calcolo
                push(penultimo * ultimo);
            }
            pc++; //eseguita c passo alla prossima istruzione
        }
        return pop();
        //alla fine delle istruzioni restituisco l'ultimo risultato
        //ottenuto
    }
}






/** Un esperimento di uso della classe calcolatrice
    Classe eseguibile pubblica, deve stare in CalcolatriceDemo.java
*/
public class CalcolatriceDemo {
   public static void main(String[] args){
    Calcolatrice C = new Calcolatrice();

    System.out.println( "Eseguo istruzioni 23+ (due piu' tre) " );
    System.out.println( C.esegui( "23+" ) + "\n" );

    System.out.println( "Eseguo istruzioni 23* (due  per tre) " );
    int value = C.esegui( "23*");
    System.out.println(value + "\n");

    System.out.println("Eseguo istruzioni 23*9+ (due  per tre piu' nove) " );
    System.out.println(C.esegui( "23*9+" ) + "\n");

    System.out.println("Eseguo istruzioni 99*9* (nove per nove per nove) " );
    System.out.println(C.esegui( "99*9*" ) + "\n");

    System.out.println("Eseguo istruzioni 99*9*1+ (nove per nove per nove piu' uno) ");System.out.println(C.esegui( "99*9*1+" ) + "\n");

    System.out.println("Eseguo istruzione 1+ per creare l'errore" );
    System.out.println(C.esegui( "1+" ) + "\n");

   }
}
