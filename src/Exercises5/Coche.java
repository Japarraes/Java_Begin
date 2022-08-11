package Exercises5;

public class Coche {
    // Atributos
    String fabricante;
    String modelo;
    String color;




    // Constructor
    public Coche() {

    }
    public Coche(String fabricante, String modelo, String color){
        this.fabricante = fabricante;
        this.color = color;
        this.modelo = modelo;
    }

        // Método toString() para imprimir todos los atributos de la clase
    @Override
    public String toString() {
        return "Coche{" +
                "fabricante = '" + fabricante + '\'' +
                ", color = '" + color + '\'' +
                ", modelo = '" + modelo + '\'' +
                '}';
    }
}
