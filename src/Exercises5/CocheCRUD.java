package Exercises5;

import java.util.List;

public interface CocheCRUD {

    //Métodos
    void save(Coche car);

    List<Coche> findAll();

    void delete(Coche car);

}
