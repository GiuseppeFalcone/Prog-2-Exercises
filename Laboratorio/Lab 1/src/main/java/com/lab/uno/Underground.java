package com.lab.uno;

public class Underground {
    private String id = "";
    private int line = -1;

    private int nxtStation = -1;

    public String getId() {
        return id;
    }

    public Underground (String id, int line, int nxtStation){
        this.id = id;
        this.line = line;
        assert nxtStation < 0 || nxtStation > 10 : "Error! line number has to be between 0 and 9!";
        this.nxtStation = nxtStation;
    }

    public int updateNxtStation(){
        nxtStation = ((nxtStation + 1) % 10);
        return nxtStation;
    }

    public String toString(){
        return "The train with: \n\tid: " + id + "\n\ton the line: " + line + "\n\twill arrive to:" + nxtStation;
    }
    public static void main(String[] args) {
        Underground train1 = new Underground("aa123", 68, 6);
        Underground train2 = new Underground("bb321", 16, 8);
        System.out.println(train1.toString());
        for(int ix = 0; ix < 2; ix++){
            train1.updateNxtStation();
            System.out.println(train1.toString());
        }

        System.out.println(train2.toString());
        for(int ix = 0; ix < 2; ix++){
            train2.updateNxtStation();
            System.out.println(train2.toString());
        }
    }
}