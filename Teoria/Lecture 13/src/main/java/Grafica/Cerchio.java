//Per la sottoclasse “Cerchio” di “Figura”, il metodo draw disegna un cerchio di raggio dato e centrato con gli assi (includiamo una figura alla fine della lezione).

// Cerchio.java cerchio = una possibile forma di una Figura:
// definiamo Cerchio come una sotto-classe di Figura.

import java.awt.*;

public class Cerchio extends Figura {
 // Un cerchio e' definito dal suo raggio r
    private int raggio;
 // COSTRUTTORE di un quadrato
    public Cerchio(int raggio){ this.raggio = raggio; }

// OVERRIDE: RI-definiamo il metodo draw per disegnare una figura
// in un oggetto grafico g, nel caso la figura sia un cerchio.
// Disegnamo il cerchio nel rettangolo di angolo in basso a sinistra
// (-r, -r) e di dimensioni 2r x 2r.
// Scegliamo il colore rosso per le prossime linee in g


 public void draw(Graphics g) {
   g.setColor(Color.red);
   // parametri di drawOval
     // x – the x coordinate of the upper left corner of the oval to be drawn.
     // y – the y coordinate of the upper left corner of the oval to be drawn.
     // width – the width of the oval to be drawn.
     // height – the height of the oval to be drawn.
   g.drawOval(-raggio,-raggio,  2*raggio,2*raggio);
 }

}


