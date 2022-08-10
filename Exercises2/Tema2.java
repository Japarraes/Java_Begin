package Exercises2;

public class Tema2 {

    /**
     * Crear una función que reciba un precio y devuelva el precio con el IVA incluido.
     * @param args
     */
    public static void main(String[] args) {

        System.out.println(calcularIva(100d));
        System.out.println(calcularIva(99.99d));
        System.out.println(calcularIva(19.10d));
    }
    public static double calcularIva(double importe){
        return (importe * 1.21d);
    }
}
