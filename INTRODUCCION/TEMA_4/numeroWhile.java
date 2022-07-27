public class Main {

    public static void main(String[] args) {

        var numeroWhile = 0;

        while (numeroWhile < 3) {
            System.out.println(numeroWhile);
            numeroWhile++;
        }
        
        numeroWhile = 0;
        
        do {
            System.out.println(numeroWhile);
            numeroWhile++;
        } while (numeroWhile < 0);
    }
}