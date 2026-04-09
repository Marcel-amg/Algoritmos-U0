package org.ejercicio6;
import java.util.Scanner;

public class ej6 {

    public static String multisuma (int a, int b, int c){
        int suma = (a*b)+c;
        return "La suma es: " + suma;
    }

    public static String multisumaConComa (double d, double e, double f){
        double suma = (d*e)+f;
        return "La suma es: " + suma;
    }

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese que tipo de multisuma va a hacer: \n1 - Entera \n2 - Con decimal \nIngrese 1 o 2:");
        int num = scanner.nextInt();

        if (num == 1) {
            System.out.println("Ingrese un numero a: ");
            int a = scanner.nextInt();


            System.out.println("Ingrese un numero b: ");
            int b = scanner.nextInt();

            System.out.println("Ingrese un numero c: ");
            int c = scanner.nextInt();

            System.out.println(multisuma(a, b, c));
        }
        if (num == 2){
            System.out.println("Ingrese un numero d: ");
            double d = scanner.nextDouble();


            System.out.println("Ingrese un numero e: ");
            double e = scanner.nextDouble();

            System.out.println("Ingrese un numero f: ");
            double f = scanner.nextDouble();

            System.out.println(multisumaConComa(d, e, f));
        }
        else{
            System.out.println("No ingreso ninguna de las opciones.");
        }
    }
}
