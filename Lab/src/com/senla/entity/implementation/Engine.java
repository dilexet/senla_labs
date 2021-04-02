package com.senla.entity.implementation;

import com.senla.entity.IProductPart;

public class Engine implements IProductPart {
    public Engine() {
        printInfo();
    }

    @Override
    public void printInfo() {
        System.out.println("Двигатель установлен, сир.");
    }
}
