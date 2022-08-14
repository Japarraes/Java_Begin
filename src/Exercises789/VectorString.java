package Exercises789;

import java.util.Vector;

public class VectorString {

    public static void main(String[] args) {

        Vector<String> vString = new Vector<String>(5);
        vString.add("a");
        vString.add("b");
        vString.add("c");
        vString.add("d");
        vString.add("e");

        // Mostrar vector completo
        System.out.println("El vector completo es: ");
        for (String vector : vString){
            System.out.println(vector);
        }

        // Eliminar el 2º y 3º elemento del vector. Empezamos por el de índice mayor
        // para no alterar el indice del los registros anteriores que queremos borrar
        vString.remove(2); // Eliminar el valor en posición 3
        vString.remove(1); // Eliminar el valor en posición 2

        // Mostrar vector tras el borrado
        System.out.println("El vector modificado es: ");
        for (String vector : vString){
            System.out.println(vector);
        }

    }
}
