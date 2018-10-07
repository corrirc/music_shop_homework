package Shops;

import Interfaces.ISell;

import java.util.ArrayList;

public class Shop {

    private String name;
    private ArrayList<ISell> stock;

    public Shop(String name) {
        this.name = name;
        this.stock = new ArrayList<>();
    }

    public int stockCount() {
        return this.stock.size();
    }

    public void add(ISell item){
        this.stock.add(item);
    }

    public void removeStock(ISell item) {
        this.stock.remove(item);

    }



}
