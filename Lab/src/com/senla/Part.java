package com.senla;

import com.senla.enums.PartType;
import com.senla.interfaces.IProductPart;

public class Part implements IProductPart {
    private final PartType partType;

    public Part(PartType partType){
        this.partType = partType;
    }

    public PartType getPartType() {
        return partType;
    }
}
