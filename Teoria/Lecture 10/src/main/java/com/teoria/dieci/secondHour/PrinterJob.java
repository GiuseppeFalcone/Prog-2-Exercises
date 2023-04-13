package com.teoria.dieci.secondHour;

public class PrinterJob {
    String id;
    String testo;

    public PrinterJob(String id, String testo) {
        this.id = id;
        this.testo = testo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTesto() {
        return testo;
    }

    public void setTesto(String testo) {
        this.testo = testo;
    }
}
