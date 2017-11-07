package com.dactech.animalfarm;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jaredchu on 11/7/17.
 */
public class Farm {
    protected String farmName;

    private List<Duck> ducks;
    private List<Chicken> chickens;
    private List<Pig> pigs;

    public static Farm builder(){
        Farm farm = new Farm();
        farm.farmName = "another new farm";
        return farm;
    }

    public List<Duck> getDucks() {
        return ducks;
    }

    public void setDucks(List<Duck> ducks) {
        this.ducks = ducks;
    }

    public List<Chicken> getChickens() {
        return chickens;
    }

    public void setChickens(List<Chicken> chickens) {
        this.chickens = chickens;
    }

    public List<Pig> getPigs() {
        return pigs;
    }

    public void setPigs(List<Pig> pigs) {
        this.pigs = pigs;
    }

    public void addDuck(Duck duck) { this.ducks.add(duck);}
    public void addPig(Pig pig) {
        this.pigs.add(pig);
    }
    public void addChicken(Chicken chicken) {
        this.chickens.add(chicken);
    }

    public void addAnimal(List<Animal> animals){
        for(int index = 0; index < animals.size(); index++){
            Object tmp = animals.get(index).getClass().getSimpleName();
            if (tmp.equals("Duck")){
                Duck duck = (Duck) animals.get(index);
                this.addDuck(duck);
            } else if (tmp.equals("Pig")){
                Pig pig = (Pig) animals.get(index);
                this.addPig(pig);
            } else if(tmp.equals("Chicken")) {
                Chicken chicken = (Chicken) animals.get(index);
                this.addChicken(chicken);
            }
        }
    }


    public void removeDuck(List<Duck> ducks){
        this.ducks.removeAll(ducks);
    }
}
