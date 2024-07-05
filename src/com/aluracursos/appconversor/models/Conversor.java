package com.aluracursos.appconversor.models;

public class Conversor {
    private Moneda monedaBase;
    private Moneda monedaCambio;

    public Conversor(Moneda monedaCambio, Moneda monedaBase) {
        this.monedaCambio = monedaCambio;
        this.monedaBase = monedaBase;
    }

    public void getConversion(double exchangeRate){
        double valor;
        valor = monedaBase.getValue()*exchangeRate;
        monedaCambio.setValue(valor);
        System.out.println(" El valor " + String.format("%.1f", monedaBase.getValue()) + "[" + monedaBase.getCurrencyCode() + "]" +
                " corresponde al valor final de =>>> " + String.format("%.1f", monedaCambio.getValue()) + "[" + monedaCambio.getCurrencyCode() + "]");

    }
}
