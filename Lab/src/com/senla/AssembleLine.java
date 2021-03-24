package com.senla;

import com.senla.interfaces.IAssemblyLine;
import com.senla.interfaces.IProduct;
import com.senla.interfaces.IProductPart;

public class AssembleLine implements IAssemblyLine {
    @Override
    public IProduct assembleProduct(IProduct product) {
        IProductPart body = new CreateBody().buildProductPart();
        product.installFirstPart(body);

        IProductPart chassis = new CreateChassis().buildProductPart();
        product.installSecondPart(chassis);

        IProductPart engine = new CreateEngine().buildProductPart();
        product.installThirdPart(engine);

        return new InstallationProduct(body, chassis, engine);
    }
}
