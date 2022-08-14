package Exercises789;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ProgramaLibre {

    /**
     * La aplicación leerá un fichero de entrada que contendrá el año de nacimiento
     * de los usuarios con el siguiente formato:
     * <nombre>%<año de nacimiento>
     * El programa generará un fichero .csv con la información contenida en el fichero
     * con aquellos usuarios nacidos posterior al 1974.
     * Al finalizar, mostrará en pantalla los usuarios no introducidos en el fichero .csv
     * @param args
     */
    public static void main(String[] args) {

        // Directorio de fichero de entrada
        File fileIn = new File("C:\\Users\\japar\\IdeaProjects\\Bootcamp\\Java_Begin\\src\\Exercises789\\UserIn.txt");
        // Directorio de fichero .csv
        File fileOut = new File("C:\\Users\\japar\\Ideaprojects\\Bootcamp\\Java_Begin\\src\\Exercises789\\UserOut.csv");

        // Leer fichero de entrada y cargar en un Hashmap;
        HashMap<String, Integer> userYear = leerFichero(fileIn);

        // Crear fichero de salida y mostrar en pantalla los usuarios no incluidos en el fichero
        crearFicheroOut(userYear, fileOut);

    }

    public static HashMap<String, Integer> leerFichero(File fileIn) {

        HashMap<String, Integer> map = new HashMap<String, Integer>();
        String[] userYear = new String[2];

        try {

            // Abrir fichero de entrada para lectura
            InputStream input = new FileInputStream(fileIn);
            Scanner reader = new Scanner(input);

            // Leemos línea a línea el fichero y almacenamos en el HashMap los datos
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                // Partir la línea del fichero por el separador "%" y almacener en array
                userYear = line.split("%");
                // Asignar el primer valor del array como Key y el segundo como value en el HashMap
                map.put(userYear[0], Integer.parseInt(userYear[1]));
            }

            // Cerramos fichero de entrada
            reader.close();

        }catch (FileNotFoundException e) {
            System.out.println("Error: " + e.getLocalizedMessage());
        }

        return map;
    }

    public static void crearFicheroOut(HashMap<String, Integer> map, File fileOut) {

        /** Crear fichero de salida con los usuarios nacidos desde 1974
         *  El resto se mostrarán por pantalla
        */

        try {
            // Creamos fichero de salida
            PrintStream output = new PrintStream(fileOut);

            for (Map.Entry<String, Integer> dato : map.entrySet()){
                if (dato.getValue() >= 1974) {
                    output.println(dato.getKey() + ";" + dato.getValue());
                } else {
                    System.out.println(dato.getKey());
                }
            }

            // Cerramos fichero de salida
            output.close();

        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e.getLocalizedMessage());
        }

    }
}
