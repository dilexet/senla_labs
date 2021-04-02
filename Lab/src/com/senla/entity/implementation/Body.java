package com.senla.entity.implementation;

import com.senla.entity.IProductPart;

public class Body implements IProductPart {
    public Body() {
        printInfo();
    }

    @Override
    public void printInfo() {
        System.out.println("Кузов установлен, сир.");
    }
}
