package com.dactech.animalfarm.Factory;

import com.dactech.animalfarm.Animal;
import com.dactech.animalfarm.Duck;

import java.util.ArrayList;
import java.util.List;

public class DuckFactory implements AnimalFactory {
    public static DuckFactory instance(){
        return new DuckFactory();
    }

    @Override
    public List<Animal> create(int count) {
        List<Animal> ducks = new ArrayList<>();
        for (int i = 0; i < count; i++){
            ducks.add(new Duck("com.dactech.animalfarm.Duck " + i+i));
        }
        return ducks;
    }
}
