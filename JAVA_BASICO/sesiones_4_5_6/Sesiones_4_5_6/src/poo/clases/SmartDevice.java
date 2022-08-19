package poo.clases;

// Clase Padre, Superclase o Clase Base

import poo.herencia.SmartPhone;
import poo.herencia.SmartWatch;

public abstract class SmartDevice {
    // 1. Atributos
    protected double peso;
    protected double ancho;
    protected double alto;
    protected String marca;
    protected String modelo;
    protected String procesador;
    protected double precio;
    protected int bateria = 0;

    // 2. Constructores
    public SmartDevice(){

    }

    public SmartDevice(double peso, double ancho, double alto, String marca, String modelo, String procesador, double precio) {
        this.peso = peso;
        this.ancho = ancho;
        this.alto = alto;
        this.marca = marca;
        this.modelo = modelo;
        this.procesador = procesador;
        this.precio = precio;

    }

    // 3. Metodos

    public int cargarBateria(int bateria) {
        if ((bateria > 0) && (bateria <= 100))
            this.bateria += bateria;
        return this.bateria;
    }

    public class SmartPhone extends SmartDevice {

        boolean teclado;

        public SmartPhone() {

        }

        public SmartPhone(double peso, double ancho, double alto, String marca, String modelo, String procesador, double precio, boolean teclado) {
            super(peso, ancho, alto, marca, modelo, procesador, precio);
            this.teclado = teclado;
        }
    }

    public class SmartWatch extends SmartDevice {

        String correa;

        public SmartWatch() {

        }

        public SmartWatch(double peso, double ancho, double alto, String marca, String modelo, String procesador, double precio, String correa) {
            super(peso, ancho, alto, marca, modelo, procesador, precio);
            this.correa = correa;
        }
    }

    public static void main(String[] args) {

        poo.herencia.SmartPhone Y9 = new poo.herencia.SmartPhone(100, 10,20,"Huawei","Y9 2019","Snapdragon", 650000, false);
        poo.herencia.SmartWatch Band7 = new poo.herencia.SmartWatch(50,20,20,"Huawei","Band 7","Snapdragon",1000000, "Acero");

        System.out.println(Y9.cargarBateria(100));
        System.out.println(Band7.cargarBateria(50));
    }

}
