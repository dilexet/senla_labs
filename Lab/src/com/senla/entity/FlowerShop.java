package com.senla.entity;

import java.util.ArrayList;
import java.util.List;

public class FlowerShop {
    private static FlowerShop flowerShop = null;
    public List<Bouquet> bouquets;

    private FlowerShop(){
        bouquets = new ArrayList<>();
    }

    public static FlowerShop getFlowerShop(){
        if (flowerShop == null) {
            flowerShop = new FlowerShop();
        }
        return flowerShop;
    }

    public Bouquet createBouquet(ArrayList<Flower> flowers) {
        var bouquet = new Bouquet();
        double cost = 0;
        for (var flower : flowers) {
            cost += flower.getPrice();
        }
        bouquet.getFlowers().addAll(flowers);
        bouquet.setCost(cost);
        bouquets.add(bouquet);
        return bouquet;
    }
}
