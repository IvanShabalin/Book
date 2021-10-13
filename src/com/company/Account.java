package com.company;

public class Account {
    private  int id;
    private double amont;

    public Account(int id, double amont) {
        super();
        this.id = id;
        this.amont = amont;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getAmont() {
        return this.amont;
    }

    public void setAmont(double amont) {
        this.amont = amont;
    }





}
