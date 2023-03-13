class Person{
    public String telephoneNumber;
    String getTelephoneNumber() {
        //nota non è necessario usare this perché non c’è ambiguità
        return telephoneNumber;
    }
        // in setTelephoneNumber invece dobbiamo usare this perché
        // il parametro ha lo stesso nome e quindi dobbiamo
        // esplicitamente indicare quale è l’attributo.
        // Se avessimo chiamato il parametro e.g.
        // number allora il this non sarebbe stato necessario
    void setTelephoneNumber (String telephoneNumber){
            this.telephoneNumber = telephoneNumber;
        }
    }
