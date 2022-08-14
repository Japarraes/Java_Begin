package Exercises789;

public class ArrayBidimensional {

    public static void main(String[] args) {

        // Array de 2 filas y 3 columnas
        Integer matriz[][] = {
                {10, 20, 30},
                {40, 50, 60}
        };

        // Mostrar cada item del la matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Posicion[" + i + "][" + j + "]: " + matriz[i][j]);
            }
        }
    }
}
