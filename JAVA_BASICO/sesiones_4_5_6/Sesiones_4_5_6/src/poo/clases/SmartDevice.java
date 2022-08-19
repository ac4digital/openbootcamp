package poo.clases;

// Clase Padre, Superclase o Clase Base

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

}
