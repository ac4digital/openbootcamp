package poo.herencia;

import poo.clases.SmartDevice;

public class SmartWatch extends SmartDevice {

    String correa;

    public SmartWatch() {

    }

    public SmartWatch(double peso, double ancho, double alto, String marca, String modelo, String procesador, double precio, String correa) {
        super(peso, ancho, alto, marca, modelo, procesador, precio);
        this.correa = correa;
    }
}
