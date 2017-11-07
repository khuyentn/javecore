package com.dactech.animalfarm.Factory;

import com.dactech.animalfarm.Animal;
import java.util.List;

public interface AnimalFactory {
    public List<Animal> create(int count);
}
