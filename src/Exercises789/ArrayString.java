package Exercises789;

public class ArrayString {

    public static void main(String[] args) {

        String dispositivos[] = new String[5];
        dispositivos[0] = "Ordenador";
        dispositivos[1] = "Tablet";
        dispositivos[2] = "Movil";
        dispositivos[3] = "Smartwatch";
        dispositivos[4] = "Pendrive";

        //Recorrer array 'dispositivos' para mostrar valores
        for (String dispositivo: dispositivos) {
            System.out.println(dispositivo);
        }

        //Otra forma de recorrer array 'dispositivos' para mostrar valores
        for (int i = 0; i < dispositivos.length; i++){
            System.out.println(dispositivos[i]);
        }
    }
}
