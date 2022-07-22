class Main {
    public static void main(String[] args) {
        int resultado = suma(5, 10, 15);
        System.out.println("El resultado de la suma es: "); 
        System.out.println(resultado);        
    }
    
    public static int suma(int a, int b, int c){
        return a + b + c;
    }
}