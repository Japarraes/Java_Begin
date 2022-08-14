package Exercises789;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListString {

    public static void main(String[] args) {

        // Crear ArraList de 4 elementos
        ArrayList<String> list = new ArrayList<String>();
        list.add("Juan");
        list.add("Pepe");
        list.add("Maria");
        list.add("Miriam");

        // Copiar 'list' en un LinkedList
        LinkedList listaEnlazada = new LinkedList<String>(list);

        // Recorrer ambos mostrando únicamente el valor de cada elemento
        for (String lista: list) {
            System.out.println(lista);
        }
        for (int i = 0; i < listaEnlazada.size(); i++) {
            System.out.println(listaEnlazada.get(i));
        }



    }
}
