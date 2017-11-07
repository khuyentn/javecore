package com.dactech.animalfarm;

/**
 * Created by jaredchu on 11/7/17.
 */
public class Duck extends Animal {

    public String nameDuck;
    public Duck(String name){
        this.nameDuck = name;
    }

    public void displayName(){
        System.out.println(this.nameDuck);
    }
    @Override
    public String sound() {
        return "Quack";
    }
}
