package com.techelevator.farm;

//DO NOT EXTEND FARM ANIMAL - TRACTORS ARE NOT FARM ANIMALS
public class Tractor implements FarmProperty {
    public String getName() {
        return "Tractor";
    }
    public void property() {

    }
    public String getSound() {
        return "Vroom";
    }

}
