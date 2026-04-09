package org.ejercicio4;

public class ej4 {

    public static int factorial(int num){
        int resultado = 1;
        for (int i = 1; i <= num; i++){
            resultado *= i;
        }
        return resultado;
    }
    public static void main(String[] args){
        System.out.println(factorial(3));
    }
}
