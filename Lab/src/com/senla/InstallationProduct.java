package com.senla;

import com.senla.interfaces.IProduct;
import com.senla.interfaces.IProductPart;

public class InstallationProduct implements IProduct {
    private final IProductPart body;
    private final IProductPart chassis;
    private final IProductPart engine;

    public InstallationProduct(IProductPart body, IProductPart chassis, IProductPart engine){
        this.body = body;
        this.chassis = chassis;
        this.engine = engine;
    }

    @Override
    public void installFirstPart(IProductPart productPart) {

    }

    @Override
    public void installSecondPart(IProductPart productPart) {

    }

    @Override
    public void installThirdPart(IProductPart productPart) {

    }

    public IProductPart getBody() {
        return body;
    }

    public IProductPart getEngine() {
        return engine;
    }

    public IProductPart getChassis() {
        return chassis;
    }
}
