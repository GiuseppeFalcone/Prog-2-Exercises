package Bottiglia;//Bottiglia.Bottiglia.java.         Riutilizziamo il programma della Lezione 05
//Bottiglia.BottigliaConTappo.java. Riutilizziamo il programma della Lezione 11

// Bottiglia.TestCast.java   ESPERIMENTI SUL TIPO ESATTO DI UN OGGETTO
// tipo esatto di un oggetto = tipo C con cui l’oggetto x nasce
// x ha anche tipo (non esatto) ogni classe D che contiene C.

public class TestCast {
    public static void main(String[] args) {
        // ESEMPIO. A seconda se la circostanza "oggi_piove" e' vera o
        // falsa, il tipo esatto di b e' la sottoclasse oppure la classe.
        boolean oggi_piove = true;
//        boolean oggi_piove = false;
        //Provate entrambe le possibilita’ qui sopra: una non compila

        // UPCAST: il passaggio a una classe superiore. E' sempre corretto.
        Bottiglia b;
        if (oggi_piove) b = new BottigliaConTappo(10);
            // upcast: b proviene da Bottiglia.BottigliaConTappo ed e' spostato in
            // Bottiglia.Bottiglia
        else b = new Bottiglia(10);
        // Se oggi_piove=true allora b si trova in Bottiglia.BottigliaConTappo
        // Se oggi_piove=true allora b non si trova in Bottiglia.BottigliaConTappo

        // DOWNCAST:  di solito, passaggio a una classe inferiore.
        // Funziona SOLO nel caso in cui l'oggetto apparteneva GIA'
        // alla classe inferiore ed e' stato spostato nella superiore
        // da un upcast.

        // ESEMPIO. Il prossimo downcast appare corretto al compilatore
        // Java, il quale non ha modo di sapere se il tipo esatto di b e`
        // Bottiglia.Bottiglia o Bottiglia.BottigliaConTappo. A tempo di esecuzione viene
        // fatto un controllo sul tipo esatto di b e il downcast
        // fallisce (causando la terminazione anticipata del programma) se b
        // risulta avere tipo esatto Bottiglia.Bottiglia.

        BottigliaConTappo t = (BottigliaConTappo) b;
        // SE b si trovava gia' in Bottiglia.BottigliaConTappo ed e' stato spostato in
        // Bottiglia.Bottiglia allora il downcast ha successo e scrivo:
        System.out.println("Downcast avvenuto con successo");
        // ALTRIMENTI il programma termina con una ClassCastException

        // Dopo il downcast possiamo applicare a t un metodo aperta()
        // che esiste solo nella sottoclasse Bottiglia.BottigliaConTappo
        System.out.println("t.aperta() = " + t.aperta());
        // Non possiamo scrivere b.aperta(), anche se nell’esecuzione b=t:
        //     System.out.println( "b.aperta() = " + b.aperta());
        // Il controllo di tipo del programma usa il tipo apparente
        // Bottiglia.Bottiglia
        // di b, e nel tipo Bottiglia.Bottiglia il metodo aperta non c'e'.
    }
}

