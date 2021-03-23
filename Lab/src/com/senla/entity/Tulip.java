package com.senla.entity;

import com.senla.enums.Color;

public class Tulip extends Flower {
    public Tulip(double price, Color color) throws Exception {
        super(price, "Tulip", color);
    }
}
