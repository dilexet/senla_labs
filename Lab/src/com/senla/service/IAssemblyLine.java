package com.senla.service;

import com.senla.entity.IProduct;

public interface IAssemblyLine {
    IProduct assembleProduct(IProduct product);
}
