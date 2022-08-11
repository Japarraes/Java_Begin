package Exercises5;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Implemantar objeto del interface implementado
        CocheCRUD cocheCrud = new CocheCRUDImpl();

        // Creamos objetos de la clase Coche
        Coche coche1 = new Coche("Ford", "Mondeo", "Blanco");
        Coche coche2 = new Coche("Seat", "Altea", "Burdeos");
        Coche coche3 = new Coche("BMW", "C600", "Negro");

        // Guardamos los objetos empleados usando el interfaz implementado
        cocheCrud.save(coche1);
        cocheCrud.save(coche2);
        cocheCrud.save(coche3);

        // Listamos los objetos guardados usando el interfaz implementado
        List<Coche> coches = cocheCrud.findAll();
        System.out.println(coches);

        //Borramos un objetos y volvemos a imprimir usando el interfaz implementado
        cocheCrud.delete(coche1);
        coches = cocheCrud.findAll();
        System.out.println(coches);

    }
}
