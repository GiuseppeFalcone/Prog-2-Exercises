package Bottiglia;

public class Prova {

   public static void prova(Bottiglia b){
     // questo metodo accetta come parametri
     // oggetti di tipo Bottiglia.Bottiglia o di tipo
     // più piccolo (per es. Bottiglia.BottigliaConTappo)

     System.out.println( "b.aggiungi(6) =" + b.aggiungi(6));
     // tutto ok, b ha tipo Bottiglia.Bottiglia quindi posso
     // chiamare aggiungi()

     // instanceof controlla il tipo *vero*
     // di un oggetto:
     if (b instanceof Bottiglia)
       System.out.println( "b è una bottiglia" );
     if (b instanceof BottigliaConTappo) {
       System.out.println( "b è una bottiglia con tappo" );
       // boolean r1 = b.aperta(); // non compila
       // perché b ha tipo apparente Bottiglia.Bottiglia
       // che non ha un metodo aperta()
       BottigliaConTappo z = (BottigliaConTappo)b;
       // questo downcast funziona a runtime perché
       // il tipo vero di b è Bottiglia.BottigliaConTappo (certificato
       // dalla instanceof)
       System.out.println( " z.aperta()=" + z.aperta()); // compila
       // perché z ha tipo apparente Bottiglia.BottigliaConTappo
       System.out.println( " b.aggiungi(6)=" +b.aggiungi(6)+" b="+b);
       System.out.println( " z.aggiungi(3)=" +z.aggiungi(3)+" z="+z);
       // tutte e due le precedenti chiamate a aggiungi()
       // chiamano la versione di Bottiglia.BottigliaConTappo di
       // aggiungi(): il loro tipo vero è infatti
       // Bottiglia.BottigliaConTappo grazie al binding dinamico!
     }
   }

   public static void main(String[] args){
       Bottiglia a = new Bottiglia(9);
       System.out.println( "\nProvo con un Bottiglia.Bottiglia =" + a);
       prova(a);
       BottigliaConTappo b = new BottigliaConTappo(9);
       System.out.println( "\nProvo con un Bottiglia.BottigliaConTappo =" + b);
       prova(b);
       /* Quest'ultima chiamata a prova() stampa:
            b è una bottiglia
            b è una bottiglia con tappo
            ............................
          Perché?
        */
   }

 }
