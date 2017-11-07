package com.dactech.animalfarm.Factory;

import com.dactech.animalfarm.Animal;
import com.dactech.animalfarm.Pig;

import java.util.ArrayList;
import java.util.List;

public class PigFactory implements AnimalFactory{
    public static PigFactory instance(){
        return new PigFactory();
    }
    @Override
    public List<Animal> create(int count) {
        List<Animal> pigs = new ArrayList<>();
        for (int i = 0; i < count; i++){
            pigs.add(new Pig("com.dactech.animalfarm.Duck " + i+i));
        }
        return pigs;
    }
}
