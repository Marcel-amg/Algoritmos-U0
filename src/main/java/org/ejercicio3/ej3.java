package org.ejercicio3;

public class ej3 {

    public static void main(String[] args){
        int max_cont = 10;
        int cont = 0;
        while (cont != max_cont){
            System.out.println(cont);
            cont++;
        }

        for (int i = 0; i < max_cont; i++ ){
            System.out.println(i);
        }

        do {
            System.out.println(cont);
            cont++;
        } while (cont != max_cont);
    }
}
