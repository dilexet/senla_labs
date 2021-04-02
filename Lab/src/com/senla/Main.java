package com.senla;

import com.senla.entity.IProduct;
import com.senla.entity.implementation.Car;
import com.senla.service.IAssemblyLine;
import com.senla.service.implementation.AssemblyLineCars;
import com.senla.service.implementation.InstallationBody;
import com.senla.service.implementation.InstallationChassis;
import com.senla.service.implementation.InstallationEngine;

public class Main {
    public static void main(String[] args) {
        IProduct car = new Car();
        IAssemblyLine assemblyLine = new AssemblyLineCars(new InstallationEngine(), new InstallationBody(), new InstallationChassis());
        assemblyLine.assembleProduct(car);
    }
}
