package com.senla.entity.implementation;

import com.senla.entity.IProduct;
import com.senla.entity.IProductPart;

public class Car implements IProduct {
    IProductPart engine;
    IProductPart body;
    IProductPart chassis;

    @Override
    public void installFirstPart(IProductPart productPart) {
        engine = productPart;
    }

    @Override
    public void installSecondPart(IProductPart productPart) {
        body = productPart;
    }

    @Override
    public void installThirdPart(IProductPart productPart) {
        chassis = productPart;
    }
}
