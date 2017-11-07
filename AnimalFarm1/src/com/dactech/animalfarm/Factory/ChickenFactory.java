package com.dactech.animalfarm.Factory;

import com.dactech.animalfarm.Animal;
import com.dactech.animalfarm.Chicken;

import java.util.ArrayList;
import java.util.List;

public class ChickenFactory implements AnimalFactory{
    public static DuckFactory instance(){
        return new DuckFactory();
    }
    @Override
    public List<Animal> create(int count) {
        List<Animal> chicken = new ArrayList<>();
        for (int i = 0; i < count; i++){
            chicken.add(new Chicken("com.dactech.animalfarm.Chicken 0" + i));
        }

        return chicken;
    }
}
