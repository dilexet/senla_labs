package com.senla.service.implementation;

import com.senla.entity.IProductPart;
import com.senla.entity.implementation.Body;
import com.senla.service.ILineStep;

public class InstallationBody implements ILineStep {
    @Override
    public IProductPart buildProductPart() {
        return new Body();
    }
}
