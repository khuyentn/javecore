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
//        List<Duck> ducks = new ArrayList<>();
//        farm.setDucks(animals);
//       animals = farm.getDucks();
//        for (int index = 0; index < 10; index++){
//            ducks.add(new Duck("com.dactech.animalfarm.Duck " + index));
//        }

        List<Animal> ducks = DuckFactory.instance().create(4);
        farm.addAnimal(ducks);
        List<Animal> pigs = PigFactory.instance().create(5);
        farm.addAnimal(pigs);
        List<Animal> chickens = ChickenFactory.instance().create(5);
        farm.addAnimal(chickens);

//        for (int i = 0; i < duckTest.size(); i++){
//            duckTest.get(i).displayName();
//        }



    }
}