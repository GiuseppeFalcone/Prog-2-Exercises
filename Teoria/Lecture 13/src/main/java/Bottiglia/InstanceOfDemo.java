package Bottiglia;

public class InstanceOfDemo{

 // NOTA: t instanceof T = true se e solo se
 // t = oggetto istanziato (non null) di tipo T

  public static void main(String[] args){
 //a10 e b10 sono oggetti instanziati dal costruttore, quindi !=null:
   Bottiglia a10=new BottigliaConTappo(10);
   Bottiglia b10=new Bottiglia(10);
   BottigliaConTappo u = null;

   System.out.println( "a10 instanceof Bottiglia.BottigliaConTappo = " +
                     (a10 instanceof BottigliaConTappo)); // true
   System.out.println( "b10 instanceof Bottiglia.BottigliaConTappo = " +
                     (b10 instanceof BottigliaConTappo)); // false
   System.out.println( "u=null instanceof Bottiglia.BottigliaConTappo = " +
                     (u instanceof BottigliaConTappo)); // false
   System.out.println();
   System.out.println( "a10 instanceof Bottiglia.Bottiglia = " +
                     (a10 instanceof Bottiglia)); // true
   System.out.println( "b10 instanceof Bottiglia.Bottiglia = " +
                     (b10 instanceof Bottiglia)); // true
   System.out.println( "u=null instanceof Bottiglia.Bottiglia = " +
                     (u instanceof Bottiglia)); // false
   }
}
