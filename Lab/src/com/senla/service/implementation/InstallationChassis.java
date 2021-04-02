package com.senla.service.implementation;

import com.senla.entity.IProductPart;
import com.senla.entity.implementation.Chassis;
import com.senla.service.ILineStep;

public class InstallationChassis implements ILineStep {
    @Override
    public IProductPart buildProductPart() {
        return new Chassis();
    }
}
