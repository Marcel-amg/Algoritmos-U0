package org.ejercicio7;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class ej7 {

    public static void main(String [] args){
        String hannah = "Did Hannah see bees? Hannah did.";
        String frase = "Anita lava la tina";
        //Lista
        ArrayList<String> lista = new ArrayList<>();

        //substring
        String palabra = hannah.substring(4,11);
        System.out.println(palabra);

        //subSequence --> funciona muy similar a substring
        System.out.println(hannah.subSequence(0,4));

        //toLowerCase() --> Convierte todo a minuscula
        System.out.println(frase.toLowerCase());
        //toUpperCase() --> Convierte todo a mayuscula
        System.out.println(frase.toUpperCase());
        //split --> Recorta la palabra segun por lo que le indiques
        String[] partes = frase.split(" ");
        //Lo guardo en la lista
        for (String p : partes){
            lista.add(p);
        }
        //Muestro la lista
        System.out.println(lista);

        //indexOf --> te devuelve el indice donde se encuentra lo que desesas buscar
        System.out.println(palabra.indexOf(" "));
        String palabra1 = palabra.trim();
        //lastIndexOf() --> busca desde el ultimo
        System.out.println(palabra1.lastIndexOf(" "));
        //Contains --> te sirve para saber si contiene una palabra 'x'
        System.out.println(frase.contains("Anita"));

        //replace() --> remplaza unicamente lo que le indicamos
        String nuevoFrase = frase.replace("Anita", "ANITA");
        System.out.println(nuevoFrase);

        //replaceAll() --> remplaza tdoos los lugares libres por lo que le indiquemos. Si queremos cambiar
        // todos los números se coloca "//d"
        String text = hannah.replaceAll(" ", "_");
        System.out.println(text);

        //replaceFirst() --> remplaza la primera incidencia
        String text2 = hannah.replaceFirst(" ", "_");
        System.out.println(text2);


    }

}
