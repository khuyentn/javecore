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

    public ArrayList<Duck> getDucks() {
        return (ArrayList<Duck>) ducks;
    }

    public void setDucks(Duck duck) {
        this.ducks.add(duck);
    }

    public List<Chicken> getChickens() {
        return chickens;
    }

    public void setChickens(Chicken chicken) {
        this.chickens.add(chicken);
    }

    public List<Pig> getPigs() {
        return pigs;
    }

    public void setPigs(Pig pig) {
        this.pigs.add(pig);
    }

    public void addDuck(List<Duck> ducks){
        this.ducks.addAll(ducks);
    }

    public void addChicken(List<Chicken> chickens){
        this.chickens.addAll(chickens);
    }

    public void addPig(List<Pig> pigs){
        this.pigs.addAll(pigs);
    }

    public void addAnimal(List<Animal> animals){
        for(int index = 0; index < animals.size(); index++){
            Object tmp = animals.get(index).getClass().getSimpleName();
            if (tmp.equals("Duck")){
                Duck duck = (Duck) animals.get(index);
                this.setDucks(duck);
            } else if (tmp.equals("Pig")){
                Pig pig = (Pig) animals.get(index);
                this.setPigs(pig);
            } else if(tmp.equals("Chicken")) {
                Chicken chicken = (Chicken) animals.get(index);
                this.setChickens(chicken);
            }
        }
    }


    public void removeDuck(List<Duck> ducks){
        this.ducks.removeAll(ducks);
    }
}
