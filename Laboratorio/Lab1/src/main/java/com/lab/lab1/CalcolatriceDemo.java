package com.lab.lab1;
// Salviamo il tutto nel file CalcolatriceDemo.java

class Calcolatrice { //classe non eseguibile e non pubblica
    // una calcolatrice e' una pila che contiene fino a 100 interi.
    // L'ultimo intero e' il risultato delle operazioni fatte finora
    // e la prossima operazione agisce sugli ultimi due interi a,b
    // e li rimpiazza con a+b (per una addizione) oppure a*b (per una moltiplicazione)

    // stack = pila che contiene fino a 100 interi */
    private int[] stack = new int[100];

    // size = numero di interi introdotti: all'inizio 0
    // le posizioni occupate dell'array hanno indice: 0, 1, ..., size-1
    private int size = 0;

    // push(x): aggiunge un intero x allo stack dopo la parte utilizzata
    // e aumenta di 1 la parte di stack utilizzata (variabile size)
    private void push(int x) {
        stack[size] = x; 
        size++;
    }

    // pop(): restituisce l'ultima intero dello stack
    // e lo "cancella" riducendo di 1 la parte di stack utilizzata (variabile size)
    private int pop() {
        size--;
        return stack[size];
    }

    private void stampa(){
        System.out.println("Lo stack ha dimensione: " + size);
        System.out.println("I suoi elementi sono: ");
        for(int indx = 0; indx < size; indx++){
            System.out.println(stack[indx]);
        }
    }

    // questo e' un metodo pubblico
    public int esegui(String istruzioni) {
        int numeroIstruzioni = istruzioni.length(); //lunghezza
        int pc = 0; // inizio leggendo la prima istruzione, in posizione 0

        while (pc < numeroIstruzioni) { //eseguo le istruzioni in ordine
            char c = istruzioni.charAt(pc); //c = carattere di posto pc

            if (c >= '0' && c <= '9') { //vero se c e' una cifra
                push(c - '0');  //questa formula mi da' il valore della cifra c
            } else if (c == '+') {
                int ultimo = pop(); //risultato ultimo calcolo
                int penultimo = pop(); //risultato penultimo calcolo
                push(penultimo + ultimo);
            } else if (c == '*' ) {
                int ultimo = pop(); //risultato ultimo calcolo
                int penultimo = pop(); //risultato penultimo calcolo
                push(penultimo * ultimo);
            } else if (c == '-'){
                int ultimo = pop();
                int penultimo = pop();
                push(penultimo - ultimo);
            } else if (c == '/'){
                int ultimo = pop();
                int penultimo = pop();
                push(penultimo / ultimo);
            } else if (c == '%'){
                int ultimo = pop();
                int penultimo = pop();
                push(penultimo % ultimo);
            } else if (c == '#'){
                stampa();
            } else if (c == 'D' && istruzioni.substring(pc).equals("Dispari")){
                int ultimo = pop();
                push((2*ultimo)+1);
            } else if (c == 'O' && istruzioni.substring(pc).equals("Odd")){
                int ultimo = pop();
                if (ultimo % 2 == 0) { push(0);}
                else {push(1);}
            }

            pc++; // passiamo alla prossima istruzione
        }

        return pop(); //alla fine restituisco l'ultimo risultato ottenuto
    }
}

// Un esperimento di uso della classe calcolatrice
// Classe eseguibile pubblica, deve stare in CalcolatriceDemo.java

public class CalcolatriceDemo {
    public static void main(String[] args) {
        Calcolatrice C = new Calcolatrice();
/*
        System.out.println( "Eseguo istruzioni 23+ (due piu' tre)" );
        System.out.println( C.esegui( "23+" ) + "\n" );

        System.out.println( "Eseguo istruzioni 23* (due per tre) ");
        System.out.println(C.esegui( "23*" ) + "\n");

        System.out.println("Eseguo istruzioni 23*9+ (due per tre piu' nove) ");
        System.out.println(C.esegui( "23*9+" ) + "\n");

        System.out.println("Eseguo istruzioni 99*9* (nove per nove per nove) ");
        System.out.println(C.esegui( "99*9*" ) + "\n");

        System.out.println("Eseguo istruzioni 99*9*1+ (nove per nove per nove piu' uno) ");
        System.out.println(C.esegui( "99*9*1+" ) + "\n");

        System.out.println("Eseguo istruzioni 52*52**252**+3+ (nove per nove per nove piu' uno) ");
        System.out.println(C.esegui( "52*52**252**+3+" ) + "\n");

        System.out.println("Eseguo istruzioni (15+16)*17");
        System.out.println(C.esegui( "53*44*+98+*" ) + "\n");

        System.out.println("Eseguo istruzioni 10!");
        System.out.println(C.esegui( " 52987654321**********" ) + "\n");

        System.out.println("Eseguo istruzioni per calcolare un numero negativo e bisogna fare overflow\n" +
                "Dal momento che int è 32 bit, bisogna moltiplicare 2 per 32 volte");
        System.out.println(C.esegui("22222222222222222222222222222222#*#******************************#") + "\n");
/*
        System.out.println("Eseguo istruzioni 12-");
        System.out.println(C.esegui( "12-" ) + "\n");

        System.out.println("Eseguo istruzioni 32/");
        System.out.println(C.esegui( "32/" ) + "\n");

        System.out.println("Eseguo istruzioni 53%");
        System.out.println(C.esegui( "#53%#" ) + "\n");
        System.out.println("Eseguo istruzioni 2Dispari");
        System.out.println(C.esegui( "2Dispari" ) + "\n");
*/
        System.out.println("Eseguo istruzioni 2Odd");
        System.out.println(C.esegui( "2Odd" ) + "\n");

        System.out.println("Eseguo istruzioni 3Odd");
        System.out.println(C.esegui( "3Odd" ) + "\n");
    }
}