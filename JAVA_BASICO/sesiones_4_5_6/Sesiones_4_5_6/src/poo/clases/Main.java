package poo.clases;

import poo.herencia.SmartPhone;
import poo.herencia.SmartWatch;

public class Main {

    public static void main(String[] args) {

        SmartPhone Y9 = new SmartPhone(100, 10,20,"Huawei","Y9 2019","Snapdragon", 650000, false);
        SmartWatch Band7 = new SmartWatch(50,20,20,"Huawei","Band 7","Snapdragon",1000000, "Acero");

        System.out.println(Y9.cargarBateria(100));
        System.out.println(Band7.cargarBateria(50));
    }
}
