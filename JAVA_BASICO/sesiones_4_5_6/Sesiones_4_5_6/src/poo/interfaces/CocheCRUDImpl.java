package poo.interfaces;

public class CocheCRUDImpl implements CocheCRUD{

    String marca;
    String modelo;

    public CocheCRUDImpl(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }


    @Override
    public void save() {

    }

    @Override
    public void findAll() {

    }

    @Override
    public void delete() {

    }

    @Override
    public String toString() {
        return "CocheCRUDImpl{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
