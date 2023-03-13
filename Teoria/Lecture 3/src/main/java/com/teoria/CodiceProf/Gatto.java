package com.teoria.CodiceProf;


public class Gatto {
   String name;
   int age;

   public boolean equals(Gatto otherCat){
      return (this.name.equals(otherCat.name) && this.age == otherCat.age);
   }


   public static void main(String[] args) {
      Gatto tramot1 = new Gatto();
      tramot1.name= "Tramot";
      tramot1. age = 12;
      Gatto tramot2 = new Gatto();
      tramot2.name= "Tramot";
      tramot2. age = 12;

      System.out.println("\n\nTramot1: "+ tramot1);
      System.out.println("\n\nTramot2: "+ tramot2);

      System.out.println("Are they equal? "+ tramot1.equals(tramot2));

   }
}
