package com.dactech.animalfarm;

import com.dactech.animalfarm.Factory.ChickenFactory;
import com.dactech.animalfarm.Factory.DuckFactory;
import com.dactech.animalfarm.Factory.PigFactory;

import java.util.ArrayList;
import java.util.List;

public class App{

    public static void main(String[] args){

        Farm farm = new Farm();
        List<Animal> animals = new ArrayList<>();
        List<Duck> ducks = new ArrayList<>();
        for (int index = 0; index < 10; index++){
            ducks.add(new Duck("com.dactech.animalfarm.Duck " + index));
        }

        List<Animal> ducksTest = DuckFactory.instance().create(4);
//        farm.addAnimal(ducksTest);

        for (int i = 0; i < ducks.size(); i++){
            ducks.get(i).displayName();
        }



    }
}