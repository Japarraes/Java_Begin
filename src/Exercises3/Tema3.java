package Exercises3;

import java.util.ArrayList;
import java.util.List;

public class Tema3 {

    public static void main(String[] args) {

        /**
         * * Crear un bucle que permita concatenar textos
         *   e imprima el resultado final por consola
         */

        // Usando array de String
        String[] nombres = {"Juan", "Pepe", "Manolo", "Alberto"};
        String texto = concatenarTexto(nombres);
        System.out.println(texto);

        // Usando Listas
        List<String> nombres2 = new ArrayList<String>();
        nombres2.add("Aurora");
        nombres2.add("Blanca");
        nombres2.add("Miriam");
        nombres2.add("Elena");
        texto = concatenarTexto(nombres2);
        System.out.println(texto);

    }

    public static String concatenarTexto(String[] names) {

        String oneText = "";

        for (String name : names) {
            oneText += name + " ";
        }

        return oneText;
    }
    public static String concatenarTexto(List<String> names){

        /* Pasamos la Lista a un String y llamamos a la función que recibe un String */
        String[] text = new String[names.size()];

        int i = 0;
        while (i <= names.size()-1){
            text[i] = names.get(i);
            i++;
        }

        return concatenarTexto(text);

    }

}

