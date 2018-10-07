package Instruments;

import Interfaces.ISell;

public abstract class Otheritems implements ISell {

    private String name;
    private double price;
    private double markup;
    private int quantity;


    public Otheritems(String name, double price, double markup, int quantity) {
        this.name = name;
        this.price = price;
        this.markup = markup;
        this.quantity = quantity;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


}
