package poo.herencia;

import poo.clases.SmartDevice;

public class SmartPhone extends SmartDevice {

    boolean teclado;

    public SmartPhone() {

    }

    public SmartPhone(double peso, double ancho, double alto, String marca, String modelo, String procesador, double precio, boolean teclado) {
        super(peso, ancho, alto, marca, modelo, procesador, precio);
        this.teclado = teclado;
    }
}
