package com.teoria.CodiceProf;

public class MyClass {
    int intAttribute = 0;
    String stringAttribute = "initial string";


    private MyClass() {
        this.intAttribute = 5;
        this.stringAttribute = "initial string";
    }

    public MyClass(int intAttribute, String stringAttribute) {
        this.intAttribute = intAttribute;
        this.stringAttribute = stringAttribute;
    }


    public MyClass(String stringAttribute) {
        this();
        this.stringAttribute = stringAttribute;
    }

    public static void main(String[] args) {
	    MyClass myObject = new MyClass("a valid value");
	    System.out.println("\n\nthis is my object's printout: "+ myObject);
    }

    @Override
       public String toString() {
           return "MyClass{" +
                   "intAttribute=" + intAttribute +
                   ", stringAttribute='" + stringAttribute + '\'' +
                   '}';
       }
}
