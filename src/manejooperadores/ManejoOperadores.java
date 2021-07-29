package manejooperadores;


public class ManejoOperadores {

   
    public static void main(String[] args) {
        
        /*
        //declaración de variables
        int numero1;
        int numero2;
        int resultado;

        //inicialización de variables
        numero1 = 5;
        numero2 = 10;

        resultado = numero1 + numero2;
        System.out.println(resultado);

        //Manejo de tipos de datos:
        int entero = 4;

        byte bite = 1;
        char caracter = 'm';
        double numDouble = 8.4;
        float flotante = 9;
        boolean estado = false;
        String cadena = "Esta es una variables de texto";
        long largo = 9;

        System.out.println("El valor del tipo byte: " + bite);
        System.out.println("El valor del tipo char: " + caracter);
        System.out.println("El valor del tipo int:" + entero);
        System.out.println("El valor del tipo caracter:" + caracter);
        System.out.println("El valor del tipo Double:" + numDouble);
        System.out.println("El valor del tipo float:" + flotante);
        System.out.println("El valor del tipo Boolean:" + estado);
        System.out.println("El valor del tipo Texto:" + cadena);
        System.out.println("El valor del tipo Long:" + largo);
    */
        
        operaciones op = new operaciones();
        op.hacerSuma(2, 3);
        op.hacerResta(5, 2);
        op.imprimirResultado();

    }
}
