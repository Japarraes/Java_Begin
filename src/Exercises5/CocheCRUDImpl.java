package Exercises5;

import java.util.ArrayList;
import java.util.List;

public class CocheCRUDImpl implements CocheCRUD{

    List<Coche> coches = new ArrayList<Coche>();

    @Override
    public void save(Coche car) {
        coches.add(car);
    }

    @Override
    public List<Coche> findAll() {
        return coches;
    }

    @Override
    public void delete(Coche car) {
        coches.remove(car);
    }

}
