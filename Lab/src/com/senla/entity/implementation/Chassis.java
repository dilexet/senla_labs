package com.senla.entity.implementation;

import com.senla.entity.IProductPart;

public class Chassis implements IProductPart {
    public Chassis() {
        printInfo();
    }

    @Override
    public void printInfo() {
        System.out.println("Шасси установлены, сир.");
    }
}
