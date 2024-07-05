package com.aluracursos.appconversor.models;

public class Moneda {
    private String currencyCode;
    private double value;

    public Moneda() {
        this.currencyCode = "";
        this.value= 0.0;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }


    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
