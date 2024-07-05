package com.aluracursos.appconversor.principal;

import com.aluracursos.appconversor.models.ConsultaRate;
import com.aluracursos.appconversor.models.Conversor;
import com.aluracursos.appconversor.models.Moneda;

import java.net.URISyntaxException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int salida = 0;
        int input = 0;
        double valor = 0.0;
        Scanner teclado = new Scanner(System.in);
        String mensaje = "Ingrese el valor que desea convertir : ";
        Moneda MonedaBase = new Moneda();
        Moneda MonedaCambio = new Moneda();
        while(salida != 1){
            System.out.println("""
                    ***********************************************************
                    Sea bienvenido al conversor de moneda""");
            System.out.println("Seleccione una opcion :");
            System.out.println("""
                    1) Dolar =>> Peso Argentino
                    2) Peso Argentino =>> Dolar 
                    3) Dolar =>> Real brasileño
                    4) Real brasileño =>> Dolar
                    5) Dolar =>> Peso Colombiano
                    6) Peso Colombiano =>> Dolar
                    7) Salir""");
            System.out.println("******************************************************");
            System.out.println("Elija una opcion valida");
            try {
                input = teclado.nextInt();
            }catch (InputMismatchException e){
                System.out.println("Por favor digite un numero valido: ");
                teclado.next(); //se limpia para volver a preguntar
            }
            switch (input){
                case 1:
                    MonedaBase.setCurrencyCode("USD");
                    MonedaCambio.setCurrencyCode("ARS");
                    System.out.println(mensaje);
                    try {
                    valor = teclado.nextDouble();
                    MonedaBase.setValue(valor);
                        ConsultaRate nuevaConsulta = new ConsultaRate("USD", "ARS");
                        double rate = nuevaConsulta.Consulta();
                        Conversor nuevaConversion = new Conversor(MonedaCambio,MonedaBase);
                        nuevaConversion.getConversion(rate);
                    }catch (URISyntaxException e) {
                        throw new RuntimeException(e);
                    }catch (InputMismatchException e){
                        break;
                    }
                    break;
                case 2:
                    MonedaBase.setCurrencyCode("ARS");
                    MonedaCambio.setCurrencyCode("USD");
                    System.out.println(mensaje);
                    try {
                    valor = teclado.nextDouble();
                    MonedaBase.setValue(valor);
                        ConsultaRate nuevaConsulta = new ConsultaRate("ARS", "USD");
                        double rate = nuevaConsulta.Consulta();
                        Conversor nuevaConversion = new Conversor(MonedaCambio,MonedaBase);
                        nuevaConversion.getConversion(rate);
                    }catch (URISyntaxException e) {
                        throw new RuntimeException(e);
                    }catch (InputMismatchException e){
                        break;
                    }
                    break;
                case 3:
                    MonedaBase.setCurrencyCode("USD");
                    MonedaCambio.setCurrencyCode("BRL");
                    System.out.println(mensaje);
                    try {
                    valor = teclado.nextDouble();
                    MonedaBase.setValue(valor);
                        ConsultaRate nuevaConsulta = new ConsultaRate("USD", "BRL");
                        double rate = nuevaConsulta.Consulta();
                        Conversor nuevaConversion = new Conversor(MonedaCambio,MonedaBase);
                        nuevaConversion.getConversion(rate);
                    }catch (URISyntaxException e) {
                        throw new RuntimeException(e);
                    }catch (InputMismatchException e){
                        break;
                    }
                    break;
                case 4:
                    MonedaBase.setCurrencyCode("BRL");
                    MonedaCambio.setCurrencyCode("USD");
                    System.out.println(mensaje);
                    try {
                    valor = teclado.nextDouble();
                    MonedaBase.setValue(valor);
                        ConsultaRate nuevaConsulta = new ConsultaRate("BRL", "USD");
                        double rate = nuevaConsulta.Consulta();
                        Conversor nuevaConversion = new Conversor(MonedaCambio,MonedaBase);
                        nuevaConversion.getConversion(rate);
                    }catch (URISyntaxException e) {
                        throw new RuntimeException(e);
                    }catch (InputMismatchException e){
                        break;
                    }
                    break;
                case 5:
                    MonedaBase.setCurrencyCode("USD");
                    MonedaCambio.setCurrencyCode("COP");
                    System.out.println(mensaje);
                    try {
                    valor = teclado.nextDouble();
                    MonedaBase.setValue(valor);
                        ConsultaRate nuevaConsulta = new ConsultaRate("USD", "COP");
                        double rate = nuevaConsulta.Consulta();
                        Conversor nuevaConversion = new Conversor(MonedaCambio,MonedaBase);
                        nuevaConversion.getConversion(rate);
                    }catch (URISyntaxException e) {
                        throw new RuntimeException(e);
                    }catch (InputMismatchException e){
                        break;
                    }
                    break;
                case 6:
                    MonedaBase.setCurrencyCode("COP");
                    MonedaCambio.setCurrencyCode("USD");
                    System.out.println(mensaje);
                    try {
                    valor = teclado.nextDouble();
                    MonedaBase.setValue(valor);
                        ConsultaRate nuevaConsulta = new ConsultaRate("COP", "USD");
                        double rate = nuevaConsulta.Consulta();
                        Conversor nuevaConversion = new Conversor(MonedaCambio,MonedaBase);
                        nuevaConversion.getConversion(rate);
                    }catch (URISyntaxException e) {
                        throw new RuntimeException(e);
                    }catch (InputMismatchException e){
                        break;
                    }
                    break;
                case 7:
                    salida = 1;
                    break;
            }
        }

    }
}
