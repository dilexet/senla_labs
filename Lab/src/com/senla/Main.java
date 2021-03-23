package com.senla;

import com.senla.entity.Flower;
import com.senla.entity.Rose;
import com.senla.entity.Tulip;
import com.senla.enums.Color;
import com.senla.entity.FlowerShop;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Flower> flowers = new ArrayList<>();
        try {
            flowers.add(new Rose(120, Color.RED));
            flowers.add(new Tulip(220, Color.BLUE));
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
        var bouquet = FlowerShop.getFlowerShop().createBouquet(flowers);
        System.out.println("Price bouquet = " + bouquet.getCost());
    }
}
