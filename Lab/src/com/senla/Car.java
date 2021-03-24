package com.senla;

import com.senla.interfaces.IAssemblyLine;
import com.senla.interfaces.IProduct;
import com.senla.interfaces.IProductPart;

public class Car implements IAssemblyLine {

    @Override
    public IProduct assembleProduct(IProduct product) {
        return null;
    }
}
