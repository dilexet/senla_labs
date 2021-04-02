package com.senla.service.implementation;

import com.senla.entity.IProductPart;
import com.senla.entity.implementation.Engine;
import com.senla.service.ILineStep;

public class InstallationEngine implements ILineStep {
    @Override
    public IProductPart buildProductPart() {
        return new Engine();
    }
}
