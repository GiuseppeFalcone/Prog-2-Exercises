package com.lab.lab1;

public class Underground {
    private String id = "";
    private int route;
    private int nextStation;

    private Underground(){
        id = null;
        route = -1;
        nextStation = -1;
    }

    public Underground(String num, int route, int nxt){
        id = num;
        this.route = route;
        nextStation = nxt;
    }

    public String getId(){
        return id;
    }
    private void setId(String num){
        id = num;
    }

    public int getRoute(){
        return route;
    }
    private void setRoute(int route){
        if (route >= 0) {this.route = route;}
        else
            System.out.println("Route number Error\n It has to be positive");
    }

    public int getNextStation(){
        return nextStation;
    }

    private void setNextStation(int nxt){
        if (nxt >= 0 && nxt <= 9){
            nextStation = nxt;
        } else {
            System.out.println("Error next station number incorrect\nIt has to be between 0 and 9");
        }
    }



    public String toString(){
        return "The Train number: " + id + " on the route: " + route +
                " is going to serve next the station: " + nextStation;
    }

    public int updateNextStation(){
        nextStation = ((nextStation + 1) % 10);
        return nextStation;
    }

    public static void main(String[] args) {
        Underground train1 = new Underground("Train 1", 1, 5);
        Underground train2 = new Underground("Train 2", 1, 8);

        for (int i = 0; i <= 1; i++){
            System.out.println("Next Station for Train 1: " + train1.updateNextStation());
        }

        for (int i = 0; i <= 1; i++){
            System.out.println("Next Station for Train 2: " + train2.updateNextStation());
        }

    }

}
