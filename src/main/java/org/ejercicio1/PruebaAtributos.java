package org.ejercicio1;

/**
 * Hello world!
 *
 */
public class PruebaAtributos
{
    public static void main( String[] args )
    {
        int n = 123; // Guarda un número entero
        short corto=23; // Guarda un número entero y el limite es mas chico que el de int
        byte muyCorto1; // Guarda un número entero de -128 a 127
        String palabra = "hola"; // Guarda una palabra u oración dentro
        char letra = 'a'; // Toma una sola letra, indicando el indice de la palabra (el indice comienza en 0)
        double numConComa = 2.13; // Se utiliza el punto como una "coma"
        float numConComaCorto = 1.14f; // Al final del número debe de ir una "f" indicando de que es float.
        boolean resultado = true; // Siempre los valores varian entre "true" o "false"

        System.out.println( "Hello World!" );


    }
}
