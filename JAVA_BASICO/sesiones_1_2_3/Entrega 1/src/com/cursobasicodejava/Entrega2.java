package com.cursobasicodejava;

public class Entrega2 {

    public static void main(String[] args) {

        double precio = 55000;

        double resultado = calcularIVA(precio);

        System.out.println(resultado);

    }

    static double calcularIVA(double precio) {

        double costo = precio * 1.19;

        return costo;
    }
}
