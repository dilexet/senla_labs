package com.senla.service.implementation;

import com.senla.entity.IProduct;
import com.senla.entity.IProductPart;
import com.senla.service.IAssemblyLine;
import com.senla.service.ILineStep;

public class AssemblyLineCars implements IAssemblyLine {
    private final ILineStep firstLineStep;
    private final ILineStep secondLineStep;
    private final ILineStep thirdLineStep;

    public AssemblyLineCars(ILineStep firstLineStep, ILineStep secondLineStep, ILineStep thirdLineStep){
        this.firstLineStep = firstLineStep;
        this.secondLineStep = secondLineStep;
        this.thirdLineStep = thirdLineStep;
    }

    @Override
    public IProduct assembleProduct(IProduct product) {
        IProductPart firstPart = firstLineStep.buildProductPart();
        IProductPart secondPart = secondLineStep.buildProductPart();
        IProductPart thirdPart = thirdLineStep.buildProductPart();
        product.installFirstPart(firstPart);
        product.installSecondPart(secondPart);
        product.installThirdPart(thirdPart);
        return product;
    }
}
