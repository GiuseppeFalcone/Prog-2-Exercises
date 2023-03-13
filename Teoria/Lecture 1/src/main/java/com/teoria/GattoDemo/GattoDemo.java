package com.teoria.GattoDemo;

import java.util.Scanner; //Usiamo la classe Scanner (Java utility)

class Gatto {
    // Le classi iniziano con la maiuscola
    // Classe come generatore/blueprint di oggetti

    // Stato: campi dell'oggetto (a loro volta possono essere di
    // tipo oggetto)

    /* Ogni classe induce un tipo oggetto che corrisponde alla classe   stessa. Per esempio, la classe complex_example.Gatto induce il tipo complex_example.Gatto, che può   essere usato come qualsiasi altro tipo predefinito Java: come se fosse int, double, boolean.
     */

    public String nome;
    public String razza;
    public int anni;
    /* Le operazioni sono rappresentate come metodi dinamici pubblici: se senza argomenti, si scrivono:
    public tipo metodo(){… …}
    Variabili e metodi iniziano con la minuscola, se uniamo piu' parole dalla seconda in poi iniziano con la maiuscola (Camel Case in inglese, cioè le parole hanno le gobbe). Es.: leggiInput()
    Dentro il metodo indichiamo con this l’oggetto di tipo complex_example.Gatto a cui applicheremo il metodo. */

    private static Scanner tastiera = new Scanner(System.in);
    /* Definisco un nuovo oggetto "tastiera" di tipo Scanner, capace di
    tradurre un input in caratteri, inviato da tastiera, nella sua
    rappresentazione Java. Il metodo nextLine(); se applicato a "tastiera" richiede una riga di input da tastiera e restituisce una stringa. */

    /**
     * metodo dinamico: chiediamo a un oggetto di tipo complex_example.Gatto
     * di assumere nome, razza e eta' che gli inviamo da tastiera
     */
    public void leggiInput() {
        System.out.println(" nome = ");
        this.nome = tastiera.nextLine(); //nome gatto che riceve il metodo
        System.out.println(" razza = ");
        this.razza = tastiera.nextLine(); //razza gatto che riceve il metodo
        System.out.println(" anni = ");
        this.anni = tastiera.nextInt(); //eta'  gatto che riceve il metodo
        tastiera.nextLine();/* consumo il return dopo il numero anni */
    }

    public String toString() {
        /* metodo dinamico: chiediamo a un oggetto di tipo complex_example.Gatto di fornire   una stringa contenente i suoi dati. Possiamo abbreviare this.nome con nome, eccetera. Ogni "\n" va a capo. */
        return " nome  = " + nome + "\n razza = " + razza +
                "\n anni = " + anni;
    }

    /**
     * metodo dinamico: chiediamo a un oggetto di tipo
     * complex_example.Gatto di mandarci i suoi anni trasformati in anni corrispondenti
     * per l'uomo. Conto 11 anni ciascuno i primi due anni del gatto,
     * conto 5 anni ogni altro anno
     */
    public int getEtaInAnniUmani() {

        if (anni <= 2)
            return anni * 11;
        else
            return 22 + (anni - 2) * 5;
    }
}

/**
 * Ecco il primo esempio di un programma che usa classi definite da noi: la classe complex_example.GattoDemo ha un main, quindi e' un programma, e usa la classe complex_example.Gatto. La classe complex_example.Gatto deve: (1) trovarsi nello stesso file del programma (e' la nostra scelta), oppure (2) trovarsi in un file di nome complex_example.Gatto.java della stessa cartella ed essere public.
 * La classe complex_example.GattoDemo deve essere salvata nel file complex_example.GattoDemo.java
 * Per assegnare un attributo pubblico dell’oggetto complex_example.Gatto x, per esempio assegnare "anni" a 8 devo scrivere: x.anni = 8
 */

public class GattoDemo {
    //Una classe e' eseguibile se ha un main, come questo:
    public static void main(String[] args) {
        Gatto tramot = new Gatto();
    /* Il comando C x = new C(); definisce un nuovo oggetto x di tipo C
    con valori di default per gli attributi. Nel caso di un gatto: null, null, 0 per gli attributi: nome, razza, anni */

        System.out.println("tramot prima inserimento dati");
        // stampo i valori di default: null, null, 0
        // se c'e' la toString() in complex_example.Gatto
        System.out.println(tramot);
        System.out.println("Inserisci dati tramot");
        tramot.leggiInput();
        System.out.println("Dati inseriti tramot");
        // stampo i valori
        System.out.println(tramot);//qui "tramot" abbrevia "tramot.toString()"
        System.out.println("eta' tramot in anni umani  "
                + tramot.getEtaInAnniUmani());

        Gatto galileo = new Gatto();
        /* Questo crea un nuovo oggetto di tipo complex_example.Gatto con valori di
         default null, null, 0 per gli attributi nome, razza, anni */
        System.out.println("Inserisco dati galileo dentro il programma");
        galileo.nome = "Galileo";
        galileo.razza = "Persiano";
        galileo.anni = 5;
        System.out.println(galileo); //qui "galileo" abbrevia "galileo.toString()"
    }
}