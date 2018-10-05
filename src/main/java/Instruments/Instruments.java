package Instruments;

import Interfaces.IPlay;

public abstract class Instruments implements IPlay {

        private Family family;
        private String name;
        private double price;


    public Instruments(String name, double price, Family family) {
        this.name = name;
        this.price = price;
        this.family = family;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getFamily() {
        return family.getFamily();
    }
}
