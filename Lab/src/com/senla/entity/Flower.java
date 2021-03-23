package com.senla.entity;

import com.senla.enums.Color;

public abstract class Flower {
    private final double price;
    private final String name;
    private final Color color;

    public Flower(double price, String name, Color color) throws Exception {
        if (price < 0) {
            throw new Exception("price less than 0");
        }
        if (name == null || name.isEmpty()) {
            throw new Exception("Name of flower is empty");
        }
        if (color == null) {
            throw new Exception("Color of flower is null");
        }
        this.price = price;
        this.name = name;
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public Color getColor() {
        return color;
    }

    @Override
    public String toString(){
        return "\nName: " + name +
                "\nColor: " + color +
                "\nPrice: " + price;
    }
}
