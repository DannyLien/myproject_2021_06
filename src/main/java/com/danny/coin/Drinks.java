package com.danny.coin;

public class Drinks {
    String id;
    String name;
    int price;

    public Drinks(String id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return id + ")" + name + "\t" + price;
    }
}
