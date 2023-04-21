package com.teoria.dieci.secondHour;

public class PrinterJob {
    String id;
    String text;

    public PrinterJob(String id, String testo) {
        this.id = id;
        this.text = testo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
