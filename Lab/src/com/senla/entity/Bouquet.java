package com.senla.entity;

import java.util.ArrayList;
import java.util.List;

public class Bouquet {
    private final List<Flower> flowers;
    private double cost;

    public Bouquet() {
        flowers = new ArrayList<>();
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public List<Flower> getFlowers() {
        return flowers;
    }
}
