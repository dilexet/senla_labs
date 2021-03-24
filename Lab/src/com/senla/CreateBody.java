package com.senla;

import com.senla.enums.PartType;
import com.senla.interfaces.ILineStep;
import com.senla.interfaces.IProductPart;

public class CreateBody implements ILineStep {
    @Override
    public IProductPart buildProductPart() {
        return new Part(PartType.BODY);
    }
}