package Exercises789;

import java.io.*;

public class FicherosV1 {

    public static void main(String[] args) {

        String fileIn = "C:\\Users\\japar\\IdeaProjects\\Bootcamp\\Java_Begin\\src\\Exercises789\\FicheroIn.txt";
        String fileOut = "C:\\Users\\japar\\Ideaprojects\\Bootcamp\\Java_Begin\\src\\Exercises789\\FicheroOut.txt";

        copiarFichero(fileIn, fileOut);
    }

    public static void copiarFichero(String fileIn, String fileOut){

        try {
            InputStream input = new FileInputStream(fileIn);
            PrintStream output = new PrintStream(fileOut);

            try {
                // Leemos todo el fichero de entrada en memoria
                byte []datos = input.readAllBytes();

                // Escribimos todos los datos en el fichero de salida.
                output.write(datos);

                // Cerramos fichero de entrada y salida
                input.close();
                output.close();
                System.out.println("Fichero creado correctamente");

            }catch (IOException e) {
                System.out.println("Error: " + e.getLocalizedMessage());
            }

        }catch (FileNotFoundException e) {
            System.out.println("Error: " + e.getLocalizedMessage());
        }

    }
}