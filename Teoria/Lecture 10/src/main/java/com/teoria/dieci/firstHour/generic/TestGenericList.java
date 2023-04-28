package com.teoria.dieci.firstHour.generic;
import com.teoria.dieci.firstHour.Contatto;

import java.util.Random;

public class TestGenericList {

    public static void main(String[] args){

    // Creiamo uno stack per contenere stringhe
     System.out.println( " ---> Stampo p = {\"hello \", \"world!\"} ");
    /* Al posto di GenericList<String> dopo la new posso scrivere GenericList<>, se il compilatore ha informazione sufficiente per inferire il tipo String. Attenzione però: i compilatori piu’ vecchi non accettano la versione GenericList<> che qui impieghiamo. */
     GenericList<String> p = new GenericList<>(); //p pila String
     p.push("world!");
     // OK: il metodo push si aspetta un argomento di tipo String
     p.push("hello ");
     System.out.println(p); // stampo 2 strighe
     String s1 = p.pop();
     // OK: il metodo pop ritorna un valore di tipo String
     String s2 = p.pop();
     p.push(s1 + s2); // OK: s1 + s2 produce una nuova stringa
     System.out.println( " ---> Stampo p = {\"hello world!\"} ");
     System.out.println(p);

      // p.push(1);
      // ERRORE: non posso inserire int in uno stack di String

      // Creiamo uno stack per contenere numeri interi.
      // NON e` possibile usare tipi primitivi int, boolean double
      // per istanziare classi generiche, dunque DOBBIAMO usare il tipo
      // Integer (i numeri devono comparire "inscatolati" nello stack)

      System.out.println( " ---> Stampo q = {2,1} ");
      GenericList<Integer> q = new GenericList<>(); //q pila Integer
      q.push(1);
    /* OK: il metodo push si aspetta un argomento di tipo Integer, gli forniamo un int che puo' essere convertito in Integer grazie all'autoboxing */
      q.push(2);
      System.out.println(q);// stampo 2, 1 interi
      q.push(q.pop() + q.pop());
    /* OK: il metodo pop ritorna un Integer da cui Java estrae automaticamente un int nel momento in cui vede che usiamo il valore per un'operazione primitiva (+) */
      System.out.println( " ---> Stampo q = {2+1} ");
      System.out.println(q); // stampo 3 intero

      // q.push("hello"); // ERRORE: non posso inserire String in
      // uno stack di Integer

      // Inserisco alcuni numeri casuali tra 0 e 1 in una pila s di
      // Double
      Random r = new Random();//r = generatore numeri casuali
      GenericList<Double> s = new GenericList<Double>();
      //s pila Double
      //Scelgo a caso la dimensione dello stack, al massimo 20 elementi
      int n = r.nextInt(20);
      //Scelgo a caso ogni elemento dello stack e lo aggiungo a s
      for (int i = 0; i < n; i++)
       s.push(r.nextDouble());

      /* Il metodo toString() ci fornisce una versione stampabile per
      Stack di elementi di tipo arbitrario (ma tutti dello stesso tipo)
      */
      System.out.println( " ---> ora p e' uno stack di 1 stringa");
      System.out.println(p);  // OK: p e' uno Stack di String
      System.out.println( " ---> ora q e' uno stack di 1 Integer");
      System.out.println(q);  // OK: q e' uno Stack di Integer
      System.out.println( " ---> s e' uno stack di " + n + " Double");
      System.out.println(s); // OK: s e' uno Stack di Double


     // ora proviamo con i metodi della lista dei contatti e degli interi
     System.out.println("Main di prova per gli esercizi 0-7");
     System.out.println("---------------------");

     //aggiungo i nodi di q={10,20,30,40} a sinistra, dunque parto da 40
     GenericList<Contatto> q2 = new GenericList<>();
     q2.push(new Contatto("40", "40@cc.com"));
     q2.push(new Contatto("30", "30@cc.com"));
     q2.push(new Contatto("20", "20@cc.com"));
     q2.push(new Contatto("10", "10@cc.com"));

     GenericList<Contatto> p2 = new GenericList<>();
     p2.push(new Contatto("40", "40@cc.com"));
     p2.push(new Contatto("30", "30@cc.com"));
     p2.push(new Contatto("20", "20@cc.com"));
     p2.push(new Contatto("10", "10@cc.com"));
     p2.push(new Contatto("10", "10@cc.com"));

     System.out.println("---------------------");
     System.out.println("4. member(p2,30) = " + q2.member(new Contatto("30", "30@cc.com")));
     System.out.println("---------------------");
     System.out.println("5. toString(q2) = " + q2.toString());
     System.out.println("---------------------");
     System.out.println("7. equals(p2,q2) = " + q2.equals(p2));
     }
    }

