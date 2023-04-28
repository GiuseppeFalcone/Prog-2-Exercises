package Grafica;//Per la sottoclasse “Quadrato” di “Figura”, il metodo draw disegna in g un quadrato di lato dato, orizzontale e centrato con gli assi (includiamo una figura alla fine della lezione). Usiamo i metodi della classe Graphics: setColor, drawLine, drawOval.

// Quadrato.java  quadrato = una possibile forma di una Figura
// Definiamo Quadrato come una sottoclasse di Figura

import java.awt.*;

public class Quadrato extends Figura {
  //Un quadrato e' definito dal suo lato
  private int lato;
  // COSTRUTTORE di un quadrato
  public Quadrato(int lato){ this.lato = lato; }

  // OVERRIDE: RI-definiamo il metodo draw (vuoto in Figura)
  // per disegnare una figura nel caso di un quadrato.
  // Scegliamo il quadrato centrato nell'origine e orizzontale.
  // Scegliamo il colore arancio per le prossime linee in g.
  public void draw(Graphics g){
   g.setColor(Color.orange);
   int m = lato / 2;
   // drawline prende come parameteri x1, y1, x2, y2
   g.drawLine( m,  m, -m,  m);   //disegno primo   lato in g
   g.drawLine(-m,  m, -m, -m);   //disegno secondo lato in g
   g.drawLine(-m, -m,  m, -m);   //disegno terzo   lato in g
   g.drawLine( m, -m,  m,  m);   //disegno quarto  lato in g
 }
}

