package Exercises789;

import java.io.File;
import java.io.PrintStream;
import java.util.Scanner;

public class Ficherosv2 {

    public static void main(String[] args) {
        File fileIn = new File("C:\\Users\\japar\\IdeaProjects\\Bootcamp\\Java_Begin\\src\\Exercises789\\FicheroIn.txt");
        File fileOut = new File("C:\\Users\\japar\\Ideaprojects\\Bootcamp\\Java_Begin\\src\\Exercises789\\FicheroOut2.txt");

        copiarFichero(fileIn, fileOut);
    }

    public static void copiarFichero(File fileIn, File fileOut) {

        try {
            // Creamos fichero de salida
            PrintStream output = new PrintStream(fileOut);


            // Leemos fichero de entrada
            Scanner input = new Scanner(fileIn);
            while (input.hasNextLine()) {
                // Leemos línea a línea el fichero y escribimos cada una de ellas en fichero de salida
                String line = input.nextLine();
                output.println(line);
            }

            // Cerramos ficheros de entrada y salida una vez finalizo el proceso.
            input.close();
            output.close();

            // Escribimos mensaje de confirmación si todo ha ido bien
            System.out.println("El proceso se ha realizado correctamente");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
