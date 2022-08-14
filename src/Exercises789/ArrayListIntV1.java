package Exercises789;

import java.util.ArrayList;

public class ArrayListIntV1 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>();

        // Rellenar el array con los números del 1 al 10
        for (int i = 0; i < 10; i++) {
            list.add(i+1);
        }

       // Eliminar del array los elementos pares
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                list.remove(i);
            }
        }
        // Mostrar el array
        for (int value: list) {
            System.out.println(value);
        }
    }
}
