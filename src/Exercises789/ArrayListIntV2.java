package Exercises789;

import java.util.ArrayList;

public class ArrayListIntV2 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>();

        // Rellenar el array con los números del 1 al 10, pero solo los impares
        for (int i = 0; i <= 10; i++) {
            if (i % 2 != 0) {
                list.add(i);
            }
        }

        // Mostrar el array
        for (int value: list) {
            System.out.println(value);
        }
    }
}
