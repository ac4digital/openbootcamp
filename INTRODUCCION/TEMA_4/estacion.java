public class Main {

    public static void main(String[] args) {
        
        var estacion = "Invierno";
        
        switch (estacion) {
            case "Verano": System.out.println("Es Verano");
                            break;
            case "Invierno": System.out.println("Es Invierno");
                            break;
            case "Primavera": System.out.println("Es Primavera");
                            break;
            case "Otono": System.out.println("Es Otono");
                            break;
            default: System.out.println("No es una estacion");
        }
 
    }
}