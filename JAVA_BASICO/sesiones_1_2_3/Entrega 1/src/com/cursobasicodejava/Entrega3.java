package com.cursobasicodejava;

public class Entrega3 {

    public static void main(String[] args) {

        String[] nombres = {"Pepita", "Juanita", "Manolito", "Susanita"};

        String resultado = concatenar(nombres);

        System.out.println(resultado);
    }

    static String concatenar(String[] nombres) {

        String resultado = "";

        for(String nombre : nombres) {
            resultado = resultado + " " + nombre;
        }
        return resultado;
    }
}
